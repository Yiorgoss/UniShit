import pyspark

def clean_NASDAQ(line):
    try:
        fields = line.split(',')
        if len(fields)!=9:
            return False

        int(fields[2][:4])
        return True

    except:
        return False


def clean_companylist(line):
    try:
        fields = line.split('\t')
        if len(fields)!=5:
            return False

        return True

    except:
        return False

sc = pyspark.SparkContext()

nasdaq = sc.textFile("/data/NASDAQ")
nasdaq_f = nasdaq.filter(clean_NASDAQ).map(lambda l: l.split(","))
#We define company as the join key, values are year and volume
nasdaq_join = nasdaq_f.map(lambda f: (f[1], (int(f[2][:4]), int(f[7]))) )

company_list = sc.textFile("/data/companylist.tsv")
company_f = company_list.filter(clean_companylist).map(lambda f: f.split("\t"))
#in this dataset company is the join key, sector is the value
company_join = company_f.map(lambda f: (f[0],f[3]) )

#from the docs: returns a dataset of (K, (V, W)) pairs with all pairs of elements for each key.
#that is: (company, ( (year,volume), sector)
joined_data = nasdaq_join.join(company_join)

#we reshape it to prepare the grouping to ( (year,company), volume )
year_company = joined_data.map(lambda a: ( (a[1][0][0], a[1][1]), a[1][0][1]) )
totals = year_company.reduceByKey(lambda a,b: a+b)

totals.saveAsTextFile("total_sector_yr")

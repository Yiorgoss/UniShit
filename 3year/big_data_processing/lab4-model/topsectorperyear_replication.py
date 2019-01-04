"""Lab 4. Joins
Compute, for each year in the dataset, which sector had the highest number of combined operations. The output line must mention the year, name of the sector, and global aggregate of operations. In order to make the exercise more straightforward, we will only compute in the base part for each year, the total number of operations per company. Sample output (not based on the real data) would look similar to:
//Fields contains line as follows.
//   0         1           2      3                   4                   5                6             7                8
//exchange, stock_symbol, date, stock_price_open,stock_price_high,stock_price_low, stock_price_close, stock_volume,stock_price_adj_close.
NASDAQ,ABXA,2003-08-13,1.80,1.90,1.80,1.90,749400,1.90

Sector dataset format:
Symbol	Name	IPOyear	Sector	industry
  0      1       2        3       4
"""
from mrjob.job import MRJob
from mrjob.step import MRStep

class repl_stock_join(MRJob):

    sector_table = {}

    def mapper_join_init(self):
        # load companylist into a dictionary
        #its enough to run the job with --file input/companyist.tsv
        with open("companylist.tsv") as f:
            for line in f:
                fields = line.split("\t")
                key = fields[0]
                val = fields[3]
                self.sector_table[key] = val


    def mapper_repl_join(self, _, line):
        try:
            fields = line.split(',')
            company = fields[1]
            if company in self.sector_table:
                year = int(fields[2][:4]) #First 4 chars are the year
                volume = int(fields[7])
                key = (self.sector_table[company], year)
                yield (key, volume)
        except:
            pass


    def mapper_length(self, key, volume):
        yield(key, volume)


    def reducer_sum(self, key, volumes):
        total = sum(volumes)
        yield (key, total)

    def steps(self):
          return [MRStep(mapper_init=self.mapper_join_init,
                          mapper=self.mapper_repl_join),
                  MRStep(mapper=self.mapper_length,
                          reducer=self.reducer_sum)]

if __name__ == '__main__':
    repl_stock_join.run()

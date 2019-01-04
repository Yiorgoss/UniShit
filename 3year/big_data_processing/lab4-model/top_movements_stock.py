"""Lab 4. Joins
Compute the top 10 money amounts exchanged for a single company within a single day of the dataset
//Fields contains line as follows.
//   0         1           2      3                   4                   5                6             7                8
//exchange, stock_symbol, date, stock_price_open,stock_price_high,stock_price_low, stock_price_close, stock_volume,stock_price_adj_close.


"""
from mrjob.job import MRJob

class top_movements(MRJob):

    def mapper(self, _, line):
        try:
            #one mapper, we need to first differentiate among both types
            fields = line.split(',')
            if len(fields) == 9:
                #this should be a company sector line
                date = fields[2]
                amount = float(fields[7]) * float(fields[6])
                symbol = fields[1]
                yield (None, (date, symbol, amount))
        except :
            pass



    def combiner(self, _, values):
        sorted_values = sorted(values, reverse = True, key = lambda tup:tup[2])
        i = 0
        for value in sorted_values:
            yield ("top", value)
            i += 1
            if i >= 10:
                break


    def reducer(self, _, values):

        sorted_values = sorted(values, reverse = True, key = lambda tup:tup[2])
        i = 0
        for value in sorted_values:
            yield ("{} - {} - {}".format(value[0],value[1],value[2]),None)

            i += 1
            if i >= 10:
                break


if __name__ == '__main__':
    top_movements.run()

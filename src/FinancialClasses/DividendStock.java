//represents a stock purchase that also pays dividends

package FinancialClasses;

public class DividendStock extends Stock {
    private double dividends; //amount of dividends paid

    //constructs a new dividend stock with the given symbol
    //and no shares purchased
    public DividendStock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        dividends = 0.0;
    }

    //returns the DividendStock's market value, which is normal Stock's
    //market value plus any dividends
    public double getMarketValue() {
        return super.getMarketValue() + dividends;
    }

    //records a dividend of the given amount per share
    public void getDividend(double amountPerShare) {
        dividends += amountPerShare * getTotalShares();
    }


}

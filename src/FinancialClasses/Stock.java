//a stock object represents purchases of shares of a stock

package FinancialClasses;

public class Stock extends ShareAsset {
    private int totalShares;

    //constructs a new stock with the given symbol and current price/share
    public Stock(String symbol, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    //returns the market value of this stock, which is the
    //number of total shares times the share price
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    //getter: returns the total number of shares purchased
    public int getTotalShares() {
        return totalShares;
    }

    //records a purchase of the given number of shares
    //of stocks at the given price per share
    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}

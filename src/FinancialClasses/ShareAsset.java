//a general asset that has a symbol and holds shares

package FinancialClasses;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost, currentPrice;

    //constructs a new share asset with the given symbol
    //and current price
    public ShareAsset(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }

    //return the current market value of this asset
    //the children of shareAsset MUST implement the
    //getMarketValue method, unless the child itself
    //is an abstract class
    public abstract double getMarketValue();

    //returns the profit earnedz on shares of this asset
    public double getProfit() {
        return getMarketValue() - totalCost;
    }

    //returns the price per share of his asset
    public double getCurrentPrice() {
        return currentPrice;
    }

    //getter: returns this asset's total cost spent on all shares
    public double getTotalCost() {
        return totalCost;
    }

    //getter: returns the symbol of a specific shared asset
    public String getSymbol() {
        return symbol;
    }

    //setter: sets the current share price of this asset
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    //setter: adds the cost of a given amount to this asset
    public void addCost(double cost) {
        totalCost += cost;
    }
}

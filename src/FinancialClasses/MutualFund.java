package FinancialClasses;

public class MutualFund extends ShareAsset {
    private double totalShares;

    //constructs a new MutualFund investment with the given
    //symbol and price per share
    public MutualFund(String symbol, double currentPrice, double totalShares) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }

    public double getTotalShares() {
        return totalShares;
    }

    public void purchase(double shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);

    }
}

//represents financial assets that investors hold

package FinancialClasses;

public interface Asset {
    //how much the assets is worth
    public double getMarketValue();

    //how much money has been made on this asset
    public double getProfit();
}

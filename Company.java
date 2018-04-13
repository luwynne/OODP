
package products;

import java.util.ArrayList;


public class Company implements Companies{
    
    
    private String CompanyType;
    private double companyWallet;
    private int totalDepotProductsFromA;
    private int totalDepotProductsFromB;
    private int totalDepotProductsFromC;
    private double deliveryPrice;
    private double totalDeliveryExpenses;
    private final int totalDepots = 100;
    private ArrayList<Transaction> transactions;
    
    

    @Override
    public String getCompanyType() {
        return this.CompanyType;
    }

    @Override
    public double getCompanyWallet() {
        return this.companyWallet;
    }

    @Override
    public int getTotalDepotProductsFromA() {
       return this.totalDepotProductsFromA;
    }

    @Override
    public int getTotalDepotProductsFromB() {
        return this.totalDepotProductsFromB;
    }

    @Override
    public int getTotalDepotProductsFromC() {
        return this.totalDepotProductsFromC;
    }

    @Override
    public double getDeliveryPrice() {
        return this.deliveryPrice;
    }

    @Override
    public double getTotalDeliveryExpenses() {
        return this.totalDeliveryExpenses;
    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

   
  
    
    

    
    
    
}

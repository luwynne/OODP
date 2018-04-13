
package commercialtradesystem.OODP;

import java.util.ArrayList;


public class Company implements Companies{
    
    
    private String CompanyType;
    private double companyWallet = 0;
    private final int totalDepot = 100;
    private double deliveryPrice = 0;
    private double totalDeliveryExpenses = 0;
    private final int totalDepots = 100;
    private ArrayList<Transaction> transactions;
    //this has to be populated or commented before testing
    
    
    
    
   public Company(String CompanyType){
    
       this.CompanyType = CompanyType;
      
   
   }
    

    @Override
    public String getCompanyType() {
        return this.CompanyType;
    }

    @Override
    public double getCompanyWallet() {
        return this.companyWallet;
    }

    @Override
    public int getTotalDepot() {
       return this.totalDepot;
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
        //this has to be populated or commented before testing
    }


    
}

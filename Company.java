
package commercialtradesystem.OODP;

import java.util.ArrayList;


public class Company implements CompanyInterface{

    //default value of a company
    private String name;
    private double companyWallet = 0;
    private double totalDeliveryExpenses = 0;
    //this is ths company wallet after trading for comparison
    private int walletBeforeTrade; 
    private int walletAfterTrade; 



    
    private ArrayList<DepotInterface> ArrayListDepot; //depots of a company

    private ArrayList<Transaction> ListOfTransactions= new ArrayList<>(); //transactions of a company


   public Company(String name, ArrayList<DepotInterface> list){

       this.name = name;
       this.ArrayListDepot=list;
       
       setWaletBeforeTrade();//setting up the wallet when starting the class

   }

    @Override
   public ArrayList<DepotInterface> getArrayListDepot() {
        return ArrayListDepot;
    }


    @Override
    public String getCompanyType() {
        return this.name;
    }

    @Override
    public double getCompanyWallet() {
        return this.companyWallet;
    }


    @Override
    public double getTotalDeliveryExpenses() {
        return this.totalDeliveryExpenses;
    }

    public void setCompanyWallet(double companyWallet) {
        this.companyWallet = companyWallet;
    }

    public void setTotalDeliveryExpenses(double totalDeliveryExpenses) {
        this.totalDeliveryExpenses = totalDeliveryExpenses;
    }

    @Override
     public ArrayList<Transaction> getListOfTransactions() {
        return ListOfTransactions;
    }

    @Override
    public void addListOfTransactions(ArrayList<Transaction> ListOfTransactions) {
        this.ListOfTransactions.addAll(ListOfTransactions);
    }

    //giving a new value to the wallet before trading 
    @Override
    public void setWaletBeforeTrade() {
        
       for(DepotInterface eachdepotinterfaceitem: ArrayListDepot){
           this.walletBeforeTrade += eachdepotinterfaceitem.getDepotWallet();
       }
        
    }

    //giving a new value to the wallet after the trade for a comparison matter
    @Override
    public void setWaletAfterTrade() {
        for(DepotInterface eachdepotinterfaceitem: ArrayListDepot){
           this.walletAfterTrade += eachdepotinterfaceitem.getDepotWallet();
       }
    }
    
    @Override
    public String toString(){ //returning as a string the wallets after and before the transactions
        return "Company "+this.name+" Wallet before trade "+ this.walletBeforeTrade +" Wallet after trade "+ this.walletAfterTrade ; 
    }

}

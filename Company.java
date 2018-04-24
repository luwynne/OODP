
package commercialtradesystem.OODP;

import java.util.ArrayList;


public class Company implements CompanyInterface{


    private String name;
    private double companyWallet = 0;


//    private double deliveryPrice = 0;
    private double totalDeliveryExpenses = 0;



    //private ArrayList<Transaction> transactions;
    //this has to be populated or commented before testing
    private ArrayList<DepotInterface> ArrayListDepot;

    private ArrayList<Transaction> ListOfTransactions= new ArrayList<>();








   public Company(String name, ArrayList<DepotInterface> list){

       this.name = name;
       this.ArrayListDepot=list;

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
    //@Override
//    public ArrayList<Transaction> getTransactions() {
//        return this.transactions;
        //this has to be populated or commented before testing
    //}



}


package commercialtradesystem.OODP;

import java.util.ArrayList;


public class Company implements CompanyInterface{

    //default properties of a company
    private String name;
    private double companyWallet = 0;
    private double totalDeliveryExpenses = 0;

    private int walletBeforeTrade;  //this is ths company wallet after trading for comparison
    private int walletAfterTrade;
    private int totalProductsBuyInA;
    private int totalProductsBuyInB;
    private int totalProductsBuyInC;
    private ArrayList<DepotInterface> ArrayListDepot; //depots of a company
    private ArrayList<Transaction> ListOfTransactions= new ArrayList<>(); //transactions of a company
    private int totalSpendInA=0;
    private int totalSpendInB=0;
    private int totalSpendInC=0;
    
    private int totalSpendDeliverA=0;
    private int totalSpendDeliverB=0;
    private int totalSpendDeliverC=0;
    

    



   public Company(String name, ArrayList<DepotInterface> list){

       this.name = name;
       this.ArrayListDepot=list;

       setWaletBeforeTrade(); //setting up the wallet when starting the class

   }

 /**
 * Returns an ArrayList of the depots of company
 * @return ArrayListDepot (depots of company)
 */
   @Override
   public ArrayList<DepotInterface> getArrayListDepot() {
        return ArrayListDepot;
    }

   /**
   * Returns the name of the company
   * @return name (company name)
   */
    @Override
    public String getCompanyType() {
        return this.name;
    }

    /**
 * Returns the company wallet
 * @return companyWallet (company cash)
 */
    @Override
    public double getCompanyWallet() {
        return this.companyWallet;
    }

/**
 * Returns the total amount of expenses of the company in delivery from every depot
 * @return totalDeliveryExpenses  (sun of all the delivery expenses)
 */
    @Override
    public double getTotalDeliveryExpenses() {
        return this.totalDeliveryExpenses;
    }

    /**
     * Assigns value to company wallet
     * @param companyWallet (company cash)
     */
    public void setCompanyWallet(double companyWallet) {
        this.companyWallet = companyWallet;
    }

    /**
     * Sets up total amount for delivery expenses of company
     * Information comes from all the depots
     * @param totalDeliveryExpenses (sun of all the delivery expenses)
     */
    public void setTotalDeliveryExpenses(double totalDeliveryExpenses) {
        this.totalDeliveryExpenses = totalDeliveryExpenses;
    }

    /**
     * Returns an ArrayList with the transactions made by the company
     * @return ListOfTransactions (Transactions on an ArrayList format)
     */
    @Override
     public ArrayList<Transaction> getListOfTransactions() {
        return ListOfTransactions;
    }

    /**
     * Receives an ArrayList with transactions made by company's depots
     * adds those elements to another ArrayList storing the company's transactions
     * @param ListOfTransactions (Returns the new ArrayList of transactions)
     */
    @Override
    public void addListOfTransactions(ArrayList<Transaction> ListOfTransactions) {
        this.ListOfTransactions.addAll(ListOfTransactions);
    }

    /**
     * Updates the company wallet before the transactions are made
     */
    @Override
    public void setWaletBeforeTrade() { //giving a new value to the wallet before trading

       for(DepotInterface eachdepotinterfaceitem: ArrayListDepot){
           this.walletBeforeTrade += eachdepotinterfaceitem.getDepotWallet();
       }

    }


    /**
     * Updates the company wallet after the transactions are made
     * this information is useful when figuring out the companies total final wallet amount
     * for a comparison matter
     */
    @Override
    public void setWaletAfterTrade() { //giving a new value to the wallet after the trade for a comparison matter
        for(DepotInterface eachdepotinterfaceitem: ArrayListDepot){
           this.walletAfterTrade += eachdepotinterfaceitem.getDepotWallet();
       }
    }

    /**
     *
     * Returns as a string the wallets after and before the transactions
     * @return name, walletBeforeTrade, walletAfterTrade
     */
    @Override //giving a new value to the wallet after the trade for a comparison matter
    public String toString(){ //
        return "Company "+this.name+" Wallet before trade "+ this.walletBeforeTrade +" Wallet after trade "+ this.walletAfterTrade ;
    }

    @Override
    public int getWalletBeforeTrade() {
        return walletBeforeTrade;
    }

    public int getTotalProductsBuyInA() {
        return totalProductsBuyInA;
    }

    public void setTotalProductsBuyInA(int addProductsBuyInA) {
        this.totalProductsBuyInA += addProductsBuyInA;
    }

    public int getTotalProductsBuyInB() {
        return totalProductsBuyInB;
    }

    public void setTotalProductsBuyInB(int addProductsBuyInB) {
        this.totalProductsBuyInB += addProductsBuyInB;
    }

    public int getTotalProductsBuyInC() {
        return totalProductsBuyInC;
    }

    public void setTotalProductsBuyInC(int addProductsBuyInC) {
        this.totalProductsBuyInC += addProductsBuyInC;
    }
    
    public int getTotalSpendInA() {
        return totalSpendInA;
    }

    public void setTotalSpendInA(int totalSpendInA) {
        this.totalSpendInA += totalSpendInA;
    }

    public int getTotalSpendInB() {
        return totalSpendInB;
    }

    public void setTotalSpendInB(int totalSpendInB) {
        this.totalSpendInB += totalSpendInB;
    }

    public int getTotalSpendInC() {
        return totalSpendInC;
    }

    public void setTotalSpendInC(int totalSpendInC) {
        this.totalSpendInC += totalSpendInC;
    }

    public int getTotalSpendDeliverA() {
        return totalSpendDeliverA;
    }

    public void setTotalSpendDeliverA(int totalSpendDeliverA) {
        this.totalSpendDeliverA += totalSpendDeliverA;
    }

    public int getTotalSpendDeliverB() {
        return totalSpendDeliverB;
    }

    public void setTotalSpendDeliverB(int totalSpendDeliverB) {
        this.totalSpendDeliverB += totalSpendDeliverB;
    }

    public int getTotalSpendDeliverC() {
        return totalSpendDeliverC;
    }

    public void setTotalSpendDeliverC(int totalSpendDeliverC) {
        this.totalSpendDeliverC += totalSpendDeliverC;
    }
    
    
    @Override
    public int getWalletAfterTrade() {
        return walletAfterTrade;
    }

}

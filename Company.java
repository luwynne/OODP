
package commercialtradesystem.OODP;

import java.util.ArrayList;


/**
 * 
 * Interface that ensures the application of its methods on Company class
 * @author youseph
 * @version 1.0.0
 */
public class Company implements CompanyInterface{

    //default properties of a company
    private String name;
    private double companyWallet = 0;
    private double totalDeliveryExpenses = 0;

    private int walletBeforeTrade;  //this is ths company wallet after trading for comparison
    private int walletAfterTrade;
    private int totalProductsBuyInA=0;
    private int totalProductsBuyInB=0;
    private int totalProductsBuyInC=0;
    private ArrayList<DepotInterface> ArrayListDepot; //depots of a company
    private ArrayList<Transaction> ListOfTransactions= new ArrayList<>(); //transactions of a company
    private int totalSpendInA=0;
    private int totalSpendInB=0;
    private int totalSpendInC=0;
    
    private int totalSpendDeliverA=0;
    private int totalSpendDeliverB=0;
    private int totalSpendDeliverC=0;
    
    private int profit;

    
    

    



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
        
//        String print="";
//            print+="Company{ \n"; 
//            print+="Name = "+this.name+ "\n";
//            if(this.name.equals("A")){
//                print+="Total products sold for this company "+this.totalProductsBuyInA+ "\n";
//                print+="Total products bought of company B "+this.totalProductsBuyInB+ " Total paid for products "+this.totalSpendInB +" Total paid for delivery "+this.totalSpendDeliverB+" Total "+(this.totalSpendInB+this.totalSpendDeliverB)+"\n";
//                print+="Total products bought of company C "+this.totalProductsBuyInC+ " Total paid for products "+this.totalSpendInC +" Total paid for delivery "+this.totalSpendDeliverC+" Total "+(this.totalSpendInC+this.totalSpendDeliverC)+"\n";
//            }else if(this.name.equals("B")){
//                print+="Total products sold of this company "+this.totalProductsBuyInB+ "\n";
//                print+="Total products bought of company A "+this.totalProductsBuyInA+ " Total paid for products "+this.totalSpendInA +" Total paid for delivery "+this.totalSpendDeliverA+" Total "+(this.totalSpendInA+this.totalSpendDeliverA)+"\n";
//                print+="Total products bought of company C "+this.totalProductsBuyInC+ " Total paid for products "+this.totalSpendInC +" Total paid for delivery "+this.totalSpendDeliverC+" Total "+(this.totalSpendInC+this.totalSpendDeliverC)+"\n";
//            }else{
//                print+="Total products sold of this company "+this.totalProductsBuyInC+ "\n";
//                print+="Total products bought of company A "+this.totalProductsBuyInA+ " Total paid for products "+this.totalSpendInA +" Total paid for delivery "+this.totalSpendDeliverA+" Total "+(this.totalSpendInA+this.totalSpendDeliverA)+"\n";
//                print+="Total products bought of company B "+this.totalProductsBuyInB+ " Total paid for products "+this.totalSpendInB +" Total paid for delivery "+this.totalSpendDeliverB+" Total "+(this.totalSpendInB+this.totalSpendDeliverB)+"\n";
//            }
//            print+=" Wallet before trade "+ this.walletBeforeTrade +" Wallet after trade "+ this.walletAfterTrade +"\n";
//            
//            print+="}\n";
        return this.name;
        //return "Company "+this.name+" Wallet before trade "+ this.walletBeforeTrade +" Wallet after trade "+ this.walletAfterTrade ;
    }

    /**
     *
     * @return walletBeforeTrade Wallet before transaction
     */
    @Override
    public int getWalletBeforeTrade() {
        return walletBeforeTrade;
    }

    /**
     * 
     * @return totalProductsBuyInA products bought on A as trader
     */
    @Override
    public int getTotalProductsBuyInA() {
        return totalProductsBuyInA;
    }

    /**
     * Alters the number of products buy from A
     * @param addProductsBuyInA coming from the Facade
     */
    @Override
    public void increaseTotalProductsBuyInA(int addProductsBuyInA) {
        this.totalProductsBuyInA += addProductsBuyInA;
    }

    /**
     * 
     * @return totalProductsBuyInB products bought on B as trader
     */
    @Override
    public int getTotalProductsBuyInB() {
        return totalProductsBuyInB;
    }

    /**
     * Alters the number of products buy from B
     * @param addProductsBuyInB coming from the Facade
     */
    @Override
    public void increaseTotalProductsBuyInB(int addProductsBuyInB) {
        this.totalProductsBuyInB += addProductsBuyInB;
    }

    /**
     * 
     * @return totalProductsBuyInC products bought on A as trader
     */
    @Override
    public int getTotalProductsBuyInC() {
        return totalProductsBuyInC;
    }

    /**
     * Alters the number of products buy from C
     * @param addProductsBuyInC coming from the Facade
     */
    @Override
    public void increaseTotalProductsBuyInC(int addProductsBuyInC) {
        this.totalProductsBuyInC += addProductsBuyInC;
    }
    
    /**
     * Expenses in A
     * @return totalSpendInA total A expenses
     */
    @Override
    public int getTotalSpendInA() {
        return totalSpendInA;
    }

    /**
     * Setting total expenses in A
     * @param totalSpendInA coming from Facade
     */
    @Override
    public void increaseTotalSpendInA(int totalSpendInA) {
        this.totalSpendInA += totalSpendInA;
    }

    /**
     * Expenses in B
     * @return totalSpendInB total B expenses
     */
    @Override
    public int getTotalSpendInB() {
        return totalSpendInB;
    }

    /**
     * Setting total expenses in B
     * @param totalSpendInB coming from Facade
     */
    @Override
    public void increaseTotalSpendInB(int totalSpendInB) {
        this.totalSpendInB += totalSpendInB;
    }

    /**
     * Expenses in C
     * @return totalSpendInC total C expenses
     */
    @Override
    public int getTotalSpendInC() {
        return totalSpendInC;
    }

    /**
     * Setting total expenses in C
     * @param totalSpendInC coming from Facade
     */
    @Override
    public void increaseTotalSpendInC(int totalSpendInC) {
        this.totalSpendInC += totalSpendInC;
    }

    /**
     * Total depots delivery expenses from A
     * @return totalSpendDeliverA Delivery in A
     */
    @Override
    public int getTotalSpendDeliverA() {
        return totalSpendDeliverA;
    }

    /**
     * Updates the total delivery expense from A
     * @param totalSpendDeliverA coming from facade
     */
    @Override
    public void increaseTotalSpendDeliverA(int totalSpendDeliverA) {
        this.totalSpendDeliverA += totalSpendDeliverA;
    }

    /**
     * Total depots delivery expenses from B
     * @return totalSpendDeliverB Delivery in B
     */
    @Override
    public int getTotalSpendDeliverB() {
        return totalSpendDeliverB;
    }

    /**
     * updates the total delivery expense from B
     * @param totalSpendDeliverB coming from facade
     */
    @Override
    public void increaseTotalSpendDeliverB(int totalSpendDeliverB) {
        this.totalSpendDeliverB += totalSpendDeliverB;
    }

    /**
     * Total depots delivery expenses from C
     * @return totalSpendDeliverC Delivery in C
     */
    @Override
    public int getTotalSpendDeliverC() {
        return totalSpendDeliverC;
    }

    /**
     * updates the total delivery expense from C
     * @param totalSpendDeliverC coming from facade
     */
    @Override
    public void increaseTotalSpendDeliverC(int totalSpendDeliverC) {
        this.totalSpendDeliverC += totalSpendDeliverC;
    }
    
    
    @Override
    /**
     * @return walletAfterTrade
     * returning the wallet of company after trade
     */
    public int getWalletAfterTrade() {
        return walletAfterTrade;
    }
    
    @Override
    public int getProfit() {
        calculateProfit();
        return profit;
    }

    @Override
    public void calculateProfit() {
        this.profit = walletAfterTrade-walletBeforeTrade;
    }

}

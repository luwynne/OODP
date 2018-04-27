
package commercialtradesystem.OODP;

import java.util.ArrayList;


public class Depot implements DepotInterface{

    //default values that each of the depots will haves    
    int depotId;
    private ArrayList<Products> productsFromA = new ArrayList<>();
    private ArrayList<Products> productsFromB = new ArrayList<>();
    private ArrayList<Products> productsFromC = new ArrayList<>();
    private ArrayList<Transaction> listOfTransactions = new ArrayList<>();
    private int depotWallet;
    private final int deliveryPrice;

 /**
  * Constructor of Company class
  * @param A (depots from a)
  * @param B (depots from b)
  * @param C (depots from C)
  * @param int deliveryPrice (depot's delivery price)
  * @param int cash (depot cash)
 */
    Depot(int id,ArrayList<Products> A, ArrayList<Products> B,ArrayList<Products> C,int deliveryPrice, int cash) {
        
        this.depotId=id;
        this.productsFromA=A;
        this.productsFromB=B;
        this.productsFromC=C;
        this.deliveryPrice=deliveryPrice;
        this.depotWallet=cash;
    }
    
    
    

/**
  * Returns depot if of the company
  * @return depotId (depot name)
 */
    @Override //getters and setter for each of the class properties
    public int getDepotId() {
        return this.depotId;
    }

 /**
  * Adds products from company A to an ArrayList of products
  * @param Newproduct (Object)
 */ 
    @Override
    public void buyProductsFromA(Products Newproduct) {
        this.productsFromA.add(Newproduct);
    }

 /**
  * Adds products from company B to an ArrayList of products
  * @param Newproduct (object)
 */
    @Override
    public void buyProductsFromB(Products Newproduct) {
        this.productsFromB.add(Newproduct);
    }

  /**
  * Adds products from company C to an ArrayList of products
  * @param Newproduct (object)
 */
    @Override
    public void buyProductsFromC(Products Newproduct) {
        this.productsFromC.add(Newproduct);
    }


 /**
  * Returns a list of products from company A
  * @return productsFromA (as an ArrayList)
 */
    @Override
    public ArrayList<Products> getProductsA() {
        return this.productsFromA;
    }

 /**
  * Returns a list of products from company B
  * @return productsFromB (as an ArrayList)
 */
    @Override
    public ArrayList getProductsB() {
        return this.productsFromB;
    }

 /**
  * Returns a list of products from company C
  * @return productsFromC (as an ArrayList)
 */
    @Override
    public ArrayList getProductsC() {
        return this.productsFromC;
    }

 /**
  * Performs sale of a products from company A
  * subtract the products sold from the amount of products
  * @return List products with amount updated
 */
    @Override
    public Products sellProductsA() {
        return this.productsFromA.remove((this.productsFromA.size()-1));
    }

    
  /**
  * Performs sale of a products from company B
  * subtract the products sold from the amount of products
  * @return List products with amount updated
 */
    @Override
    public Products sellProductsB() {
        return this.productsFromB.remove((this.productsFromB.size()-1));
    }

 /**
  * Performs sale of a products from company C
  * subtract the products sold from the amount of products
  * @return List products with amount updated
 */
    @Override
    public Products sellProductsC() {
        return this.productsFromC.remove((this.productsFromC.size()-1));
    }


   /**
  * Updates the depot wallet that has sold a products
  * @param money (old depot cash to be updated)
 */ 
    @Override
    public void setDepotWallet(int money){
        this.depotWallet += money;
    }

    
    /**
     * Returns the depot wallet
     * @return depotWallet (depot cash)
     */
    @Override
    public int getDepotWallet() {
        return this.depotWallet;
    }

    /**
     * Returns delivery price of the depot
     * @return deliveryPrice (depot delivery cash)
     */
    @Override
    public int getDeliveryPrice() {
        return this.deliveryPrice;
    }

    
    
    /**
     * Returns an ArrayList of transactions performed by that depot 
     * @return listOfTransactions (transactions from depot as ArrayList)
     */
    @Override
    public ArrayList<Transaction> getListOfTransactions() {
        return listOfTransactions;
    }

    /**
     * Adds q new transaction to a ArrayList that hold information
     * about the depot transactions
     * @param newTransaction (new transaction to be added to the list)
     */
    @Override
    public void addTransactions(Transaction newTransaction) {
        this.listOfTransactions.add(newTransaction);
    }

    /**
     * Returns string with depot sale information from each of the companies products including his company
     * This also returns the product price and delivery price of transaction and the current depot wallet 
     * @return depotId (depot name), productsFromA.size() (how many depots from A), productsFromB.size() (how many depots from B), productsFromC.size() (how many depots from C)
     * 
     */
    @Override
    public String toString() {
        return "Depot{" + "\n depotId = " + depotId + "\n productsFromA = " + productsFromA.size() + " Price = "+productsFromA.get(1)+ "\n productsFromB = " + productsFromB.size() + " Price = "+productsFromB.get(1)+ "\n productsFromC = " + productsFromC.size() + " Price = "+productsFromC.get(1)+"\n depotWallet = " + depotWallet + "\n deliveryPrice = " + deliveryPrice + "\n }";
    }




}


package commercialtradesystem.OODP;

import java.util.ArrayList;

/**
     * 
     *  
     * This ensures that the depot class assigns the required methods 
     */
public interface DepotInterface {
    
    //depot class interface

    
    public abstract int getDepotId();
    public ArrayList<Products> getProductsA();
    public ArrayList<Products> getProductsB();
    public ArrayList<Products> getProductsC();
    public int getDepotWallet();

   
    public void setDepotWallet(int money);
    public int getDeliveryPrice();
    public abstract Products sellProductsA();
    public abstract Products sellProductsB();
    public abstract Products sellProductsC();
    public void buyProductsFromA(Products newProduct);
    public void buyProductsFromB(Products newProduct);
    public void buyProductsFromC(Products newProduct);
    public ArrayList<Transaction> getListOfTransactions();
    public void addTransactions(Transaction newTransaction);
    
    public void increaseProductsBuyInA();
    public void increaseProductsBuyInB();
    public void increaseProductsBuyInC();
    
    public int getTotalProductsBuyInA(); 

    public int getTotalProductsBuyInB();

    public int getTotalProductsBuyInC();

}

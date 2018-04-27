
package commercialtradesystem.OODP;

import com.sun.xml.internal.bind.v2.TODO;
import java.util.ArrayList;


public class Depot implements DepotInterface{

    //default values that each of the depots will haves    
    int depotId;
    private ArrayList<Products> productsFromA = new ArrayList<>();
    private ArrayList<Products> productsFromB = new ArrayList<>();
    private ArrayList<Products> productsFromC = new ArrayList<>();
    private ArrayList<Transaction> listOfTransactions = new ArrayList<>();
    private int productsBuyInA = 0;
    private int productsBuyInB = 0;
    private int productsBuyInC = 0;
    private int depotWallet;
    private final int deliveryPrice;

    Depot(int id,ArrayList<Products> A, ArrayList<Products> B,ArrayList<Products> C,int deliveryPrice, int cash) {
        
        this.depotId=id;
        this.productsFromA=A;
        this.productsFromB=B;
        this.productsFromC=C;
        this.deliveryPrice=deliveryPrice;
        this.depotWallet=cash;
    }

   
    
    //getters and setter for each of the class properties


    @Override
    public int getDepotId() {
        return this.depotId;
    }

     @Override
    public void buyProductsFromA(Products Newproduct) {
        this.productsFromA.add(Newproduct);
    }

     @Override
    public void buyProductsFromB(Products Newproduct) {
        this.productsFromB.add(Newproduct);
    }

     @Override
    public void buyProductsFromC(Products Newproduct) {
        this.productsFromC.add(Newproduct);
    }


    @Override
    public ArrayList<Products> getProductsA() {
        return this.productsFromA;
    }

    @Override
    public ArrayList getProductsB() {
        return this.productsFromB;
    }

    @Override
    public ArrayList getProductsC() {
        return this.productsFromC;
    }

     @Override
    public Products sellProductsA() {
        return this.productsFromA.remove((this.productsFromA.size()-1));
    }

     @Override
    public Products sellProductsB() {
        return this.productsFromB.remove((this.productsFromB.size()-1));
    }

     @Override
    public Products sellProductsC() {
        return this.productsFromC.remove((this.productsFromC.size()-1));
    }


    @Override
    public void setDepotWallet(int money){
        this.depotWallet += money;
    }

    @Override
    public int getDepotWallet() {
        return this.depotWallet;
    }

    @Override
    public int getDeliveryPrice() {
        return this.deliveryPrice;
    }

    @Override
    public ArrayList<Transaction> getListOfTransactions() {
        return listOfTransactions;
    }

    @Override
    public void addTransactions(Transaction newTransaction) {
        this.listOfTransactions.add(newTransaction);
    }

    public int getTotalProductsBuyInA() {
        return productsBuyInA;
    }

    public int getTotalProductsBuyInB() {
        return productsBuyInB;
    }

    public int getTotalProductsBuyInC() {
        return productsBuyInC;
    }
    
    public void increaseProductsBuyInA() {
        this.productsBuyInA +=1;
    }

    public void increaseProductsBuyInB() {
        this.productsBuyInB +=1;
    }

    public void increaseProductsBuyInC() {
        this.productsBuyInC +=1;
    }
    
    

    @Override
    public String toString() {
        return "Depot{" + "\n depotId = " + depotId + "\n productsFromA = " + productsFromA.size() + " Price = "+productsFromA.get(1)+ "\n productsFromB = " + productsFromB.size() + " Price = "+productsFromB.get(1)+ "\n productsFromC = " + productsFromC.size() + " Price = "+productsFromC.get(1)+"\n depotWallet = " + depotWallet + "\n deliveryPrice = " + deliveryPrice + "\n }";
    }




}

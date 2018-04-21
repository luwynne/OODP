
package commercialtradesystem;

import com.sun.xml.internal.bind.v2.TODO;
import java.util.ArrayList;


public class Depot implements DepotInterface{

    int depotId;
//    String belongsTo;
    private ArrayList<Products> productsFromA = new ArrayList<>();
    private ArrayList<Products> productsFromB = new ArrayList<>();
    private ArrayList<Products> productsFromC = new ArrayList<>();
    private int depotWallet;
    private final int deliveryPrice;
    ArrayList<Integer> transactionList = new ArrayList<>();

    Depot(int id,ArrayList<Products> A, ArrayList<Products> B,ArrayList<Products> C,int deliveryPrice, int cash) {
        //this.belongsTo=a; //To change body of generated methods, choose Tools | Templates.
        this.depotId=id;
        this.productsFromA=A;
        this.productsFromB=B;
        this.productsFromC=C;
        this.deliveryPrice=deliveryPrice;
        this.depotWallet=cash;
    }
    
   
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
    public void setTransaction(ArrayList<Integer> transaction){
        
        this.transactionList.addAll(transaction);
        
        
    }

    @Override
    public ArrayList<Integer> getTransactions() {
        
        return this.transactionList;
        
    }
    
    


}

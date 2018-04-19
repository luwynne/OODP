
package commercialtradesystem.OODP;

import java.util.ArrayList;


public class Depot implements DepotInterface{

     int depotId;
//    String belongsTo;
    ArrayList<Products> productsFromA = new ArrayList<>();
    ArrayList<Products> productsFromB = new ArrayList<>();
    ArrayList<Products> productsFromC = new ArrayList<>();
    int depotWallet;
    int deliveryPrice;

    Depot(int id,ArrayList<Products> A, ArrayList<Products> B,ArrayList<Products> C,int deliveryPrice) {
        //this.belongsTo=a; //To change body of generated methods, choose Tools | Templates.
        this.depotId=id;
        this.productsFromA=A;
        this.productsFromB=B;
        this.productsFromC=C;
        this.deliveryPrice=deliveryPrice;
    }
    
   
    @Override
    public int getDepotId() {
        return this.depotId;
    }

    public void setProductsFromA(ArrayList<Products> productsFromA) {
        this.productsFromA = productsFromA;
    }

    public void setProductsFromB(ArrayList<Products> productsFromB) {
        this.productsFromB = productsFromB;
    }

    public void setProductsFromC(ArrayList<Products> productsFromC) {
        this.productsFromC = productsFromC;
    } 
    
//    public void setBelongsTo(String belongsTo){
//        this.belongsTo = belongsTo;
//    }
   
    
    @Override
    public String getBelongsTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
    public void setDepotWallet(int depotWallet){
        this.depotWallet = depotWallet;
    }
    
    @Override
    public double getDepotWallet() {
        return this.depotWallet;
    }

    @Override
    public int getDeliveryPrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.deliveryPrice;
    }
    
}

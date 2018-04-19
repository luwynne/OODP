
package commercialtradesystem.OODP;

import java.util.ArrayList;


public class Depot implements DepotInterface{

    final int depotId = 0;
    String belongsTo;
    ArrayList productsFromA = new ArrayList();
    ArrayList productsFromB = new ArrayList();
    ArrayList productsFromC = new ArrayList();
    double depotWallet;

    Depot(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    @Override
    public int getDepotId() {
        return this.depotId;
    }

    
    public void setBelongsTo(String belongsTo){
        this.belongsTo = belongsTo;
    }
   
    
    @Override
    public String getBelongsTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getProductsA() {
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

    
    public void setDepotWallet(double depotWallet){
        this.depotWallet = depotWallet;
    }
    
    @Override
    public double getDepotWallet() {
        return this.depotWallet;
    }

    @Override
    public int getDeliveryPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

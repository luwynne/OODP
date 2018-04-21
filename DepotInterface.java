
package commercialtradesystem.OODP;

import java.util.ArrayList;


public interface DepotInterface {
    
    public abstract int getDepotId();
    public String getBelongsTo();
    public ArrayList<Products> getProductsA();
    public ArrayList<Products> getProductsB();
    public ArrayList<Products> getProductsC();
    public int getDepotWallet();

    /**
     *
     * @param money
     */
    public void setDepotWallet(int money);
    public int getDeliveryPrice();
    public abstract Products sellProductsA();
    public abstract Products sellProductsB();
    public abstract Products sellProductsC();
    public void buyProductsFromA(Products newProduct);
    public void buyProductsFromB(Products newProduct);
    public void buyProductsFromC(Products newProduct);
    
    
}

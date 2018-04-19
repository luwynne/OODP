
package commercialtradesystem.OODP;

import java.util.ArrayList;


public interface DepotInterface {
    
    public abstract int getDepotId();
    public String getBelongsTo();
    public ArrayList getProductsA();
    public ArrayList getProductsB();
    public ArrayList getProductsC();
    public double getDepotWallet();
    public int getDeliveryPrice();
    
}

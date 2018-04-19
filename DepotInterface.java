
package commercialtradesystem.OODP;

import java.util.ArrayList;


public interface DepotInterface {
    
    public abstract int getDepotId();
    public String getBelongsTo();
    public ArrayList getProductsA();
    public ArrayList getProductsB();
    public ArrayList getProductsC();
    public double getDepotWallet();
    public final int minFrom = 15;
    public final int maxFrom = 50;
    public int getDeliveryPrice();
    
}

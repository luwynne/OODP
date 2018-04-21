
package commercialtradesystem;

import java.util.ArrayList;


public interface CompanyInterface {
    
    public abstract String getCompanyType();
    public abstract double getCompanyWallet();
    //public abstract double getDeliveryPrice();
    public abstract double getTotalDeliveryExpenses();
    public abstract ArrayList<DepotInterface> getArrayListDepot();
    
   

    
}

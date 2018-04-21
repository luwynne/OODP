
package commercialtradesystem.OODP;

import java.util.ArrayList;


public interface CompanyInterface {
    
    public abstract String getCompanyType();
    public abstract double getCompanyWallet();
    //public abstract double getDeliveryPrice();
    public abstract double getTotalDeliveryExpenses();
    public abstract ArrayList<DepotInterface> getArrayListDepot();
    //public abstract ArrayList<Transaction> getTransactions();//this has to be populated or commented before testing
   

    
}

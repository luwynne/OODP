
package commercialtradesystem.OODP;

import java.util.ArrayList;


public interface Companies {
    
    public abstract String getCompanyType();
    public abstract double getCompanyWallet();
    public abstract int getTotalDepot();
    public abstract double getDeliveryPrice();
    public abstract double getTotalDeliveryExpenses();
    final int totalDepots = 100;
    public abstract ArrayList<Transaction> getTransactions();//this has to be populated or commented before testing
    

    
}

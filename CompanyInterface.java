
package commercialtradesystem.OODP;

import java.util.ArrayList;


public interface CompanyInterface {
    
    //interface for Company class

    public String getCompanyType();
    public double getCompanyWallet();
    public double getTotalDeliveryExpenses();
    public ArrayList<DepotInterface> getArrayListDepot();
    public ArrayList<Transaction> getListOfTransactions();
    public void addListOfTransactions(ArrayList<Transaction> ListOfTransactions);
     
    public void setWaletBeforeTrade();
    public void setWaletAfterTrade();
    



}

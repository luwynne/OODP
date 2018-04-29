
package commercialtradesystem.OODP;

import java.util.ArrayList;


/**
 * 
 * Ensures that the following methods are implemented when creating a new company
 */
public interface CompanyInterface {
    
    //interface for Company class

 /**
  * Interface for Company class
  * Ensures that the following methods are implemented when creating a new company
  * @return list of method to be used on Company Class
 */
    public String getCompanyType();
    public double getCompanyWallet();
    public double getTotalDeliveryExpenses();
    public ArrayList<DepotInterface> getArrayListDepot();
    public ArrayList<Transaction> getListOfTransactions();
    public void addListOfTransactions(ArrayList<Transaction> ListOfTransactions);
    public void setWaletBeforeTrade();
    public void setWaletAfterTrade();
    
    public int getWalletBeforeTrade();
    public int getWalletAfterTrade();
    
    public int getTotalProductsBuyInA() ;

    public void increaseTotalProductsBuyInA(int addProductsBuyInA);

    public int getTotalProductsBuyInB();

    public void increaseTotalProductsBuyInB(int addProductsBuyInB);

    public int getTotalProductsBuyInC() ;

    public void increaseTotalProductsBuyInC(int addProductsBuyInC);
    
     public int getTotalSpendInA();

    public void increaseTotalSpendInA(int totalSpendInA) ;

    public int getTotalSpendInB() ;

    public void increaseTotalSpendInB(int totalSpendInB) ;

    public int getTotalSpendInC();

    public void increaseTotalSpendInC(int totalSpendInC);
    
     public int getTotalSpendDeliverA();

    public void increaseTotalSpendDeliverA(int totalSpendDeliverA); 

    public int getTotalSpendDeliverB();

    public void increaseTotalSpendDeliverB(int totalSpendDeliverB); 

    public int getTotalSpendDeliverC();

    public void increaseTotalSpendDeliverC(int totalSpendDeliverC); 
    
    public int getProfit();
    
    public void calculateProfit();
    
    
    



}

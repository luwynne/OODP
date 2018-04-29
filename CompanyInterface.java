
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

    public void setTotalProductsBuyInA(int addProductsBuyInA);

    public int getTotalProductsBuyInB();

    public void setTotalProductsBuyInB(int addProductsBuyInB);

    public int getTotalProductsBuyInC() ;

    public void setTotalProductsBuyInC(int addProductsBuyInC);
    
     public int getTotalSpendInA();

    public void setTotalSpendInA(int totalSpendInA) ;

    public int getTotalSpendInB() ;

    public void setTotalSpendInB(int totalSpendInB) ;

    public int getTotalSpendInC();

    public void setTotalSpendInC(int totalSpendInC);
    
     public int getTotalSpendDeliverA();

    public void setTotalSpendDeliverA(int totalSpendDeliverA); 

    public int getTotalSpendDeliverB();

    public void setTotalSpendDeliverB(int totalSpendDeliverB); 

    public int getTotalSpendDeliverC();

    public void setTotalSpendDeliverC(int totalSpendDeliverC); 
    
    
    



}

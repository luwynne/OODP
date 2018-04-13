
package products;

import java.util.ArrayList;


public interface Companies {
    
    public abstract String getCompanyType();
    public abstract double getCompanyWallet();
    public abstract int getTotalDepotProductsFromA();
    public abstract int getTotalDepotProductsFromB();
    public abstract int getTotalDepotProductsFromC();
    public abstract double getDeliveryPrice();
    public abstract double getTotalDeliveryExpenses();
    final int totalDepots = 100;
    public abstract ArrayList<Transaction> getTransactions();
    

    
}

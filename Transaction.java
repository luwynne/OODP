
package commercialtradesystem.OODP;


/**
 * 
 * Class responsible for the register of transactions performed in the system
 * @author yoseph
 * @version 1.0.0
 */
class Transaction {
    static int TransactionCounter=1;
    int transactionID;
    String buyer;
    String seller;
    String productTrade;
    int productPrice;
    int deliveryPrice;

    /**
     * Transaction class constructor
     * This receives the buyer, seller, productsTrade, productPrice and deliveryPrice as parameters
     * Performs an storage of transactions as a recept of trading
     * @param buyer, seller, productTrade, productPrice, deliveryPrice 
     */
    public Transaction(String buyer, String seller, String productTrade, int productPrice, int deliveryPrice) {
        this.transactionID=TransactionCounter;
        TransactionCounter++;
        this.buyer = buyer;
        this.seller = seller;
        this.productTrade = productTrade;
        this.productPrice = productPrice;
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    /**
     * Converts to string all the information about the transaction as a recept format
     * @return transactionID, buyer, seller, productTrade, productPrice, deliveryPrice+productPrice
     */
    public String toString() {
        String print="";
            print+="Transaction{ \n"; 
            print+="TransactionID = "+transactionID+ "\n";
            print+="Buyer = "+buyer+ "\n";
            print+="Seller = "+seller+ "\n";
            print+="Price = "+productPrice+ "\n";
            print+="Delivery Price = "+deliveryPrice+ "\n";
            print+="Total = "+(productPrice+deliveryPrice)+"\n";
            print+="}\n";
        return print;
    }
    
}
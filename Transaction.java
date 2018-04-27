
package commercialtradesystem.OODP;


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
        return "Transaction{"+"transactionID= " + transactionID + ", buyer= " + buyer + ", seller= " + seller + ", productTrade= " + productTrade + ", productPrice= " + productPrice + ", deliveryPrice= " + deliveryPrice + ", Total= " + (deliveryPrice+productPrice) + '}';
    }
    
}
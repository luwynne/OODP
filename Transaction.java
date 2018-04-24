package commercialtradesystem.OODP;


class Transaction {
    static int TransactionCounter=1;
    int transactionID;
    String buyer;
    String seller;
    String productTrade;
    int productPrice;
    int deliveryPrice;

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
    public String toString() {
        return "Transaction{"+"transactionID= " + transactionID + ", buyer= " + buyer + ", seller= " + seller + ", productTrade= " + productTrade + ", productPrice= " + productPrice + ", deliveryPrice= " + deliveryPrice + ", Total= " + (deliveryPrice+productPrice) + '}';
    }
    
    
}

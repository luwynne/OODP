<<<<<<< HEAD
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
    
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem;

/**
 *
 * @author mynahone0
 */
class Transaction {
>>>>>>> 13d174c285d0b03c62116473ce5ce5fe35102abf
    
}

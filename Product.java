package commercialtradesystem.OODP;

/**
 * Products class
 * Implements the Products interface
 * @author yoseph
 * @version 1.0.0
 */
public class Product implements  Products{

    int price=0;
    final String name;

    /**
     * Products class constructor
     * The instantiation has to pass the price and name of the product when a new one is created
     * @param price (product price)
     * @param name (product name)
     */
    public Product(int price, String name){

        this.price = price;
        this.name = name;

    }


    /**
     * Gets the name of the product
     * @return name (product name)
     */
    @Override
    public String getName() {

        return this.name;

    }

    /**
     * Returns the price of the product
     * @return price (product price)
     */
    @Override
    public int getPrice() {

        return this.price;

    }


    /**
     * Returns the price of the products as a string
     * @return price (product price)
     */
    @Override
    public String toString(){
        return Integer.toString(this.price);
    }



}

package commercialtradesystem.OODP;




import java.util.ArrayList;
import java.util.Random;


/**
 * Responsible for creating Products
 * @author lwynne
 * @version 1.0.0
 * 
 */
public class ProductFactory {


    static int maxPrice = 10;
    static int minPrice = 1;
    static int maxProducOwner =50;
    static int minProducOwner =15;
    static int minProducOthers =3;
    static int maxProducOthers =40;


    /**
     * Creates products and according to which company it belongs assigns max and mix amount of products to an ArrayList
     * Holding those products
     * @param productName (product name)
     * @param owner (what company it belongs to)
     * @return listOfProductsX (ArrayList of products)
     */
    public ArrayList<Products> getProduct(String productName,boolean owner){
        ArrayList<Products> listOfProductsX = new ArrayList<>();
        int numberOfProducts=0;

        //depending on the its company owner, the products will assign different numbers of min and max
        //amount of products
        switch(productName){
               case "A":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }
                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

                case "B":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }

                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

                case "C":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }

                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

           }
           return listOfProductsX;

    }
    

    /**
     * This function is performed in the function above as a creator of new lists of products 
     * Loops over the ArrayList of products and assigns a company and random product cost
     * @param cost (new product price)
     * @param numberOfProducts (amount of products)
     * @param company (what company)
     * @return list (list of products)
     */
    public static ArrayList<Products> createListProductsX(int cost, int numberOfProducts,String company) {
        //creating an arraylist of products
        ArrayList<Products> list = new ArrayList<>();
        for (int i=0;i<numberOfProducts;i++){
            list.add(new Product(cost, company));
        }
        return list;
    }

    
    /**
     * Generates new random number between the min and max
     * @param max (for random use)
     * @param min (for random use)
     * @return randNumber (generated)
     */
    public static int getRandom(int max, int min){ //getting random min and max

        int randNumber;
        Random rand = new Random();
        return  randNumber = rand.nextInt((max-min)+1)+min;
    }



}

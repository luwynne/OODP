
package commercialtradesystem.OODP;

import java.util.ArrayList;
import java.util.Random;


/**
 * Responsible for building depots
 * 
 */
public class DepotFactory {
    int minDeliveryPrice=1;
    int maxDeliveryPrice=10;
    int minCash = 50;
    int maxCash =100;

    /**
     * Method that calls the creator of companies and assigns the boolean arguments depend on which company it belongs to
     * @param belongsTo (company the depot belongs to)
     * @return createDepots() method
     */
    public  ArrayList<DepotInterface> getDepot(String belongsTo){
        
        //creating 3 companies
        //depending on which company we are creating we set up the amount of products from each  of the companies 
        if("A".equalsIgnoreCase(belongsTo)){

            return createDepots(true,false,false);

        }if("B".equalsIgnoreCase(belongsTo)){

            return createDepots(false,true,false);

        }if("C".equalsIgnoreCase(belongsTo)){

            return createDepots(false,false,true);
        }

        return null;

    }

    /**
     * This method receives the flags from the previous method and instantiates the depot factory to create the depots
     * Returns a list of depots added
     * @param flag1 (boolean)
     * @param flag2 (boolean)
     * @param flag3 (boolean)
     * @return list (ArrayList)
     */
    public ArrayList<DepotInterface> createDepots(boolean flag1, boolean flag2,boolean flag3){
        //creating a list of depots and instance for the products factory
        ArrayList<DepotInterface> list = new ArrayList<>();
        ProductFactory factory = new ProductFactory();

        //creating the depot and assigning ramdom values for each
        for(int i=1;i<=100;i++){
            list.add(new Depot(i,factory.getProduct("A",flag1),factory.getProduct("B",flag2),factory.getProduct("C",flag3),getRandom(maxDeliveryPrice,minDeliveryPrice),getRandom(maxCash,minCash)));

        }
        return list;
    }

    /**
     * Generates random number inside the function
     * @param max (to be used by random)
     * @param min (to be used by random)
     * @return randNumber (between min and max)
     */
    public static int getRandom(int max, int min){
        
        //min and max working in function with the random function
        int randNumber;
        Random rand = new Random();
        return  randNumber = rand.nextInt((max-min)+1)+min;
    }



}

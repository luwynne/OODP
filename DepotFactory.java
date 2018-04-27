
package commercialtradesystem.OODP;

import java.util.ArrayList;
import java.util.Random;


public class DepotFactory {
    int minDeliveryPrice=1;
    int maxDeliveryPrice=10;
    int minCash = 50;
    int maxCash =100;

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

    public static int getRandom(int max, int min){
        
        //min and max working in function with the random function
        int randNumber;
        Random rand = new Random();
        return  randNumber = rand.nextInt((max-min)+1)+min;
    }



}

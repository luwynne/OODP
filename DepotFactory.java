
package commercialtradesystem.OODP;

import java.util.ArrayList;
import java.util.Random;


public class DepotFactory {
    int minDeliveryPrice=1;
    int maxDeliveryPrice=10;
    
    public  ArrayList<DepotInterface> getDepot(String belongsTo){
        
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
        ArrayList<DepotInterface> list = new ArrayList<>();
        ProductFactory factory = new ProductFactory();
        
       
        for(int i=1;i<=100;i++){
            list.add(new Depot(i,factory.getProduct("A",flag1),factory.getProduct("B",flag2),factory.getProduct("C",flag3),getRandom(maxDeliveryPrice,minDeliveryPrice)));
            
        }
        return list;
    }
    
    public static int getRandom(int max, int min){

        int price;
        Random rand = new Random();
        return  price = rand.nextInt((max-min)+1)+min;
    }
    
    
    
}

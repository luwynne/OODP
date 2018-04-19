
package commercialtradesystem.OODP;


public class DepotFactory {
    
    public static Depot getDepot(String belongsTo){
        
        if("A".equalsIgnoreCase(belongsTo)){
            //get depot id;
            //get the products form other companie's depots
            //something else
            return new Depot("A");
            
        }if("B".equalsIgnoreCase(belongsTo)){
             //get depot id;
            //get the products form other companie's depots
            //something else
            return new Depot("B");
            
        }if("C".equalsIgnoreCase(belongsTo)){
            //get depot id;
            //get the products form other companie's depots
            //something else
            return new Depot("C");
        }
        
        return null;
        
    }
    
    
    
}

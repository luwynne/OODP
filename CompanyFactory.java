
package commercialtradesystem.OODP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CompanyFactory{
    
    
    
    public static Company getCompany(String CompanyType){
        
        if("A".equalsIgnoreCase(CompanyType)){
            
            return new Company("A");
        
        }else if("B".equalsIgnoreCase(CompanyType)){
            
            return new Company("B");
            
        }else{
            
            return new Company("C");
            
        }
        
        
       
    }
    
    
    
    
    
    
}

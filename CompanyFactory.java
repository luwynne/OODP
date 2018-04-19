
package commercialtradesystem.OODP;


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

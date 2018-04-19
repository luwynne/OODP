/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;

import java.util.ArrayList;

/**
 *
 * @author mynahone0
 */
public class testingCompany {
    
    
    public static void main(String[] args) {
   
                                           
    CompanyFactory compa = new CompanyFactory();
    
    ArrayList<CompanyInterface> co= compa.getCompany();
    
        for(CompanyInterface tempComp : co){
            System.out.println(tempComp.getCompanyType());
            //System.out.println(tempComp.getArrayListDepot());
            
            for(DepotInterface  eachDepot: tempComp.getArrayListDepot()){
                System.out.println("Depot Id"+eachDepot.getDepotId());
            System.out.println("Number of A "+eachDepot.getProductsA().size()+" Price "+eachDepot.getProductsA().get(1));
            System.out.println("Number of B "+eachDepot.getProductsB().size()+" Price "+eachDepot.getProductsB().get(1));
            System.out.println("Number of C "+eachDepot.getProductsC().size()+" Price "+eachDepot.getProductsC().get(1));
            System.out.println("Delivery price "+eachDepot.getDeliveryPrice());
            System.out.println("---------------------------");
            }
            
            System.out.println("*********************************************");
            
        }
    
    }

    
   
    
}

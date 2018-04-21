package commercialtradesystem;

import java.util.ArrayList;

public class testProducts {
    
    //ProductFactory factory = new ProductFactory();
    
    public static void main(String[] args) {
//        ProductFactory factory = new ProductFactory();
//        ArrayList<Products> listProductsA= null;
//        ArrayList<Products> listProductsB= null;
//        ArrayList<Products> listProductsC= null;
//
//
//        listProductsA=factory.getProduct("A",true);
//        System.out.println(listProductsA.size());
//
//        System.out.println("--------------------------");
//
//        listProductsB=factory.getProduct("B",false);
//        System.out.println(listProductsB.size());
//
//        System.out.println("--------------------------");
//
//        listProductsC=factory.getProduct("C",false);
//        System.out.println(listProductsC.size());
//
//        System.out.println("--------------------------");
        
        DepotFactory  depotFactory = new DepotFactory();
        ArrayList<DepotInterface> de = depotFactory.getDepot("A");
        //de.productsFromA=listProductsA;
        
        for(DepotInterface  eachDepot: de){
            System.out.println("Depot Id"+eachDepot.getDepotId());
            System.out.println("Number of A "+eachDepot.getProductsA().size()+" Price "+eachDepot.getProductsA().get(1));
            System.out.println("Number of B "+eachDepot.getProductsB().size()+" Price "+eachDepot.getProductsB().get(1));
            System.out.println("Number of C "+eachDepot.getProductsC().size()+" Price "+eachDepot.getProductsC().get(1));
            System.out.println("Delivery price "+eachDepot.getDeliveryPrice());
            System.out.println("---------------------------");
        }
        
       
        


        
//this has to be populated or commented before testing the testCompanies

        
    }
    
}

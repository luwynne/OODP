import java.util.ArrayList;

public class testProducts {
    
    //ProductFactory factory = new ProductFactory();
    
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        ArrayList<Products> listProductsA= null;
        ArrayList<Products> listProductsB= null;
        ArrayList<Products> listProductsC= null;


        listProductsA=factory.getProduct("A",true);
        System.out.println(listProductsA.size());

        System.out.println("--------------------------");

        listProductsB=factory.getProduct("B",false);
        System.out.println(listProductsB.size());

        System.out.println("--------------------------");

        listProductsC=factory.getProduct("C",false);
        System.out.println(listProductsC.size());

        System.out.println("--------------------------");


        


        
    }
    
}

package commercialtradesystem.OODP;




import java.util.ArrayList;
import java.util.Random;


public class ProductFactory {
    

    static int maxPrice = 10;
    static int minPrice = 1;
    static int maxProducOwner =50;
    static int minProducOwner =15;
    static int minProducOthers =3;
    static int maxProducOthers =40;



    public static ArrayList<Products> getProduct(String productName,boolean owner){
        ArrayList<Products> listOfProductsX = new ArrayList<>();
        int cost=0;
        int numberOfProducts=0;


        Products product = null;
        
        if("A".equalsIgnoreCase(productName)){

            cost=getRandom(maxPrice,minPrice);
            if(owner){
                numberOfProducts=getRandom(maxProducOwner,minProducOwner);
            }else{
                numberOfProducts=getRandom(maxProducOthers,minProducOthers);
            }

            listOfProductsX = createListProductsX(cost,numberOfProducts,"A");

            return listOfProductsX;

        }else if("B".equalsIgnoreCase(productName)){

            cost=getRandom(maxPrice,minPrice);
            if(owner){
                numberOfProducts=getRandom(maxProducOwner,minProducOwner);
            }else{
                numberOfProducts=getRandom(maxProducOthers,minProducOthers);
            }

            listOfProductsX = createListProductsX(cost,numberOfProducts,"B");

            return listOfProductsX;
            
        }else {

            cost=getRandom(maxPrice,minPrice);
            if(owner){
                numberOfProducts=getRandom(maxProducOwner,minProducOwner);
            }else{
                numberOfProducts=getRandom(maxProducOthers,minProducOthers);
            }

            listOfProductsX = createListProductsX(cost,numberOfProducts,"C");

            return listOfProductsX;
            
        }
        
    }

    public static ArrayList<Products> createListProductsX(int cost, int numberOfProducts,String company) {
        ArrayList<Products> list = new ArrayList<>();
        for (int i=0;i<numberOfProducts;i++){
            list.add(new Product(cost, company));
        }
        return list;
    }

    public static int getRandom(int max, int min){

        int price;
        Random rand = new Random();
        return  price = rand.nextInt((max-min)+1)+min;
    }


    
}

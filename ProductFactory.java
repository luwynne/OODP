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



    public ArrayList<Products> getProduct(String productName,boolean owner){
        ArrayList<Products> listOfProductsX = new ArrayList<>();
        int numberOfProducts=0;

        //depending on the its company owner, the products will assign different numbers of min and max
        //amount of products
        switch(productName){
               case "A":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }
                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

                case "B":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }

                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

                case "C":
                   if(owner){
                       numberOfProducts=getRandom(maxProducOwner,minProducOwner);
                   }else{
                       numberOfProducts=getRandom(maxProducOthers,minProducOthers);
                   }

                   listOfProductsX.clear();
                   listOfProductsX.addAll(createListProductsX(getRandom(maxPrice,minPrice),numberOfProducts,productName));
                   break;

           }
           return listOfProductsX;

    }

    //creating an arraylist of products
    public static ArrayList<Products> createListProductsX(int cost, int numberOfProducts,String company) {
        ArrayList<Products> list = new ArrayList<>();
        for (int i=0;i<numberOfProducts;i++){
            list.add(new Product(cost, company));
        }
        return list;
    }

    //getting random min and max
    public static int getRandom(int max, int min){

        int randNumber;
        Random rand = new Random();
        return  randNumber = rand.nextInt((max-min)+1)+min;
    }



}

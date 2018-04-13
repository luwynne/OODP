



public class Product implements  Products{
    
    final int price;
    final String name;
    
    
    public Product(int price, String name){
        
        this.price = price;
        this.name = name;
        
    }

    
    
    //@Override
    public String getName() {
        
        return this.name;
    
    }

    //@Override
    public int getPrice() {
        
        return this.price;
        
    }
    
    
    //@Override
    public String toString(){
        return this.name;
    }

    
    
}

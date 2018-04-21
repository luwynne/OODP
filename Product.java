package commercialtradesystem;

public class Product implements  Products{
    
    int price=0;
    final String name;
    
    
    public Product(int price, String name){
        
        this.price = price;
        this.name = name;
        
    }

    
    
    //@Override
    public String getName() {
        
        return this.name;
    
    }
    
    @Override
    public int getPrice() {
        
        return this.price;
        
    }
    
    
    //@Override
    @Override
    public String toString(){
        return Integer.toString(this.price);
    }

    
    
}

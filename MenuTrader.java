
package commercialtradesystem.OODP;



import java.util.Scanner;

/**
 * System menu class
 * It contains a runnable main method
 */
public class MenuTrader {


    //public static void main(String args[]) throws IOException{
    
   
    
    public String showMenu(){
        System.out.println("|----------- WELCOME TO COMMERCIAL TRADDING SYSTEM ------------|");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|- Trade with the company BigA, BigB, BigC (Type: A / B / C )\n|- Trade autonomously (Type: Z)");
        System.out.println("|--------------------------------------------------------------|");
        
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.nextLine();
        opt = opt.toLowerCase();
        if(null != opt)switch (opt) {
            case "a":
                System.out.println("|-- Trading for company BigA");
               /// myFacade.SelectCompany("a");
                break;
            case "b":
                System.out.println("|-- Trading for company BigB");
                //myFacade.SelectCompany("b");
                break;
            case "c":
                System.out.println("|-- Trading for company BigC");
               // myFacade.SelectCompany("c");
                break;
            case "z":
                System.out.println("|-- Trading for company Z");
                //myFacade.AutoTrader();
                break;
            
        }
        return opt;
    }
     
     
}


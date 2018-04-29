package commercialtradesystem.OODP;


import java.io.IOException;
import java.util.Scanner;

/**
 * System menu class
 * It contains a runnable main method
 */
public class MenuTrader {


    public static void main(String args[]) throws IOException{

        Singleton sing = Singleton.getInstance();

        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|----------- WELCOME TO COMMERCIAL TRADDING SYSTEM ------------|");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println( sing.menu );
        System.out.println("|--------------------------------------------------------------|");
        Scanner scanner = new Scanner(System.in);
        String opt = scanner.nextLine();
        opt = opt.toLowerCase();

        CommercialTradingSystemFacade myFacade = new CommercialTradingSystemFacade();

        if(null != opt)switch (opt) {
            case "a":
                System.out.println("|-- Trading for company BigA");
                myFacade.SelectCompany("a");
                break;
            case "b":
                System.out.println("|-- Trading for company BigB");
                myFacade.SelectCompany("b");
                break;
            case "c":
                System.out.println("|-- Trading for company BigC");
                myFacade.SelectCompany("c");
                break;
            case "z":
                myFacade.AutoTrader();
                break;
            default:
                break;
        }

        System.out.println("|--------------------------------------------------------------|");

    }
}

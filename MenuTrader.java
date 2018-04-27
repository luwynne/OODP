package commercialtradesystem.OODP;


import java.util.Scanner;


public class MenuTrader {
    
    
    public static void main(String args[]){

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
                System.out.println("...");
                System.out.println("|- Trading for company BigA");
                System.out.println("...");
                
                break;
            case "b":
                System.out.println("...");
                System.out.println("|- Trading for company BigB");
                System.out.println("...");
                break;
            case "c":
                System.out.println("...");
                System.out.println("|- Trading for company BigC");
                System.out.println("...");
                break;
            case "z":
                System.out.println("...");
                System.out.println("|- Trading autonomously");
                System.out.println("...");
                break;
            default:
                break;
        }

        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|------------------- COMPANY TRADE REPORT ---------------------|");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|--------------------------------------------------------------|");

    }
}

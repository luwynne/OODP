package commercialtradesystem.OODP;

import java.util.Scanner;

/**
 * System Menu. This is the door entry of the system It contains a runnable main
 * method
 */
public class MenuTrader {

    //public static void main(String args[]) throws IOException{
    /**
     * Key method that validates input from user and returns an output to Main
     * class
     *
     * @return (option from user)
     */
    public String showMenu() {
        System.out.println("|----------- WELCOME TO COMMERCIAL TRADDING SYSTEM ------------|");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println("|- Trade with the company BigA, BigB, BigC (Type: A / B / C )\n|- Trade autonomously (Type: Z)");
        System.out.println("|--------------------------------------------------------------|");

        Scanner scanner = new Scanner(System.in);
        String opt;
        String pattern = "abcz";
        //opt = opt.toLowerCase();

        do {
            opt = scanner.next();
            opt = opt.toLowerCase();
            
            if(!pattern.contains(opt)){
                System.out.println("Error: Please, type it again!");
            }

        } while (!pattern.contains(opt));

        return opt; //returning option to Main class

    }

}

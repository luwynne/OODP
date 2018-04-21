package commercialtradesystem;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drgth
 */
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
        System.out.println("|- Bla: bla bla bla -|");
        System.out.println("|--------------------------------------------------------------|");
        
    }
}

//package commercialtradesystem.OODP;
//
//
///**
// * Singleton class responsible for single instantiation of Menu
// * @author lwynne
// * @version 1.0.0
// */
//class Singleton {
//
//    private static Singleton single_instance = null; // static variable single_instance of type Singleton
//    public String menu; //variable of type String
//
//    private Singleton(){
//        menu = "|- Trade with the company BigA, BigB, BigC (Type: A / B / C )\n|- Trade autonomously (Type: Z)";
//    }
//
//    public static Singleton getInstance(){
//        if(single_instance == null){
//            single_instance = new Singleton();
//        }
//        return single_instance;
//    }
//}


package commercialtradesystem.OODP;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Singleton class responsible for single instantiation of Menu
 *
 */
class Singleton {


    CommercialTradingSystemFacade myFacade;

    public void startFacade(String option) throws IOException{

        if(myFacade == null){

            switch (option){
                case "a":
                    myFacade = new CommercialTradingSystemFacade();
                    myFacade.SelectCompany("a");
                    break;
                case "b":
                    myFacade = new CommercialTradingSystemFacade();
                    myFacade.SelectCompany("b");
                    break;
                case "c":
                    myFacade = new CommercialTradingSystemFacade();
                    myFacade.SelectCompany("c");
                    break;
                case "z":
                        myFacade = new CommercialTradingSystemFacade();
                        myFacade.AutoTrader();
                    break;
            }

        }

    }



}

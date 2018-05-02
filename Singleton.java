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


/**
 * Singleton class responsible for single instantiation of Menu
 *
 */
class Singleton {
    private static MenuTrader uniqueInstance;

    public MenuTrader Singleton()  {

        if(uniqueInstance == null){

          uniqueInstance = new MenuTrader();
        }
        
        return uniqueInstance;
    }



}

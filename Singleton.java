package commercialtradesystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drgth
 */
class Singleton {

    private static Singleton single_instance = null; // static variable single_instance of type Singleton
    public String menu; //variable of type String

    private Singleton(){
        menu = "|- Trade with the company BigA, BigB, BigC (Type: A / B / C )\n|- Trade autonomously (Type: Z)";
    }

    public static Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }   
}

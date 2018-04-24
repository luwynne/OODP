/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author mynahone0
 */
public class testingCompany {
    
    
    public static void main(String[] args) throws IOException {
   
                                           
    CompanyFactory compa = new CompanyFactory();
    
            ArrayList<CompanyInterface> companies= compa.getCompany();
            String outputBeforeTrade = "";
            String outputAfterTrafe="";
    
        for(CompanyInterface eachComp : companies){
            
            outputBeforeTrade+="\n ********************** Start Company "+eachComp.getCompanyType() +" **********************";
            
            for(DepotInterface  eachDepot: eachComp.getArrayListDepot()){
                outputBeforeTrade +="\n"+ eachDepot+ "\n ---------------------------";
            }
          
            outputBeforeTrade+="\n ********************** End Company "+eachComp.getCompanyType() +" **********************";
        }
       // System.out.println("////////////////////////////////////////////////////////////////////////");
        Trader newTrader = new Trader(companies.get(0).getArrayListDepot(),companies.get(1).getArrayListDepot(),companies.get(2).getArrayListDepot());
        newTrader.tradingA();
        newTrader.tradingB();
        newTrader.tradingC();
        newTrader.tradingC();
        newTrader.tradingB();
        newTrader.tradingA();
        
        
        
        for(CompanyInterface eachComp : companies){
            
            outputAfterTrafe+="\n ********************** Start Company "+eachComp.getCompanyType() +" **********************";
            
            for(DepotInterface  eachDepot: eachComp.getArrayListDepot()){
                outputAfterTrafe +="\n"+ eachDepot+ "\n ---------------------------";
                eachComp.addListOfTransactions(eachDepot.getListOfTransactions());
//                for(Transaction eachTran: eachDepot.getListOfTransactions()){
//                    System.out.println(eachTran);
//                }
//                System.out.println("------------------------ end depot transactions -----------------------------------");
                
            }
            
            outputAfterTrafe+="\n ********************** End Company "+eachComp.getCompanyType() +" **********************";
            
        }
        //writingResultToFile();
        
        // printing transaction by company
        for(CompanyInterface eachComp : companies){
            for (Transaction eachTran  : eachComp.getListOfTransactions()){
                System.out.println(eachTran);
            }
            
            System.out.println("------------------------ end company transactions -----------------------------------");
                
        }
        writingResultToFile(outputBeforeTrade,"before");
        writingResultToFile(outputAfterTrafe,"after");
        //System.out.println(outputBeforeTrade);
        // System.out.println("////////////////////////////////////////////////////////////////////////");
        //System.out.println(outputAfterTrafe);
    }
    
    
    public static void writingResultToFile (String info, String fileName) 
        throws IOException {
          //String fileName="before";
          //String str = "Hello";
          FileOutputStream outputStream = new FileOutputStream("/Users/yoseph/NetBeansProjects/CommercialTradeSystem/src/commercialtradesystem/OODP/Results/"+fileName);
          byte[] strToBytes = info.getBytes();
          outputStream.write(strToBytes);

          outputStream.close();
    }
    
   
    
}

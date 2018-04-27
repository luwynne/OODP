
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
            String outputAfterTrade="";

        for(CompanyInterface eachComp : companies){

            outputBeforeTrade+="\n ********************** Start Company "+eachComp.getCompanyType() +" **********************";
            outputBeforeTrade+="\n"+eachComp+" ";
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
        
        

        for(CompanyInterface eachComp : companies){
            eachComp.setWaletAfterTrade(); //assigning value to the afterwallet, which will then be used to display values after the trade
            outputAfterTrade+="\n ********************** Start Company "+eachComp.getCompanyType() +" **********************";
            outputAfterTrade+="\n"+eachComp+" ";
            for(DepotInterface  eachDepot: eachComp.getArrayListDepot()){
                outputAfterTrade +="\n"+ eachDepot+ "\n ---------------------------";
                eachComp.addListOfTransactions(eachDepot.getListOfTransactions());
//                for(Transaction eachTran: eachDepot.getListOfTransactions()){
//                    System.out.println(eachTran);
//                }
//                System.out.println("------------------------ end depot transactions -----------------------------------");

            }

            outputAfterTrade+="\n ********************** End Company "+eachComp.getCompanyType() +" **********************";

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
        writingResultToFile(outputAfterTrade,"after");
        //System.out.println(outputBeforeTrade);
        // System.out.println("////////////////////////////////////////////////////////////////////////");
        //System.out.println(outputAfterTrafe);
    }


    public static void writingResultToFile (String info, String fileName)
        throws IOException {
          //String fileName="before";
          //String str = "Hello";
          FileOutputStream outputStream = new FileOutputStream("/Users/mynahone0/commercialtradesystem/src/commercialtradesystem/OODP/Results/"+fileName);
          byte[] strToBytes = info.getBytes();
          outputStream.write(strToBytes);

          outputStream.close();
    }



}


package commercialtradesystem.OODP;

import static commercialtradesystem.OODP.testingCompany.writingResultToFile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mynahone0
 */
public class CommercialTradingSystemFacade implements CommercialInter {
    
    ArrayList<CompanyInterface> companies;

    public CommercialTradingSystemFacade() throws IOException {
        CompanyFactory compa = new CompanyFactory();
    
            
            companies= compa.getCompany();
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
                eachComp.setTotalProductsBuyInA(eachDepot.getTotalProductsBuyInA());
                eachComp.setTotalProductsBuyInB(eachDepot.getTotalProductsBuyInB());
                eachComp.setTotalProductsBuyInC(eachDepot.getTotalProductsBuyInC());
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
                //System.out.println(eachTran);
                if(eachTran.productTrade=="A"){
                    eachComp.setTotalSpendInA(eachTran.productPrice);
                    eachComp.setTotalSpendDeliverA(eachTran.deliveryPrice);
                }else if(eachTran.productTrade=="B"){
                    eachComp.setTotalSpendInB(eachTran.productPrice);
                    eachComp.setTotalSpendDeliverB(eachTran.deliveryPrice);
                }else{
                    eachComp.setTotalSpendInC(eachTran.productPrice);
                    eachComp.setTotalSpendDeliverC(eachTran.deliveryPrice);
                }
            }

            //System.out.println("------------------------ end company transactions -----------------------------------");

        }
        //writingResultToFile(outputBeforeTrade,"before");
        //writingResultToFile(outputAfterTrade,"after");
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

    @Override
    public void SelectCompany(String CompanySelected) {
        if(null != CompanySelected)switch (CompanySelected) {
            case "a":
                //companies.get(0).getListOfTransactions();
                for(Transaction trans : companies.get(0).getListOfTransactions()){
                    System.out.println(trans);
                }
                System.out.println("|-------------------------   BigA   ---------------------------|");
                System.out.println("|-- Wallet before trade "+companies.get(0).getWalletBeforeTrade()+ " wallet after trade "+companies.get(0).getWalletAfterTrade());
                System.out.println("|-- Total amount of BigB of products purchased: " + companies.get(0).getTotalProductsBuyInB());
                System.out.println("|-- Total spend in BigB " + companies.get(0).getTotalSpendInB());
                System.out.println("|-- Total spend in BigB Delivery " + companies.get(0).getTotalSpendDeliverB());
                System.out.println("|-- Total amount of BigC of products purchased: " + companies.get(0).getTotalProductsBuyInC());
                System.out.println("|-- Total spend in BigC " + companies.get(0).getTotalSpendInC());
                System.out.println("|-- Total spend in BigC Delivery " + companies.get(0).getTotalSpendDeliverC());
                
                break;
            case "b":
                for(Transaction trans : companies.get(1).getListOfTransactions()){
                    System.out.println(trans);
                }
                System.out.println("|-------------------------   BigB   ---------------------------|");
                System.out.println("|-- Wallet before trade "+companies.get(1).getWalletBeforeTrade()+ " wallet after trade "+companies.get(1).getWalletAfterTrade());
                System.out.println("|-- Total amount of BigA of products purchased: " + companies.get(1).getTotalProductsBuyInA());
                System.out.println("|-- Total spend in BigA " + companies.get(1).getTotalSpendInA());
                System.out.println("|-- Total spend in BigA Delivery " + companies.get(1).getTotalSpendDeliverA());
                System.out.println("|-- Total amount of BigC of products purchased: " + companies.get(1).getTotalProductsBuyInC());
                System.out.println("|-- Total spend in BigC " + companies.get(1).getTotalSpendInC());
                System.out.println("|-- Total spend in BigC Delivery " + companies.get(1).getTotalSpendDeliverC());
                
                break;
            case "c":
                for(Transaction trans : companies.get(2).getListOfTransactions()){
                    System.out.println(trans);
                }
                System.out.println("|-------------------------   BigC   ---------------------------|");
                System.out.println("|-- Wallet before trade "+companies.get(2).getWalletBeforeTrade()+ " wallet after trade "+companies.get(2).getWalletAfterTrade());
                System.out.println("|-- Total amount of BigA of products purchased: " + companies.get(2).getTotalProductsBuyInA());
                System.out.println("|-- Total spend in BigA " + companies.get(2).getTotalSpendInA());
                System.out.println("|-- Total spend in BigA Delivery " + companies.get(2).getTotalSpendDeliverA());
                System.out.println("|-- Total amount of BigB of products purchased: " + companies.get(2).getTotalProductsBuyInB());
                System.out.println("|-- Total spend in BigB " + companies.get(2).getTotalSpendInB());
                System.out.println("|-- Total spend in BigB Delivery " + companies.get(2).getTotalSpendDeliverB());
                
                
                break;
            default:
                break;
        }
    }

    @Override
    public void AutoTrader() {
        System.out.println("qwe");
      
    }
    
    
    
}

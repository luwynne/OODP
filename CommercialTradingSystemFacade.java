
package commercialtradesystem.OODP;

import java.util.ArrayList;

/**
 *Facade responsible for handling the system complexity
 * Integration with the Factories and the trading logic
 * 
 */
public class CommercialTradingSystemFacade implements CommercialInter {
    
    ArrayList<CompanyInterface> companies;
    reportByCompany reportComp;
    overallReportOfCompanies reportCompanies;

    /**
     * Constructor of System Facade
     * Instantiates the CompanyFactory and assigns values to afterWallets
     * Brings each company's transactions
     *  
     */
    public CommercialTradingSystemFacade(reportByCompany reportComp,overallReportOfCompanies reportCompanies) {
        
        this.reportComp=reportComp;
        this.reportCompanies=reportCompanies;
        
        //the CompanyFactory creates three companies with depots and products 
        CompanyFactory compa = new CompanyFactory();
    
  
        companies= compa.getCompany();
        
        // the trader receives the ArrayList of depots of each company
        Trader newTrader = new Trader(companies.get(0).getArrayListDepot(),companies.get(1).getArrayListDepot(),companies.get(2).getArrayListDepot());
        newTrader.tradingA();
        newTrader.tradingC();
        newTrader.tradingB();
        
        
       
        for(CompanyInterface eachComp : companies){
            eachComp.setWaletAfterTrade();
            eachComp.calculateProfit();
            //collecting the transaction of all depots
            for(DepotInterface  eachDepot: eachComp.getArrayListDepot()){
                eachComp.addListOfTransactions(eachDepot.getListOfTransactions());
            }
            //collecting information for the report 
            for (Transaction eachTran  : eachComp.getListOfTransactions()){
                switch (eachTran.productTrade) {
                    case "A":
                        eachComp.increaseTotalSpendInA(eachTran.productPrice);
                        eachComp.increaseTotalSpendDeliverA(eachTran.deliveryPrice);
                        eachComp.increaseTotalProductsBuyInA(1);
                        break;
                    case "B":
                        eachComp.increaseTotalSpendInB(eachTran.productPrice);
                        eachComp.increaseTotalSpendDeliverB(eachTran.deliveryPrice);
                        eachComp.increaseTotalProductsBuyInB(1);
                        break;
                    default:
                        eachComp.increaseTotalSpendInC(eachTran.productPrice);
                        eachComp.increaseTotalSpendDeliverC(eachTran.deliveryPrice);
                        eachComp.increaseTotalProductsBuyInC(1);
                        break;
                }
            }
        }
        
    }
  

    @Override
    /**
     * Bringing individual data according to company selection
     * @param CompanySelected input coming from the user on which company
     */
    public void SelectCompany(String CompanySelected) {
        if(null != CompanySelected)switch (CompanySelected) {
            case "a":
                
                reportComp.PrintReport(companies.get(0));
                break;
                
            case "b":
                reportComp.PrintReport(companies.get(1));
                break;
                
            case "c":
                reportComp.PrintReport(companies.get(2));
                break;
        }
    }

    @Override
    public void AutoTrader() {
        reportCompanies.printReportComapnies(companies);
      
    }
    
    
    
}

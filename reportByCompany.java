/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;

/**
 * Class responsible for individual company reports
 * @author yoseph
 * @version 1.0.0
 */
public class reportByCompany {

    /**
     * Brings individual report by company
     * @param company (company selected)
     */
    public void PrintReport(CompanyInterface company){
        
        for(Transaction trans : company.getListOfTransactions()){
            System.out.println(trans);
        }
        
        System.out.println("|-------------------------   Company"+ company.getCompanyType() +"   -------------------------|");
        switch(company.getCompanyType()){
            case("A"):
                System.out.println("|-- Total amount of products B purchased: " + company.getTotalProductsBuyInB()+ " Total cost " + company.getTotalSpendInB()+" Total cost for Delivery " + company.getTotalSpendDeliverB());
                System.out.println("|-- Total amount of products C purchased: " + company.getTotalProductsBuyInC()+ " Total cost " + company.getTotalSpendInC()+" Total cost for Delivery " + company.getTotalSpendDeliverC());
                break;
            case("B"):
                System.out.println("|-- Total amount of products A purchased: " + company.getTotalProductsBuyInA()+ " Total cost " + company.getTotalSpendInA()+" Total cost for Delivery " + company.getTotalSpendDeliverA());
                System.out.println("|-- Total amount of products C purchased: " + company.getTotalProductsBuyInC()+ " Total cost " + company.getTotalSpendInC()+" Total cost for Delivery " + company.getTotalSpendDeliverC());
                break;
            case("C"):
                System.out.println("|-- Total amount of products A purchased: " + company.getTotalProductsBuyInA()+ " Total cost " + company.getTotalSpendInA()+" Total cost for Delivery " + company.getTotalSpendDeliverA());
                System.out.println("|-- Total amount of products B purchased: " + company.getTotalProductsBuyInB()+ " Total cost " + company.getTotalSpendInB()+" Total cost for Delivery " + company.getTotalSpendDeliverB());
                break;
        }
        
        System.out.println("|-- Wallet before trade "+company.getWalletBeforeTrade()+ " wallet after trade "+company.getWalletAfterTrade());
   
    }
    
    
    
}

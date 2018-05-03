/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Brings the overall transactions register after the AutoTrade mode is selecteds
 * @author yoseph
 * @version 1.0.0
 */
public class overallReportOfCompanies {
    
    
    
    /**
     * Receives the companies ArrayList and prints the company reports
     * @param companies (all the companies)
     */
    
    public void showResult(ArrayList<CompanyInterface> companies){
        int temp=companies.get(0).getProfit();
        int spendTheMost=-1;
        //if(companies.get(0).getProfit()>)
        int madeThemost=-1;
        
        ArrayList<Integer> profits = new ArrayList<>();
        
        for(CompanyInterface comp: companies){
            profits.add(comp.getProfit());
        }
        System.out.println(profits);
        
       System.out.println(profits.indexOf(Collections.max(profits)));
        
//        if(spendTheMost==-1){
//            for(int i=0;i<companies.size();i++){
//                if(companies.get(i).getProfit()<temp ){
//
//                    spendTheMost=i;
//                }
//            }
//        }
//        
//        if(madeThemost==-1){
//            for(int i=0;i<companies.size();i++){
//                if(companies.get(i).getProfit()>madeThemost){
//                  
//                    madeThemost=i;
//                }
//            }
//        }
        
        


        for(CompanyInterface eachComp: companies){
            String print="";
            print+="Company{ \n"; 
            print+="Name = "+eachComp+ "\n";
            if(eachComp.getCompanyType().equals("A")){
                print+="Total products sold for this company "+eachComp.getTotalProductsBuyInA()+ "\n";
                print+="Total products bought of company B "+eachComp.getTotalProductsBuyInB()+ " Total paid for products "+eachComp.getTotalSpendInB() +" Total paid for delivery "+eachComp.getTotalSpendDeliverB()+" Total "+(eachComp.getTotalSpendInB()+eachComp.getTotalSpendDeliverB())+"\n";
                print+="Total products bought of company C "+eachComp.getTotalProductsBuyInC()+ " Total paid for products "+eachComp.getTotalSpendInC() +" Total paid for delivery "+eachComp.getTotalSpendDeliverC()+" Total "+(eachComp.getTotalSpendInC()+eachComp.getTotalSpendDeliverC())+"\n";
            }else if(eachComp.getCompanyType().equals("B")){
                print+="Total products sold of this company "+eachComp.getTotalProductsBuyInB()+ "\n";
                print+="Total products bought of company A "+eachComp.getTotalProductsBuyInA()+ " Total paid for products "+eachComp.getTotalSpendInA() +" Total paid for delivery "+eachComp.getTotalSpendDeliverA()+" Total "+(eachComp.getTotalSpendInA()+eachComp.getTotalSpendDeliverA())+"\n";
                print+="Total products bought of company C "+eachComp.getTotalProductsBuyInC()+ " Total paid for products "+eachComp.getTotalSpendInC() +" Total paid for delivery "+eachComp.getTotalSpendDeliverC()+" Total "+(eachComp.getTotalSpendInC()+eachComp.getTotalSpendDeliverC())+"\n";
            }else{
                print+="Total products sold of this company "+eachComp.getTotalProductsBuyInC()+ "\n";
                print+="Total products bought of company A "+eachComp.getTotalProductsBuyInA()+ " Total paid for products "+eachComp.getTotalSpendInA() +" Total paid for delivery "+eachComp.getTotalSpendDeliverA()+" Total "+(eachComp.getTotalSpendInA()+eachComp.getTotalSpendDeliverA())+"\n";
                print+="Total products bought of company B "+eachComp.getTotalProductsBuyInB()+ " Total paid for products "+eachComp.getTotalSpendInB() +" Total paid for delivery "+eachComp.getTotalSpendDeliverB()+" Total "+(eachComp.getTotalSpendInB()+eachComp.getTotalSpendDeliverB())+"\n";
            }
            print+=" Wallet before trade "+ eachComp.getWalletBeforeTrade() +" Wallet after trade "+ eachComp.getWalletAfterTrade() +" Profit "+ eachComp.getProfit() + "\n";
            
            print+="}\n";
            System.out.println(print);
        }
        System.out.println("|------------------------------- Result -------------------------------|");
        System.out.println("Company that made the most profit is "+ companies.get(profits.indexOf(Collections.max(profits)))+" profit = "+ companies.get(profits.indexOf(Collections.max(profits))).getProfit());
        System.out.println("Company that made the least profit is "+ companies.get(profits.indexOf(Collections.min(profits)))+" profit = "+ companies.get(profits.indexOf(Collections.min(profits))).getProfit());
    }
    
    
}

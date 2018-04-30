/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;

import java.util.ArrayList;

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
    public void printReportComapnies(ArrayList<CompanyInterface> companies){
        int spendTheMost=-1;
        int madeThemost=-1;
        
        if(spendTheMost==-1){
            for(int i=0;i<companies.size();i++){
                if(companies.get(i).getProfit()<spendTheMost){

                    spendTheMost=i;
                }
            }
        }
        
        if(madeThemost==-1){
            for(int i=0;i<companies.size();i++){
                if(companies.get(i).getProfit()>spendTheMost){
                  
                    madeThemost=i;
                }
            }
        }
        
        
        System.out.println("Company that made the most profit is "+ companies.get(madeThemost)+" profit = "+ companies.get(madeThemost).getProfit());
        System.out.println("Company that made the least profit is "+ companies.get(spendTheMost)+" profit = "+ companies.get(spendTheMost).getProfit());

    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;


/**
 * 
 * @author yoseph
 */
public class Main {
    
    public static void main (String[] args){
        overallReportOfCompanies overall = new overallReportOfCompanies();
        reportByCompany reportCompany = new reportByCompany();
        CommercialTradingSystemFacade facade = new CommercialTradingSystemFacade(reportCompany,overall);
        Singleton newMenu = new Singleton();
        String opt = newMenu.Singleton().showMenu();
        
        //Working acordingly ABC for companies or Z to Autotrade()
        if(opt.equals("z")){
            facade.AutoTrader();
        }else{
            facade.SelectCompany(opt);
        }
            
    }
    
    
}

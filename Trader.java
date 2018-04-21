/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;

import java.util.ArrayList;

/**
 *
 * @author yoseph
 */
public class Trader {
    
    ArrayList<DepotInterface> depotsA ;
    ArrayList<DepotInterface> depotsB ;
    ArrayList<DepotInterface> depotsC ;
    int minCashAllowance=50;
    
    
    Trader(ArrayList<DepotInterface> dA,ArrayList<DepotInterface> dB,ArrayList<DepotInterface> dC){
       
        this.depotsA=dA;
        this.depotsB=dB;
        this.depotsC=dC;
    }
    
    public void  tradingA(){
        
        //int counterDepot =0;
        for(int i=0;i<depotsA.size()-1;i++){
            int counterDepot =0;
            int pricePlusDelivery=depotsA.get(i).getDeliveryPrice()+depotsA.get(i).getProductsA().get(1).getPrice();
            while(depotsA.get(i).getProductsA().size()> 16 && counterDepot<100){
                
                if((depotsB.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsB.get(counterDepot).getProductsA().size()<40) ){
                    
                    depotsB.get(counterDepot).buyProductsFromA(depotsA.get(i).sellProductsA());
                    depotsA.get(i).setDepotWallet(pricePlusDelivery);
                    depotsB.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                }
                
                if((depotsC.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsA().size()<40) ){
                   
                    depotsC.get(counterDepot).buyProductsFromA(depotsA.get(i).sellProductsA());
                    depotsA.get(i).setDepotWallet(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                }
                counterDepot++;
            }
        }
    }
    
    public void  tradingB(){
        
        //int counterDepot =0;
        for(int i=0;i<depotsB.size()-1;i++){
           int counterDepot =0;
            int pricePlusDelivery=depotsB.get(i).getDeliveryPrice()+depotsB.get(i).getProductsB().get(1).getPrice();
            
            while(depotsB.get(i).getProductsB().size()> 16 && counterDepot<100){
               
                if((depotsA.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsA.get(counterDepot).getProductsB().size()<40) ){
                   
                    depotsA.get(counterDepot).buyProductsFromB(depotsB.get(i).sellProductsB());
                    depotsB.get(i).setDepotWallet(pricePlusDelivery);
                    depotsA.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                }
                
                if((depotsC.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsB().size()<40) ){
                    
                    depotsC.get(counterDepot).buyProductsFromB(depotsB.get(i).sellProductsB());
                    depotsB.get(i).setDepotWallet(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                }
                counterDepot++;
            }
        }
    }
    
    public void  tradingC(){
        
        //int counterDepot =0;
        for(int i=0;i<depotsC.size()-1;i++){
            int counterDepot =0;
            int pricePlusDelivery=depotsC.get(i).getDeliveryPrice()+depotsC.get(i).getProductsC().get(1).getPrice();
            
            while(depotsC.get(i).getProductsC().size()> 16 && counterDepot<100){
               
                if((depotsA.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsA.get(counterDepot).getProductsC().size()<40) ){
                    
                    depotsA.get(counterDepot).buyProductsFromC(depotsC.get(i).sellProductsC());
                    depotsC.get(i).setDepotWallet(pricePlusDelivery);
                    depotsA.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                }
                
                if((depotsB.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsB.get(counterDepot).getProductsC().size()<40) ){
                   
                    depotsB.get(counterDepot).buyProductsFromC(depotsC.get(i).sellProductsC());
                    depotsC.get(i).setDepotWallet(pricePlusDelivery);
                    depotsB.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                }
                counterDepot++;
            }
            
        }
    }
}

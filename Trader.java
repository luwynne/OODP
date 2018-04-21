/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem;

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
    ArrayList<Integer> transaction = new ArrayList<Integer>();  

    
    
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
                    
                 
                    //adding everything into the transaction arraylist
                    transaction.add(depotsA.get(i).getDepotId()); //adding the seller
                    transaction.add(depotsB.get(counterDepot).getDepotId()); //adding the buyer
                    transaction.add(pricePlusDelivery);//adding the total (product price + delivery)
                    depotsA.get(i).setTransaction(transaction); //assignin the transaction to the depot A selleer
                    depotsB.get(i).setTransaction(transaction); //assignin the transaction to the depot B buyer
                    
                    
                    
                    
                }
                
                if((depotsC.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsA().size()<40) ){
                   
                    depotsC.get(counterDepot).buyProductsFromA(depotsA.get(i).sellProductsA());
                    depotsA.get(i).setDepotWallet(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                    
                     transaction.add(depotsA.get(i).getDepotId()); //adding the seller
                     transaction.add(depotsC.get(counterDepot).getDepotId()); //adding the buyer
                     transaction.add(pricePlusDelivery);//adding the total (product price + delivery)
                     depotsA.get(i).setTransaction(transaction); //assignin the transaction to the depot A selleer
                     depotsC.get(i).setTransaction(transaction); //assignin the transaction to the depot C buyer
                    
                    
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
                    
                    //adding everything into the transaction arraylist
                    transaction.add(depotsB.get(i).getDepotId()); //adding the seller
                    transaction.add(depotsA.get(counterDepot).getDepotId()); //adding the buyer
                    transaction.add(pricePlusDelivery);//adding the total (product price + delivery)
                    depotsB.get(i).setTransaction(transaction); //assignin the transaction to the depot B selleer
                    depotsA.get(i).setTransaction(transaction); //assignin the transaction to the depot A buyer
                    
                }
                
                if((depotsC.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsB().size()<40) ){
                    
                    depotsC.get(counterDepot).buyProductsFromB(depotsB.get(i).sellProductsB());
                    depotsB.get(i).setDepotWallet(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                    
                    //adding everything into the transaction arraylist
                    transaction.add(depotsB.get(i).getDepotId()); //adding the seller
                    transaction.add(depotsC.get(counterDepot).getDepotId()); //adding the buyer
                    transaction.add(pricePlusDelivery);//adding the total (product price + delivery)
                    depotsB.get(i).setTransaction(transaction); //assignin the transaction to the depot B selleer
                    depotsC.get(i).setTransaction(transaction); //assignin the transaction to the depot C buyer
                    
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
                    
                    //adding everything into the transaction arraylist
                    transaction.add(depotsC.get(i).getDepotId()); //adding the seller
                    transaction.add(depotsA.get(counterDepot).getDepotId()); //adding the buyer
                    transaction.add(pricePlusDelivery);//adding the total (product price + delivery)
                    depotsC.get(i).setTransaction(transaction); //assignin the transaction to the depot C selleer
                    depotsA.get(i).setTransaction(transaction); //assignin the transaction to the depot A buyer
                    
                }
                
                if((depotsB.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsB.get(counterDepot).getProductsC().size()<40) ){
                   
                    depotsB.get(counterDepot).buyProductsFromC(depotsC.get(i).sellProductsC());
                    depotsC.get(i).setDepotWallet(pricePlusDelivery);
                    depotsB.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                    
                    //adding everything into the transaction arraylist
                    transaction.add(depotsC.get(i).getDepotId()); //adding the seller
                    transaction.add(depotsB.get(counterDepot).getDepotId()); //adding the buyer
                    transaction.add(pricePlusDelivery);//adding the total (product price + delivery)
                    depotsC.get(i).setTransaction(transaction); //assignin the transaction to the depot C selleer
                    depotsB.get(i).setTransaction(transaction); //assignin the transaction to the depot B buyer
                    
                }
                counterDepot++;
            }
            
        }
    }
}

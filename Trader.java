
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

    /**
     * Trade class constructor
     * Receives 3 ArrayLists holding each of them depots from each of the 3 companies
     * @param dA, dB, dC (depots from each of different companies)
     */
    Trader(ArrayList<DepotInterface> dA,ArrayList<DepotInterface> dB,ArrayList<DepotInterface> dC){

        this.depotsA=dA;
        this.depotsB=dB;
        this.depotsC=dC;
    }

    /**
     * Performs a transaction with company A as a trader
     * This trader then can trade with companies B and C 
     * It goes through all the depots from the company A and bounces between all the depots from companies B and C
     * It assigns value to an ArrayList of transactions holding the depot information and who the depot has traded with
     */
    public void  tradingA(){


        // make a transaction object(details above) here and add it to the depot transaction arraylist of depotsA.get(i) and depotsB.get(counterDepot)
        // you have to create the arraylist<transactions> in the depot class. and a method to add a transaction to the ArrayList
                    
        for(int i=0;i<depotsA.size()-1;i++){
            int counterDepot =0;
            int deliveryPrice=depotsA.get(i).getDeliveryPrice();
            int productPrice = depotsA.get(i).getProductsA().get(1).getPrice();
            int pricePlusDelivery= deliveryPrice+productPrice;
            while(depotsA.get(i).getProductsA().size()> 16 && counterDepot<100){

                if((depotsB.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsB.get(counterDepot).getProductsA().size()<40) ){

                    depotsB.get(counterDepot).buyProductsFromA(depotsA.get(i).sellProductsA());
                    depotsA.get(i).setDepotWallet(pricePlusDelivery);
                    depotsB.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                    Transaction tempTran = new Transaction("Depot from B id: "+depotsB.get(counterDepot).getDepotId(),"Depot from A id: "+depotsA.get(i).getDepotId(),"A",productPrice,deliveryPrice);
                    depotsB.get(counterDepot).addTransactions(tempTran);
                    depotsA.get(i).addTransactions(tempTran);
  
                }

                if((depotsC.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsA().size()<40) ){

                    depotsC.get(counterDepot).buyProductsFromA(depotsA.get(i).sellProductsA());
                    depotsA.get(i).setDepotWallet(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));
                    Transaction tempTran = new Transaction("Depot from C id: "+depotsC.get(counterDepot).getDepotId(),"Depot from A id: "+depotsA.get(i).getDepotId(),"A",productPrice,deliveryPrice);
                    depotsC.get(counterDepot).addTransactions(tempTran);
                    depotsA.get(i).addTransactions(tempTran);

                    
                }
                counterDepot++;
            }
        }
    }

    /**
     * Performs a transaction with company B as a trader
     * This trader then can trade with companies A and C
     * It goes through all the depots from the company B and bounces between all the depots from companies A and C
     * It assigns value to an ArrayList of transactions holding the depot information and who the depot has traded with
     */
    public void  tradingB(){


        for(int i=0;i<depotsB.size()-1;i++){
           int counterDepot =0;
           int deliveryPrice=depotsB.get(i).getDeliveryPrice();
           int productPrice=depotsB.get(i).getProductsB().get(1).getPrice();
           int pricePlusDelivery= deliveryPrice+productPrice;

            while(depotsB.get(i).getProductsB().size()> 16 && counterDepot<100){

                if((depotsA.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsA.get(counterDepot).getProductsB().size()<40) ){

                    depotsA.get(counterDepot).buyProductsFromB(depotsB.get(i).sellProductsB());
                    depotsB.get(i).setDepotWallet(pricePlusDelivery);
                    depotsA.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));

                    Transaction tempTran = new Transaction("Depot from A id: "+depotsA.get(counterDepot).getDepotId(),"Depot from B id: "+depotsB.get(i).getDepotId(),"B",productPrice,deliveryPrice);
                    depotsA.get(counterDepot).addTransactions(tempTran);
                    depotsB.get(i).addTransactions(tempTran);

                    

                }

                if((depotsC.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsC.get(counterDepot).getProductsB().size()<40) ){

                    depotsC.get(counterDepot).buyProductsFromB(depotsB.get(i).sellProductsB());
                    depotsB.get(i).setDepotWallet(pricePlusDelivery);
                    depotsC.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));

                    Transaction tempTran = new Transaction("Depot from C id: "+depotsC.get(counterDepot).getDepotId(),"Depot from B id: "+depotsB.get(i).getDepotId(),"B",productPrice,deliveryPrice);
                    depotsB.get(counterDepot).addTransactions(tempTran);
                    depotsC.get(i).addTransactions(tempTran);

                    

                }
                counterDepot++;
            }
        }
    }

    /**
     * Performs a transaction with company C as a trader
     * This trader then can trade with companies A and B 
     * It goes through all the depots from the company C and bounces between all the depots from companies A and B
     * It assigns value to an ArrayList of transactions holding the depot information and who the depot has traded with
     */
    public void  tradingC(){


        for(int i=0;i<depotsC.size()-1;i++){
            int counterDepot =0;

            int deliveryPrice=depotsC.get(i).getDeliveryPrice();
            int productPrice=depotsC.get(i).getProductsB().get(1).getPrice();
            int pricePlusDelivery= deliveryPrice+productPrice;


            while(depotsC.get(i).getProductsC().size()> 16 && counterDepot<100){

                if((depotsA.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsA.get(counterDepot).getProductsC().size()<40) ){

                    depotsA.get(counterDepot).buyProductsFromC(depotsC.get(i).sellProductsC());
                    depotsC.get(i).setDepotWallet(pricePlusDelivery);
                    depotsA.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));

                    Transaction tempTran = new Transaction("Depot from A id: "+depotsA.get(counterDepot).getDepotId(),"Depot from C id: "+depotsC.get(i).getDepotId(),"C",productPrice,deliveryPrice);
                    depotsA.get(counterDepot).addTransactions(tempTran);
                    depotsC.get(i).addTransactions(tempTran);
                    
                }

                if((depotsB.get(counterDepot).getDepotWallet()-minCashAllowance>pricePlusDelivery) && (depotsB.get(counterDepot).getProductsC().size()<40) ){

                    depotsB.get(counterDepot).buyProductsFromC(depotsC.get(i).sellProductsC());
                    depotsC.get(i).setDepotWallet(pricePlusDelivery);
                    depotsB.get(counterDepot).setDepotWallet(pricePlusDelivery*(-1));


                    Transaction tempTran = new Transaction("Depot from B id: "+depotsB.get(counterDepot).getDepotId(),"Depot from C id: "+depotsC.get(i).getDepotId(),"C",productPrice,deliveryPrice);
                    depotsB.get(counterDepot).addTransactions(tempTran);
                    depotsC.get(i).addTransactions(tempTran);
                    
                }
                counterDepot++;
            }

        }
    }
}

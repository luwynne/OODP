
package commercialtradesystem.OODP;

import static commercialtradesystem.OODP.DepotFactory.getRandom;
import java.util.ArrayList;


public class CompanyFactory{



    public ArrayList<CompanyInterface> getCompany(){

       return createCompanies();
    }

    //arraylist of companies 
    public ArrayList<CompanyInterface> createCompanies(){
        ArrayList<CompanyInterface> list = new ArrayList<>();
        DepotFactory factory = new DepotFactory();

        for(int i=1;i<=3;i++){

            //creating the 3 needed companies. Each has the name and depots
            switch(i){
                case 1:
                    list.add(new Company("A",factory.getDepot("A")));
                    break;
                case 2:
                    list.add(new Company("B",factory.getDepot("B")));
                    break;

                case 3:
                    list.add(new Company("C",factory.getDepot("C")));
                    break;
            }

        }
        return list;
    }


}

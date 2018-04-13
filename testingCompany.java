/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commercialtradesystem.OODP;

/**
 *
 * @author mynahone0
 */
public class testingCompany {
    
    
    public static void main(String[] args) {
   
                                           
    Company companyA = CompanyFactory.getCompany("A");
    Company companyB = CompanyFactory.getCompany("B");
    Company companyC = CompanyFactory.getCompany("C");
                                           
    
    System.out.println("Company A Config::"+ companyA.getCompanyType());
    System.out.println("Company B Config::"+ companyB.getCompanyType());
    System.out.println("Company C Config::"+ companyC.getCompanyType());
    
    }

    
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcalculator1;

import java.util.Scanner;


/**
 *
 * @author himmiller
 */
public class BudgetCalculator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
       
        int BudgetAmmount;
        double essentials;
        double bills;
        double yourself;
        double halfRate;
        double twoRate;
        double threeRate;
       
       Scanner keyboard = new Scanner(System.in);
       
       
       System.out.println("How much would you like to budget?");
       BudgetAmmount = keyboard.nextInt();
       
       
       halfRate = .5;
       twoRate = .2;
       threeRate = .3;
       
       essentials = BudgetAmmount * halfRate;
       bills = BudgetAmmount * twoRate;
       yourself = BudgetAmmount * threeRate;
       
      
      System.out.println("");
      System.out.println("");
      System.out.println("Ok, so you should set asside $" + essentials + " for"
       + "essentials");
      System.out.println("");
      System.out.println("Take $" + bills + " to pay debts.");
      System.out.println("");
      System.out.println("and keep $" + yourself + " for yourself.");
    }
    
}

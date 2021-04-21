/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author A R F T
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input =0;
        NewCustomerDiscount c= new NewCustomerDiscount();
        LoyalCustomerDiscount l= new LoyalCustomerDiscount();
        ShopBasedDiscount s= new ShopBasedDiscount();
        Scanner obj = new Scanner(System.in);
        int b=0;
        int d=0;
        do
        {
            System.out.println("Choose the following option:");
            System.out.println("1 for New Customer Discount.");
            System.out.println("2 for Loyal Customer Discount");
            System.out.println("3 for Sh0pping base Customer Discount");
            System.out.println("0 to exit");
            input=obj.nextInt();
            
            switch (input)
            {
                case 1:
                    System.out.println("Enter your bill:");
                    b=obj.nextInt();
                    Apply.process(c, b);
                    break;
                case 2:
                    System.out.println("Enter your bill:");
                    b=obj.nextInt();
                    Apply.process(l, b);
                    break;
                case 3:
                    System.out.println("Enter your bill:");
                    b=obj.nextInt();
                    Apply.process(s, b);
                    break;
                case 0:
                    System.out.println("Thank you for shopping");
                    
                    break;
                default:
                    System.out.println("Wrong input");
                    
            }
        }
        while(input !=0);
        
     
    }
    
}

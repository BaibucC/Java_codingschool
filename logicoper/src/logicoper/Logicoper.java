/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicoper;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Logicoper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pirmais skaitlis: ");
        int num1 = sc.nextInt();
        System.out.println("Otrais skaitlis: ");
        int num2 = sc.nextInt();
        
        if(num1==num2){
            System.out.println("Abi skaitļi ir vienādi");
        }
        else{
            System.out.println("Abi skaitļi nav vienādi");
        }
        
        if(num1 != num2){
            System.out.println("Abi skaitļi nav vienādi");
        }
        else{
            System.out.println("Abi skaitļi ir vienādi");
        }
        
        if(num1 > num2){
            System.out.println("Pirmais skaitlis ir lielāks par otro");
        }
        else{
            System.out.println("Pirmais skaitlis nav lielāks par otro");
        }
        
        if(num1 >= num2){
            System.out.println("Pirmais skaitlis ir lielāks vai vienāds ar otro skaitli");
        }
        else{
            System.out.println("Pirmais skaitlis ir mazāks nekā otrais skaitlis");
        }
        
        if(num1 < num2){
            System.out.println("Pirmais skaitlis ir mazāks nekā otrais skaitlis");
        }
        else{
            System.out.println("Pirmais skaitlis nav mazāks par otro skaitli");
        }
        
        if(num1 <= num2){
            System.out.println("Pirmais skaitlis ir mazāks vai vienāds ar otro skaitli");
        }
        else{
            System.out.println("Pirmais skaitlis ir lielāks par otro skaitli");
        }
        
        
//        Ternery operator
        System.out.println("Ievadiet skaitli: ");
        int num3, num4;
        num3 = sc.nextInt();
        num4 = (num3 == 10) ? 100: 200;
        System.out.println("Skaitlis 2: "+num4);
        num4 = (num3 == 25) ? 100: 200;
        System.out.println("Skaitlis 2: "+num4);
    }
    
  
    
}

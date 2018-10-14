/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Ifstatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Skaitlis: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        if(num < 100){
//            System.out.println("Skaitlis ir mazāks par 100");
//        }
//        else{
//            System.out.println("Skaitlis ir lielāks par 100");
//        }



//Nested statement


//        System.out.println("Skaitlis: ");
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        if(num1 < 100){
//            System.out.println("Skaitlis ir mazāks par 100");
//            if(num1 > 50){
//                System.out.println("Skaitlis ir lielāks par 50");
//            }
//            else{
//                System.out.println("Skaitlis ir mazāks par 50");
//            }
//        }
//        else{
//            System.out.println("Skaitlis ir lielāks par 100");
//        }

        
        
        //it-else-if
        
        
        System.out.println("Skaitlis: ");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        if(num2<100 && num2>=1) {
            System.out.println("Divciparu skaitlis");
        }
        else if(num2<1000 && num2>=100){
            System.out.println("Trīsciparu skaitlis");
        }
        else if(num2<10000 && num2>=1000){
            System.out.println("Četrciparu skaitlis");
        }
        else{
            System.out.println("Skaitlis nav starp 1 un 9999");
        }
        
        System.out.println("Ievadiet skaitli1: ");
        int num3 = sc.nextInt();
        System.out.println("Ievadiet skaitli2: ");
        int num4 = sc.nextInt();
        System.out.println("Ievadiet skaitli3: ");
        int num5 = sc.nextInt();
        if(num3>=num4){
            if(num3>=num5){
                System.out.println(num3 + " ir vislielākais skaitlis");
            }
            else{
                System.out.println(num5 + " ir vislielākais skaitlis");
            }
        }
        else {
            if(num4>=num5){
                System.out.println(num4 + " ir vislielākais skaitlis");
            }
            else{
                System.out.println(num5 + " ir vislielākais skaitlis");
            }
        }
        
    }
    
}

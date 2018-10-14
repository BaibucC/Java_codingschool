/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Excercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//            //Smallest number out of three
//        Scanner sc = new Scanner(System.in);
//        System.out.println("First nummber: ");
//        int num1 = sc.nextInt();
//        System.out.println("Second number: ");
//        int num2 = sc.nextInt();
//        System.out.println("Third number: ");
//        int num3 = sc.nextInt();
//        
//        if (num2<num3){
//            if (num2<num1){
//                System.out.println("Smallest number is: " + num2);
//            } else{
//                System.out.println("Smallest number is: " + num1);
//            }
//        } else{
//            System.out.println("Smallest number is: " + num3);
//        }



//        //Average out of three
//        Scanner sc = new Scanner(System.in);
//        System.out.println("First nummber: ");
//        double num1 = sc.nextDouble();
//        System.out.println("Second number: ");
//        double num2 = sc.nextDouble();
//        System.out.println("Third number: ");
//        double num3 = sc.nextDouble();
//        double average = (num1+num2+num3)/3;
//        System.out.println("Average number is: " + average);



////Write a Java program to get a number from the user and print whether it is positive or negative.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter nummber: ");
//        double number = sc.nextDouble();
//        if(number>0){
//            System.out.println("Number is positive");
//        }else if(number<0){
//            System.out.println("Number is negative");
//        }else{
//            System.out.println("Number is 0");
//        }



////Fibonacci
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many numbers? ");
//        int count = sc.nextInt();
//        int num1 =0, num2 = 1;
//        System.out.println("Fibonacci of " + count + " series is: ");
//
//        int i=1;
//        while(i<=count){
//            System.out.println(num1 + " ");
//            int sum = num1+num2;
//            num1 = num2;
//            num2 = sum;
//            i++;
//        }


        System.out.println("skaitlis: ");
        Scanner sc = new Scanner(System.in);
        //int i = sc.nextInt();
         int arr[]={2,11,45,9};
         int i = 0;
         //i starts with 0 as array index starts with 0 too
         while(i<4){
              System.out.println(arr[0]);
              i++;
         }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int num1 = sc.nextInt();
        System.out.print("Second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int min = num1 - num2;
        int reiz = num1 * num2;
        int dal = num1 / num2;
        int mod = num1 % num2;
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + min);
        System.out.println(num1 + " X " + num2 + " = " + reiz);
        System.out.println(num1 + " / " + num2 + " = " + dal);
        System.out.println(num1 + " mod " + num2 + " = " + mod);        
    }
    
}

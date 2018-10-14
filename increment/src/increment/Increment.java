/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package increment;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Increment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pirmais skaitlis: ");
        int num1 = sc.nextInt();
        System.out.println("Otrais skaitlis: ");
        int num2 = sc.nextInt();
        num1++;
        num2--;
        System.out.println("Pirmais skaitlis +1 ir: " + num1);
        System.out.println("Otrais skaitlis -1 ir: " + num2);
    }
    
}

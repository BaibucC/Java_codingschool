/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reizrekins;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Reizrekins {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int sk = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(sk + "*" + i + " = " + (sk * i));
        }
    }
    
}

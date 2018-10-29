/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try_catch;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Try_catch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ievadiet skaitli! ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        try {
            num.matches("[a-zA-z]{1}");
            Character.isLetter(num);
        } catch (Exception e) {
            System.out.println("Nav ievadīts skaitlis");
        }
    }

}

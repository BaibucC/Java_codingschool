/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        int a = 5;
//        String b = "hehe";
//        boolean atbilst = a > 3 && b == "hehe";
//        if(atbilst){
//            System.out.println("5 un hehe: " + atbilst);
//        }
        System.out.println("Skaitlis:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //boolean value = true;
        boolean value = a >= 5;

        if (value) {
            System.out.println("ir");
        }
        if (!value) {
            System.out.println("nav");
        }

    }

}

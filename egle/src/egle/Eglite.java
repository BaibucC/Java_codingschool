/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egle;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Eglite {

    public void Zimet2() {
        String b = "*";

        System.out.println("Skaitlis no 1-50: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (t > 0 && t < 51) {
            for (int i = t; i > 0; i--) {

                for (int n = i; n > 0; n--) {
                    System.out.print(" ");
                }
                System.out.print(b);
                b = b + "**";
                System.out.println("");
            }
        } else {
            System.out.println("Skaitlim jābūt no 1 līdz 50!");
        }
    }

//    public void Zimet() {
//        String a = "";
//        for (int i = 0; i < 5; i++) {
//            a = a + "*";
//            System.out.println(a);
//        }
//    }
}

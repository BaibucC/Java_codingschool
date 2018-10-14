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
public class eglite {

    public void Zimet2() {
        String a = " ";
        String b = "";
        String c = "";

        System.out.println("Skaitlis no 1-50: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (t > 0 && t < 51) {
            for (int f = t; f > 0; f--) {

                for (int n = f; n > 0; n--) {
                    System.out.print(a);
                }
                b = b + "*";
                System.out.print(b);
                                System.out.print(c);
                c = c + "*";

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

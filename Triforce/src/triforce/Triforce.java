/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triforce;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Triforce {

    Scanner in = new Scanner(System.in);
    int N = 5;
    String star = "*";
    String empty = " ";
    String zvaigzne;

    public String star() {
        for (int i = N; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print(empty);

            }
            System.out.print(star);
            star = star + "**";

            System.out.println("()");

        }
        return zvaigzne;
    }

    public static void main(String args[]) {

        System.out.print("");

        Triforce stars = new Triforce();
        Triforce stars2 = new Triforce();
        Triforce stars3 = new Triforce();
        String zv2 = stars.star();
        String zv3 = stars2.star();
        //stars3.star();
        System.out.print(zv2 + zv3);
        //System.out.print(zv3);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }

}

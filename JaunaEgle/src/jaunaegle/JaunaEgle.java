/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaunaegle;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class JaunaEgle {

    public String repeat(String s, int times) {
        if (times <= 0) {
            return "";
        } else {
            return s + repeat(s, times - 1);
        }
    }

    public static void Zimet2() {
        System.out.println("Skaitlis no 1-50: ");
        Scanner sc = new Scanner(System.in);
        int y = 1;

        for (int t = sc.nextInt(); t > 0; t--) {
            JaunaEgle haha = new JaunaEgle();
            System.out.println(haha.repeat(" ", t) + haha.repeat("*", y++));
            y++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zimet2();
    }

}

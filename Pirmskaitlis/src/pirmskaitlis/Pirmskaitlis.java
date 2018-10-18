/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirmskaitlis;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Pirmskaitlis {

    public static void main(String[] args) {

        System.out.println("Ievadiet skaitli, ko pārbaudīt!");
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int a = sc.nextInt();
        for (int i = a-1; i > 1; i--) {
            if (a % i == 0) {
                t = t + 1;
            }
        }
        if (t > 0) {
            System.out.println("naff");
        } else {
            System.out.println("ir");
        }

    }

}

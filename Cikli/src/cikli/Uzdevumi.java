/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cikli;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Uzdevumi {

    //uztaisīt funkciju, kas izvada 1-10 stabiņā
    public void Desmit() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
    }

    public void Zvaigzne() {
        String a = "";
        for (int i = 0; i < 6; i++) {
            a = a + " *";
            System.out.println(a);
            if (i == 2) {
                break;
            }
        }
    }

    public void Minesana() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skaitlis 1: ");
        int a = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Skaitlis 2: ");
            int b = sc.nextInt();
            if (b == a) {
                System.out.println("Skaitļi vienādi!");
                break;
            } else {
                if (i==4) {
                    System.out.print("Spēle beigusies!");
                } else {
                    System.out.print("Mēģiniet vēlreiz! ");
                }

            }
        }

    }

}

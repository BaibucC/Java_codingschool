/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.Arrays;
import java.util.Scanner;

public class uzd {

    public void VaiIrBurts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet burtu");
        char burts = sc.next().charAt(0);
//        Character.isDigit(k) utt.
        boolean vaiIrBurts = true;
        vaiIrBurts = Character.isLetter(burts);
        if (vaiIrBurts) {
            System.out.println("Burts");
        } else if (!vaiIrBurts) {
            System.out.println("nav burts");
        }
        System.out.println(vaiIrBurts);
    }

    public void Skaitli() {
        //izdrukā skaitļu array, ko ievada cilvēks
        Scanner sc = new Scanner(System.in);
        System.out.println("Skaitļu daudzums:");
        int plat = sc.nextInt();
        double[] Array = new double[plat];

        for (int i = 1; i <= Array.length; i++) {
            System.out.println((i) + ". skaitlis:");
            Array[i - 1] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(Array));
    }
}

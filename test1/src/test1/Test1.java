/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kā Tevi sauc?");
        Scanner ab = new Scanner(System.in);
        String vards = ab.nextLine();
        System.out.println("Sveiki, " + vards + "! " + "Kā Tev iet?");
        String kaIet = ab.nextLine();
        System.out.println("Man prieks, ka Tev iet " + kaIet);
        System.out.println("Cik Tev gadu?");
        String gadi = ab.nextLine();
        System.out.println("Oho! " + gadi + "? Daudz gan!");
        System.out.println("Gribi zināt, cik man gadu?");
        String jaut = ab.nextLine();
        System.out.println(jaut + "?");
        int a = 10, b = 20, c = 30;
        System.out.println("a, b vai c?");
        Scanner sc = new Scanner(System.in);
        String atbilde = sc.nextLine();
        System.out.println(atbilde);

        System.out.println("Sveiki, kā iet?");
        Scanner ac = new Scanner(System.in);
        String kaIet2 = ac.nextLine();
        System.out.println("Forši, ka iet " + kaIet2);


    }
    
}

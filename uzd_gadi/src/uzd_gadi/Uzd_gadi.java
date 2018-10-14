/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzd_gadi;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Uzd_gadi {

    public static int gadi(int sk1, int sk2){
        Scanner sc = new Scanner(System.in);
        System.out.println("pirmais skaitlis");
        sk1 = sc.nextInt();
        System.out.println("otrais skaitlis");
        sk2 = sc.nextInt();
        int rezultats = sk1 - sk2;
        System.out.println("Rezultāts: " + rezultats);
        return rezultats;
    }
    

    public static void main(String[] args) {
        gadi(3,5);
    }
    
}

//
//    public static void dzimsanasGadaAprekins(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Kāds ir tekošais gads?");
//        int gads1 = sc.nextInt();
//
//        System.out.println("Kāds ir dzimšanas gads?");
//        int gads2 = sc.nextInt();
//    }
//    
//    public static void saskaitisana(int num1, int num2){
//        Scanner sc = new Scanner(System.in);
//        int rezultats = num1 - num2;
//        System.out.println("Jums ir " + rezultats + " gadi.");
//    }
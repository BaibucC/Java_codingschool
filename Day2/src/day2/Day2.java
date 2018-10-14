/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli: ");
        int num1 = sc.nextInt();
        System.out.println("Ievadiet otro skaitli: ");
        int num2 = sc.nextInt();
        //ievadot burtus, 
        //izmetīs kļūdu, vēlāk mācīs šito
        int rez = num1 + num2;
        System.out.println("Rezultāts ir: " + rez);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Kāds ir tekošais gads?");
        int num1 = sc.nextInt();

        System.out.println("Kāds ir dzimšanas gads?");
        int num2 = sc.nextInt();

        System.out.println("Jums ir " + (num1 - num2) + " gadi.");*/
        
//alt + shift + f = sakārto visu failu, atsarpes utt
//ctrl+/ izveido visu rindu par komentāru
//       dzimsanasGadaAprekins();
//        dzimsanasGadaAprekins();
//        dzimsanasGadaAprekins();
        
//        saskaitisana(4,5);
//        saskaitisana(100,53);
//        int a = 5;
//        saskaitisana(a,6);


//uzdevums - ievada cilvēks, vērtības atņem

//        saskaitisana(num1, num2);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Kāds ir tekošais gads?");
//        int num1 = sc.nextInt();
//
//        System.out.println("Kāds ir dzimšanas gads?");
//        int num2 = sc.nextInt();

//        atnemsana();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Kāds ir tekošais gads?");
//        int a = sc.nextInt();
//
//        System.out.println("Kāds ir dzimšanas gads?");
//        int b = sc.nextInt();  
        //ievade();
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Kāds ir tekošais gads?");
        int sk1 = sc.nextInt();

        System.out.println("Kāds ir dzimšanas gads?");
        int sk2 = sc.nextInt();
        
//        int citsRezultats = reizinasana(sk1, sk2);
//        int a = citsRezultats +7;
        atnemsana(sk1, sk2);
//        System.out.println(a);

            
            
    }
    //funkcijas, raksta klasē
    public static void dzimsanasGadaAprekins(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kāds ir tekošais gads?");
        int gads1 = sc.nextInt();

        System.out.println("Kāds ir dzimšanas gads?");
        int gads2 = sc.nextInt();
    }
    
    public static void saskaitisana(int num1, int num2){
    //int skaitlis 1 un 2 ir parametri
        Scanner sc = new Scanner(System.in);
        int rezultats = num1 - num2;
        System.out.println("Jums ir " + rezultats + " gadi.");
    }
    
        public static void atnemsana(int num1, int num2){
    //int skaitlis 1 un 2 ir parametri
        int rezultats = num1 - num2;
        System.out.println("Jums ir " + rezultats + " gadi.");
    }
    
        public static void ievade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kāds ir tekošais gads?");
        int sk1 = sc.nextInt();

        System.out.println("Kāds ir dzimšanas gads?");
        int sk2 = sc.nextInt();
        
        int citsRezultats = reizinasana(sk1, sk2);
        int a = citsRezultats +7;
        reizinasana(4,5);
        System.out.println(a);
        }
        
        //void - funkcija neatdod vērtību
        //raksta int utt, lai strādātu ar konkrētu tipu
        public static int reizinasana(int sk1, int sk2){
          int rezultats = sk1 * sk2;
          return rezultats; //vērtību var dabūt ārā no funkcijas
        }
}

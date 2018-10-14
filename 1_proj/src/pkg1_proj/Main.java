/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_proj;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* System.out.println("Hello world!");
        System.out.println("Mani sauc Baiba.");
        System.out.println("Es mācos programmēt.");
       //vienmēr jānorāda tips, mainīgā deklarācija
       //mainīgo var definēt vairākkārt, darbojas starp {} iekavām
       //mainīgā nosaukums var būt jebkas
        int skaitlis = 5; //vesels skaitlis
        skaitlis = 8;
        skaitlis = 12;
        System.out.println(skaitlis);
        skaitlis = 7 * 3;
        System.out.println(skaitlis);
        skaitlis = 100 + 5;
        System.out.println(skaitlis);
        
        float arKomatu = 5.3f; //viens ar komatu
        double otrsArKomatu = 4.5; //labāk lietot double tipu, jo daudz garāks
        System.out.println(arKomatu);
        System.out.println(otrsArKomatu);
        char simbols = '%';
        System.out.println(simbols);
        char simbolsArSkaitli = '5'; //5 nav skaitlis, bet gan simbols
        String SimboluVirkne = "šī ir virkne"; //String ar lielo burtu
        SimboluVirkne = "5 + 8";
        System.out.println(SimboluVirkne + " cits " + "kaut kas " + skaitlis);
        //viss, kas ir starp pēdiņām, parādās arī atstarpes
        boolean jaVaiNe = true;
        jaVaiNe = false;
        
        //scanner ir klase, lai cilvēks varētu kaut ko ievadīt
        Scanner sc = new Scanner(System.in);
        SimboluVirkne = sc.nextLine(); //add import, ja neiet tas scanner
        System.out.println(SimboluVirkne);*/
        

        System.out.println("Sveiki!");
        System.out.println("Kā Jūs sauc?");
        Scanner sc = new Scanner(System.in);
        String vards = sc.nextLine();
        System.out.println("Sveiki, " + vards + "!");
        System.out.println("Kā Tev iet?");
        Scanner ab = new Scanner(System.in);
        String kaIet = ab.nextLine();
        System.out.println("Lieliski!");
        
    }
}

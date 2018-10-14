/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Izvade();
//        int rez = Saskaitit();
//        Saskaitit(); //ja nevajag vērtību, var bez mainīgajiem, tad nesaglabāsies
//        
        /*Scanner sc = new Scanner(System.in);
        String abc = sc.nextLine();
        Izvade2("Šis ir teksts", "zvaigznite", 3);*/
        //ja funkcijā ir vairāki parametri, visus ir jānorāda
        //Izvade2(abc);
        
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Pirmais vārds: ");
        String vards1 = sc.nextLine();
        System.out.println("Otrais vārds: ");
        String vards2 = sc.nextLine();
        System.out.println("Trešais vārds: ");
        String vards3 = sc.nextLine();*/
        
        //KRUTĀKS VARIANTS, LAI MAZĀK RINDU
      /*  String vards1 = VardaIevade();
        String vards2 = VardaIevade();
        String vards3 = VardaIevade();
        
                
        String rezultats = Ievade(vards1, vards2, vards3);  
        System.out.println(rezultats);*/
      
      
      //Zarosanas();
      
      Salidzinat();
    }
    
    public static void Izvade(){
        int c = Saskaitit();
    }
    
    public static int Saskaitit(){
        return 1+2;
    }
    
    public static void Izvade2(String teksts, String teksts2, int a){
        System.out.println(teksts);
    }
    
    public static String Ievade(String a, String b, String c){
//        System.out.println(vards1 + vards2 + vards3);
//        String rezultats = vards1 + " " + vards2 + " " + vards3;
        return a + " " + b + " " + c;
    }
    
    
    public static String VardaIevade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet vārdu: ");       
        return sc.nextLine();
    }
    
    public static void Zarosanas(){
        
        int a = 5;
        
        if(a >= 6){
            System.out.println("skaitlis ir lielāks vai vienāds ar 6");
    }
        else{
            System.out.println("skaitlis ir mazāks par 6");
    }
        
    }
    
//    String d = "Coding";
//    if(d.equals("Coding")){
//            System.out.println("der");
//}    else{
//            System.out.println("neder");    
    

    public static void Salidzinat(){
        System.out.println("Ievadiet skaitli: ");
        Scanner sc = new Scanner(System.in);
        double skaitlis = sc.nextDouble();
        if(skaitlis > 15.5){
            System.out.println("##");
    }else if(skaitlis == 15.5){
            System.out.println("vienāds");
    }else{
            System.out.println("#");
        }

}    
    
    
//   mājas darbs = uztaisīt funkcijas saskaitīt vai atņemt un tad no cilvēku izvēles arūī izsaukt attiecīgo funkciju, divus skaitļus izsauc 
    
    
}
    
//ievada cilvēks skaitli, pārbauda, 15.5 ja lielāks 2 restītes, ja mazāks viena restīte


//return rezultātu var izsaukt gan main funkcijā, gan citās funkcijās
//void nozīmē, ka nav tipa (int, string utt)
//funkcija ir kā sagatave

// != nav vienāds ar kreiso pusi
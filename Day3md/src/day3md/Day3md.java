/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3md;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Day3md {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Ievade();

        //uzd - kalk funkciju pārveidot un pārvietot uz jaunu klasi, lai datu ievade notiktu galvenajā klasē
        //izsaucam objektu
//        JaunaKlase piemers = new JaunaKlase();
//        piemers.Izvade();
//        int a = piemers.Atgriez();
//        
//        JaunaKlase piemers2 = new JaunaKlase();
//        piemers2.Izvade();  
        Calc jauns = new Calc();
        jauns.vards = "Baiba";
        jauns.Izvade();


/*
        //private var izmantot tikai klases iekšpusē
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadiet pirmo skaitli: ");
        double number1 = sc.nextDouble();
        System.out.print("Ievadiet pirmo skaitli: ");
        double number2 = sc.nextDouble();
        System.out.println("+ vai -?");
        String function = sc.next();

        Calc aprekins = new Calc();
        aprekins.kalkulators(number1, number2, function);
        aprekins.kalkulators(5, 6, "+");
        
        Calc saskaitisana = new Calc();
        int rezultats = saskaitisana.Saskaitit(4, 108);
        System.out.println(rezultats);
*/
    }

//funkcijas
    public static void Ievade() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadiet pirmo skaitli: ");
        double number1 = sc.nextDouble();
        System.out.print("Ievadiet pirmo skaitli: ");
        double number2 = sc.nextDouble();

        System.out.println("+ vai -?");
        String function = sc.nextLine();

        /*if (function.equals("+")) {
            Summa(number1, number2);
        } else if (function.equals("-")) {
            Minus(number1, number2);
        } else {
            System.out.println("Kļūda!");
        }*/
        if (function.equals("+")) {
            System.out.print("Rezultāts: ");
            System.out.println(number1 + number2);
        } else if (function.equals("-")) {
            System.out.print("Rezultāts: ");
            System.out.println(number1 - number2);
        } else {
            System.out.println("Kļūda!");
        }
    }

    
    double kapinats = Math.pow(4.6, 3.4);
    
    
    /*public static double Summa(double a, double b) {
        double sum = a + b;
        System.out.println("Rezultāts: " + sum);
        return sum;
    }

    public static double Minus(double a, double b) {
        double min = a - b;
        System.out.println("Rezultāts: " + min);
        return min;
    }*/
    public static double Skaitlis() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadiet pirmo skaitli: ");
        return sc.nextDouble();
    }

}

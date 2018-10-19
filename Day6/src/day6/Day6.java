/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//            double skaitlis1 = SkaitlaIevade();
//            double skaitlis2 = SkaitlaIevade();
//            int pakape = PakapesIevade();
        String izvele = ""; //nodefinē tukšumu, lai var salīdzināt
        while (!izvele.equals("iziet")) {

            System.out.println("Saskaitīt (+), atņemt (-), kāpināt (*) vai faktoriāls (f)?");
            System.out.println("(Rakstīt 'iziet', lai izietu.)");
            Scanner sc = new Scanner(System.in);
            izvele = sc.nextLine();

            Aprekini sask = new Aprekini();
            double skaitlis1, skaitlis2;
            int pakape;
            int fakt;

            switch (izvele) {
                case "+": {
                    skaitlis1 = SkaitlaIevade();
                    skaitlis2 = SkaitlaIevade();
                    System.out.println("Summa ir: " + sask.Saskaitit(skaitlis1, skaitlis2) + "\n");
                    break;
                }
                case "-": {
                    skaitlis1 = SkaitlaIevade();
                    skaitlis2 = SkaitlaIevade();
                    System.out.println("Atņemšanas rezultāts ir: " + sask.Atnemt(skaitlis1, skaitlis2) + "\n");
                    break;
                }
                case "*": {
                    skaitlis1 = SkaitlaIevade();
                    pakape = PakapesIevade();
                    System.out.println("Kāpināšanas rezultāts ir: " + sask.Kapinasana(skaitlis1, pakape) + "\n");
                    break;
                }
                case "f": {
                    System.out.println("Ievadiet skaitli: ");
                    fakt = sc.nextInt();
                    System.out.println("Faktoriāls ir: " + sask.Faktor(fakt) + "\n");
                    break;
                }
                case "iziet": {
                    break;
                }
                default: {
                    System.out.println("Nepareizi!");
                    break;
                }
            }
        }
    }

    //faktoriālus uztaisīt. ievada vienu skaitli
    //4 = 4+3+2+1, 
    
    public static double SkaitlaIevade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli! ");
        double result = sc.nextDouble();
        return result;
    }

    public static int PakapesIevade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet pakāpi! ");
        int result = sc.nextInt();
        return result;
    }

}

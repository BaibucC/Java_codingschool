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
double a = 3;
int b = 3;
                    Aprekini kap = new Aprekini();
                    System.out.println("Rezultats:" + kap.Kapinasana(a, b));
        
        
        
        String izvele = ""; //nodefinē tukšumu, lai var salīdzināt
        while (!izvele.equals("iziet")) {
            double skaitlis1 = SkaitlaIevade();
            double skaitlis2 = SkaitlaIevade();
            System.out.println("Saskaitīt (+) vai atņemt (-)?");
            System.out.println("Rakstīt 'iziet', lai izietu.");
            Scanner sc = new Scanner(System.in);
            izvele = sc.nextLine();

            Aprekini sask = new Aprekini();

            switch (izvele) {
                case "+": {
                    System.out.println("Summa ir: " + sask.Saskaitit(skaitlis1, skaitlis2));
                    break;
                }
                case "-": {
                    System.out.println("Atņemšanas rezultāts ir: " + sask.Atnemt(skaitlis1, skaitlis2));
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

        //izsaukt saskaitisanu
        //switch case lai cilvēks izvēlas, saskaitīt vai atņemt vai nepareiza ievade
        //
    }

    public static double SkaitlaIevade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli! ");
        double result = sc.nextDouble();
        return result;
    }

}

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

            System.out.println("Saskaitīt (+), atņemt (-) vai kāpināt (*)?");
            System.out.println("(Rakstīt 'iziet', lai izietu.)");
            Scanner sc = new Scanner(System.in);
            izvele = sc.nextLine();

            Aprekini sask = new Aprekini();

            switch (izvele) {
                case "+": {
                    double skaitlis1 = SkaitlaIevade();
                    double skaitlis2 = SkaitlaIevade();
                    System.out.println("Summa ir: " + sask.Saskaitit(skaitlis1, skaitlis2) + "\n");
                    break;
                }
                case "-": {
                    double skaitlis1 = SkaitlaIevade();
                    double skaitlis2 = SkaitlaIevade();
                    System.out.println("Atņemšanas rezultāts ir: " + sask.Atnemt(skaitlis1, skaitlis2) + "\n");
                    break;
                }
                case "*": {
                    double skaitlis1 = SkaitlaIevade();
                    int pakape = PakapesIevade();
                    System.out.println("Kāpināšanas rezultāts ir: " + sask.Kapinasana(skaitlis1, pakape) + "\n");
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

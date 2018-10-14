/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uzdevumi teksts = new Uzdevumi();
        //System.out.println(teksts.Atbilde());

        Uzdevumi gar = new Uzdevumi();
        //System.out.println(gar.Salidzinat());
        //no objekta izsauc funkciju

        //BOOLEAN
        System.out.println("Ievadiet skaitli");
        Scanner sc = new Scanner(System.in);
        int skaitlis = sc.nextInt();

        //izvada true vai false
        System.out.println(gar.Skaitlis(skaitlis));

        //izvada vii vai vii2
        if (gar.Skaitlis(skaitlis)) {
            System.out.println("vii1");
        } else {
            System.out.println("vii2");
        }

    }

}

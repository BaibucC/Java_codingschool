/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matem;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Matem {

    public static int rezultats(int num, int pak) {
        // int rez = num;
        if (pak <= 1) {
            return num;
        } else {
            for (int i = pak; i > 0; i--) {
                int rez = num * num;
                i--;

                rez = rez * num;
                return rez;

            }
        }

        return num;
    }
       
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skaitlis: ");
        int num = sc.nextInt();
        System.out.println("Kādā pakāpē? ");
        int pak = sc.nextInt();
        int rez = (int) Math.pow(num, pak);

        System.out.println("Skaitlis '" + num + "' " + pak + ".pakāpē ir: " + rez);
    }

}

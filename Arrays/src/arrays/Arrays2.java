/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author Baiba
 */
public class Arrays2 {

    public static void main(String[] args) {
        //double[] myList; // preferred way.
        //double myList[];   // works but not preferred way.

        int[] skaitli1 = new int[5];
        int[] skaitli = {9, 8, 3, 5, 1};
        for (int i = 0; i < skaitli.length; i++) {
            System.out.println(i + ".skaitlis ir " + skaitli[i]);
        }

        int result = 0;
        for (int i = 0; i < skaitli.length; i++) {
            result += skaitli[i];
        }
        System.out.println("Summa ir: " + result);

        int max = skaitli[0];
        for (int i = 1; i < skaitli.length; i++) {
            if (skaitli[i] > max) {
                max = skaitli[i];
            }
        }
        System.out.println("Lielākais skaitlis ir: " + max);

        Arrays.sort(skaitli);
        System.out.println(Arrays.toString(skaitli));

        double m[][] = {
            {0 * 0, 1 * 0, 2 * 0, 3 * 0},
            {0 * 1, 1 * 1, 2 * 1, 3 * 1},
            {0 * 2, 1 * 2, 2 * 2, 3 * 2},
            {0 * 3, 1 * 3, 2 * 3, 3 * 3}
        };
        int[][] lauks = new int[4][4];
        {}
        System.out.println(Arrays.deepToString(lauks));
        }

    }

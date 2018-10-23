/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10_console;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Day10_console {

    public static void skaitli() {
        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void skaitli2() {
        int[][] arr = new int[4][4];
        boolean vaiPara = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { //izejam vienai rindai cauri
                if (vaiPara == true) { //nodefinējam, kas ir true boolean versija
                    arr[i][j] = 1;

                } else {
                    arr[i][j] = 0;
                    
                }
                System.out.print(arr[i][j]);
                
                
            }
            vaiPara = !vaiPara;  //apmetam ripā boolean
            
            System.out.println();
            
        }
    }

    public static void main(String[] args) {

        //skaitli();
        skaitli2();

    }

}

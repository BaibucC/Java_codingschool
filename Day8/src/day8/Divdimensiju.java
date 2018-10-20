/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

/**
 *
 * @author user
 */
public class Divdimensiju {

    public void ParastsPiemers() {

        int[][] pirmais = new int[3][3];
        pirmais[0][0] = 1;
        pirmais[0][1] = 2;
        pirmais[0][2] = 3;
        pirmais[1][0] = 4;
        pirmais[1][1] = 5;
        pirmais[1][2] = 6;
        pirmais[2][0] = 7;
        pirmais[2][1] = 8;
        pirmais[2][2] = 9;
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(pirmais[i][j]);
            }
            System.out.println("");
        }
    }

}

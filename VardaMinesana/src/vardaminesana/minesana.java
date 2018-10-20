/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vardaminesana;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class minesana {

    public void minesana() {
        System.out.println("Ievadiet vārdu: ");
        Scanner sc = new Scanner(System.in);
        String vards = sc.nextLine();

        //String sadalīšana pa burtiem
        char[] array = vards.toCharArray();
        char[] tukss = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            tukss[i] = '*';
        }
        System.out.println(tukss);
        //System.out.println(array);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ievadiet burtu!");
            char burts = sc.next().charAt(0);

            for (i = 0; i < array.length; i++) {
                if (burts == array[i]) {
                    
                        tukss[i] = array[i];
                    System.out.print(tukss[i]);
                }else{
                    System.out.print(tukss[i]);
                }
                

            }
            System.out.println();

        }

    }

}

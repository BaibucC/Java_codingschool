/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vardaminesana;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class minesana {

    char burts;
    char[] tukss;
    char[] array;
    boolean vaiPilns = true;

    public void VisiLielie() {
        if (Character.isLowerCase(burts)) {
            burts = Character.toUpperCase(burts);
        }
    }

    public void Parbaude() {
        //cikls, kas iet cauri vārda burtiem
        for (int i = 0; i < array.length; i++) {
            this.VisiLielie();
            if (this.burts == array[i]) {
                tukss[i] = array[i];
                System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
                System.out.println(tukss[0] + " " + tukss[1] + " " + tukss[2] + " " + tukss[3] + " " + tukss[4]);
            }
            if (tukss == array) {
                vaiPilns = true;
            }
        }
        //System.out.print(tukss);

    }

    public void minesana() {
        System.out.println("Ievadiet vārdu: ");
        Scanner sc = new Scanner(System.in);
        String vards = sc.nextLine();
        vards = vards.toUpperCase();
        //String sadalīšana pa burtiem masīvā
        array = vards.toCharArray();
        tukss = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            tukss[i] = '*';
        }
        System.out.println(tukss);
        //System.out.println(array);

        System.out.println(!vaiPilns);
        while (vaiPilns) {
            System.out.println("\nIevadiet burtu!");
            burts = sc.next().charAt(0);
            this.Parbaude();
            if(vaiPilns){
                System.out.println("pilns");
            }
        }

    }

}

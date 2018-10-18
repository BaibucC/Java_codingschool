/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middlechar;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class MiddleChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ievadiet vārdu: ");
        Scanner sc = new Scanner(System.in);
        String vards = sc.nextLine();
        System.out.println("Vārda vidējais burts ir: " + middle(vards));

    }

    public static String middle(String vards) {
        int position;
        int length;

        if (vards.length() % 2 == 0) {
            position = vards.length() / 2 - 1;
            length = 2;
        } else {
            position = vards.length() / 2;
            length = 1;
        }
        return vards.substring(position, position+length);
    }
}

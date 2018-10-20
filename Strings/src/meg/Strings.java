/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meg;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ievadiet vārdu: ");
        Scanner sc = new Scanner(System.in);
        String vards = sc.nextLine();

        //String sadalīšana pa burtiem
        char[] array = vards.toCharArray();
        System.out.println(array);

        for (int i = 0; i < vards.length(); i++) {
            System.out.println(array[i]);
        }
        System.out.println("3.burts ir: " + array[3]);

        
        
        //apgriešana
//        String vards1 = "    zebiekste   ";
//        System.out.println("Pirms apgriešanas " + vards1);
//        System.out.println("Pēc apgriešans: " + vards1.trim());
//
//        String message = String.join("*", "Šodien", "ir", "labs", "laiks + " + vards + " + " + vards1.trim());
//        System.out.println(message);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Garums: ");
        double gar = sc.nextDouble();
        System.out.println("Platums: ");
        double plat = sc.nextDouble();
        double laukums = plat * gar;
        double perimetrs = 2 * (plat + gar);
        System.out.println("Laukums ir  " + laukums);
        System.out.println("Perimetrs ir: " + perimetrs);
    }
    
}

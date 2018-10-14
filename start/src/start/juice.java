/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

import java.util.Scanner;

/**
 *
 * @author Baiba
 * ENUMS
 */
public class juice {
    enum juiceSize{ SMALL, MEDIUM, LARGE};


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENUMS
        System.out.println("izmērs?");
        juice sula = new juice();
        Scanner sc = new Scanner(System.in);
        String juiceSize = sc.next();
        System.out.println("Size: " + juiceSize);
        
    }
    
}

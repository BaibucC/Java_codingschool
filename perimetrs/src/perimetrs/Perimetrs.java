/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrs;
import java.util.Scanner;



public class Perimetrs {

//private static double radius() {
//Scanner sc = new Scanner(System.in);
//double n = sc.nextDouble();
//    return 0;
//}
    
//    private static final double radius = 7.5;

    public static void main(String[] args) {

        System.out.println("Rādiuss: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimetrs ir: " + perimeter);
        System.out.println("Laukums ir: " + area);
    }
    
}

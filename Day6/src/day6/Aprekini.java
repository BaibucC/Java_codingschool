/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author user
 */
public class Aprekini {

    public double Saskaitit(double a, double b) {
        double result = a + b;
        return result;
    }

    public double Atnemt(double a, double b) {
        double result = a - b;
        return result;
    }

    public double Kapinasana(double a, int pakape) {
        double d = a;
        for (int i = pakape - 1; i > 0; i--) {
            a = a * d;
        }
        return a;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

/**
 *
 * @author user
 */
public class Aprekini {

    public double Sum(double a, double b) {
        double result = a + b;
        result = result * 100000;
        result = Math.round(result);
        result = result / 100000;
        return result;
    }

    public double Minus(double a, double b) {
        double result = a - b;
        result = result * 100000;
        result = Math.round(result);
        result = result / 100000;
        return result;
    }

    public double Multi(double a, double b) {
        double result = a * b;
        result = result * 100000;
        result = Math.round(result);
        result = result / 100000;
        return result;
    }

    public double Div(double a, double b) {
        double result = a / b;
        result = result * 100000;
        result = Math.round(result);
        result = result / 100000;
        return result;
    }

}

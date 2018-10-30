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
        return result;
    }

    public double Minus(double a, double b) {
        double result = a - b;
        return result;
    }

    public double Multi(double a, double b) {
        double result = a * b;
        return result;
    }

    public double Div(double a, double b) {
        double result = a / b;
<<<<<<< HEAD
        result = result * 10000;
        result = Math.round(result);
        result = result / 10000;
=======
        result = result * 100000;
        result = Math.round(result);
        result = result / 100000;
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        return result;
    }

}

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

    public int Faktor(int a) {
        /*int result = a;
        for (int i = 1; a > i; i++){
            result = result*(a-1);
            System.out.println(a + "=" + "result ir" + result);
            a--;
        }
        return result;*/
        /*mans variants, kas strada
        int result = a;
        for (int i = a; i > 1; i--) {
            result = result * i;
            //System.out.println(a + "=" + "result ir" + result);
        }
        return result;*/
        
        
        int result = 1;
        for (int i = 1; i < a + 1; i++) {
            result = result * i;
        }
        return result;

    }

    public double Kapinasana(double a, int pakape) {
        /*double result = a;
        for (int i = pakape - 1; i > 0; i--) {
            a = result * a;
        }
        return a; */

        double result = a;
        for (int i = 1; i < pakape; i++) {
            result *= a; // tas pats, kas result = a*a;
        }
        return result;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3md;

/**
 *
 * @author user
 */
public class Calc {
    public String vards = "tukšs";

    public void kalkulators(double number1, double number2, String function) {
        if (function.equals("+")) {
            System.out.print("Rezultāts: ");
            System.out.println(number1 + number2);
        } else if (function.equals("-")) {
            System.out.print("Rezultāts: ");
            System.out.println(number1 - number2);
        } else {
            System.out.println("Kļūda!");
        }
    }
    
    public int Saskaitit(int a, int b){
        return a + b;
        //ja jāatgriež rezultāts, tad int raksta augšā
    }
    
    public void Izvade(){
        System.out.println("Mans vards ir " + vards);
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopsbasics;

/**
 *
 * @author Baiba
 */
//overloading
class Overload {

    public void disp(char c) {
        System.out.println(c);
    }

    public void disp(char c, int b) {
        System.out.println(c + "+" + b);
    }

    public void disp(char c, int b, String vards) {
        System.out.println(c + "+" + b + "+" + vards);
    }
}

public class OOPsBasics {
//class and constructor

    /*String name;
    int age;

    OOPsBasics(String vards, int vecums) {
        this.name = vards;
        this.age = vecums;
    }*/
    public static void main(String[] args) {
        //class and constructor
        /*OOPsBasics user1 = new OOPsBasics("Baiba", 30);
        OOPsBasics user2 = new OOPsBasics("Matīss", 35);
        System.out.println("User1 is: " + user1.name +" "+ user1.age);
        System.out.println("User2 is: " + user2.name +" "+ user2.age);*/

        //overloading
        Overload disp1 = new Overload();
        disp1.disp('a');
        disp1.disp('r', 5, "bumba");
        disp1.disp('t', 9);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Random {

    public static void main(String[] args) {
//cilvēks ievada skaitļus, saglabā masīvā un tos izdrukā
        uzd skaitli = new uzd();
        skaitli.Skaitli();

//pārbauda, kas ir ievadītais simbols/ boolean      
        uzd burts = new uzd();
        burts.VaiIrBurts();

    }

}

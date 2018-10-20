/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Egle {

    public void zimet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet maksimālo platumu: ");
        int plat = sc.nextInt();

        String[] zvaigznes = new String[plat];

        for (int i = 0; i < zvaigznes.length; i++) {
            if (i == 0) {
                zvaigznes[i] = "*";
            } else {
                zvaigznes[i] = zvaigznes[i - 1] + "*";
                //i-1 nozīmē, ka piekļūstam iepriekšējai zvaigznītei un tad pieplusojam vēl vienu zvaigznīti
            }
            System.out.println(zvaigznes[i]);
        }

        for (int i = zvaigznes.length - 2; i > -1; i--) {
            System.out.println(zvaigznes[i]);
        }

    }

    public void Minesana() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli: ");
        int skaitlis = sc.nextInt();

        int[] masivs = new int[]{1, 33, 12, 65, 18, 54};

        String rezultats = "";

        for (int i = 0; i < masivs.length; i++) {
            if (skaitlis == masivs[i]) {
                rezultats = "pareizi! Šis skaitlis ir masīva " + i + ". elements";
                break;
            } else {
                rezultats = "nepareizi";
            }
        }
        System.out.println(rezultats);

    }

    public void Lielakais() {
        int[] masivs = new int[]{9, 33, 12, 165, 18, 54, 2, 5, 44};

        int max = masivs[0];
        for (int i = 0; i < masivs.length; i++) {
            if (masivs[i] > max) {
                max = masivs[i];
            }
        }
        System.out.println("Lielākais skaitlis ir: " + max);
    }
    
    

    public void Kopet() {
        String[] avots = new String[]{"Man ", "ļoti ", "nepatīk ", "boolean "};
        String[] merkis = new String[avots.length];

        for (int i = 0; i < avots.length; i++) {
            merkis[i] = avots[avots.length - 1 - i];
            //System.out.println(avots.length + "+" + i);
            System.out.println(merkis[i]);
        }

    }

}

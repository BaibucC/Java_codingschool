/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Piemeri {

    public void Masīvs() {
        //ievada tipu, kvadrātiekavas norāda, ka būs masīvs, nosaukums, 
        //jauns objekts, kvadrātiekavās norāda, cik vietu būs masīvā
        //kvadrātiekavās var arī mainīgo, piem.[skaitlis]
        //ja cilvēks ievada konkrētu skaitli
        //pirmaisMasivs[] <-tas ir indekss, kuram objektam vajag piekļūt

//        pirmaisMasivs[0] = 2;
//        pirmaisMasivs[1] = 5;
//        pirmaisMasivs[2] = 9;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet masīva garumu: ");
        int gar = sc.nextInt();
        int[] pirmaisMasivs = new int[gar];

        //masivaGarums = pirmaisMasivs.length;
        //masīvā svarīgi, lai viss sākas no nulles!!!!!
        for (int i = 0; i < pirmaisMasivs.length; i++) { //salīdzina tā, lai nepārietu masīvam pāri
            System.out.println("Ievadiet " + i + ". elementu");
            pirmaisMasivs[i] = sc.nextInt();
        }
        for (int i = 0; i < pirmaisMasivs.length; i++) { //salīdzina tā, lai nepārietu masīvam pāri
            System.out.print(pirmaisMasivs[i] + " ");

        }

        //uzdevums - uztaisīt, lai masīva vērtības un to skaitu ievada cilvēks
    }

    public void Udevums() {
        int videjais = 0;

        do {
            int[] skaitli = new int[3];
            for (int i = 0; i < skaitli.length; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("skaitļi: ");
                skaitli[i] = sc.nextInt();
            }

            for (int i = 0; i < skaitli.length; i++) {
                videjais = videjais + skaitli[i];
            }
            videjais = videjais / skaitli.length;
            System.out.println("Videjais: " + videjais);

        } while (videjais >= 0);

    }
}

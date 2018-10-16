/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cikli;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Piemeri {

    public void Meginajums() {
        //for, while, do..while
        //(sākuma vērtība (i vietā var būt jebkas, bet tālāk ir jāizmanto tieši tas pats);
        //norāda, kāda būs i beigu vērtība(skaitītājs, cik reižu ies cauri; i++ 
        for (int i = 0; i < 5; i++) {
            int b = 9 + i;
            System.out.println(b);
        }

        for (int i = 5; i > -1; i--) {
            System.out.println(i);
        }
    }
//for cikli, ja konkrētas reizes ir zināmas
    //ja nezina, kurā brīdī uzminēs, tad while ciklus izmanto

    public void CitiCikli() {
        String ievade = "";
        Scanner sc = new Scanner(System.in);
        while (!ievade.equals("iziet")) {//kamēr ievade nav vienāda ar tekstu, !!!izsaukuma zīme priekšā!!!
            System.out.println("Hello world");
            ievade = sc.nextLine();
        }

        do {
            System.out.println("Hello world");
            ievade = sc.nextLine();
        } while (!ievade.equals("iziet"));
    }

}

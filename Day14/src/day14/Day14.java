/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Day14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ievada 5 skaitļus, saskaita tos un aprēķina vidējo

//        videjais();
        vardaMekletajs();

        //meklētājs. ievada vārdus nezināmā daudzumā, tad piedāvā meklēt, vai ir 
    }

    public static void vardaMekletajs() {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name = "";
        while (true) {
            System.out.println("Ievadiet vārdu vai beigt saraksta veidošanu (n)");
            name = sc.next();
            if (name.equals("n")) {
                System.out.println("Saraksta veidošana beigusies!");
                break;
            }
            list.add(name);
            System.out.println(list);
        }

        if (list.isEmpty()) {
            System.out.println("Saraksts ir tukšs");
        } else {
            System.out.println("Kādu vārdu vēlaties meklēt?");
            String search = sc.next();
            boolean match = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(search)) {
                    System.out.println("Vārds, kas sakrīt: " + (i + 1) + ".elements: " + search);
                    match = true;
                }
            }
            if (!match) {
                System.out.println("Vārds netika atrasts!");
            }
//        for (String result : list) {
//            if (search.equals(result)) {
//                System.out.println("Vārds, kas sakrīt: " + list.indexOf(search) + ".elements: " + result);
//                match = true;
//            }
//        }

        }
    }

    public static void videjais() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadiet skaitli: ");
            try {
                int number = sc.nextInt();
                list.add(number);
                sum = sum + list.get(i);
            } catch (Exception ex) {
                System.out.println("Nepareiza ievade!");
            }
        }
//        !! variants saskaitīšanai
//        for (int num : list) {
//            sum = sum + num;
//        }

        System.out.println("Skaitļu saraksts ir: " + list);
        System.out.println("Skaitļu summa ir: " + sum);

        double average = sum / list.size();
        System.out.println("Vidējais skaitlis ir: " + average);

    }
}

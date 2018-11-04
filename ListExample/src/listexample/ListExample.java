/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listexample;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add(0, "haha");
//        list1.add("bubu");
//        list1.add(1, "hihi");
//        list1.add("hehe");
//        System.out.println(list1);
////        list1.remove(2);
//        list1.remove("bubu");
//        System.out.println(list1);
//        System.out.println("pēdējais elements: " + list1.get((list1.size()-1)));
//
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }
//        
////        String together = list1.toString();
////        System.out.println(together);
//        System.out.println("for each cikls:");
//        for(String item : list1){
//            System.out.println(item);
//        }

//        SarakstaUzdevums();
//        Dzesana();
        AddDelete();
    }

    public static void AddDelete() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.println("Vai vēlaties skaitli pievienot (+), dzēst (-) vai iziet (n)?");
            String action = sc.next();
            
            if (!action.equals("n") && !action.equals("+") && !action.equals("-") ) {
                System.out.println("Nepareiza izvēle!");
            }
            
            if (action.equals("n")) {
                System.out.println("Ejam ārā!");
                break;
            } 
            
            if (action.equals("+")) {
                try {
                    System.out.println("\nIevadiet skaitli: ");
                    number = sc.nextInt();
                    list.add(number);
                } catch (Exception ex) {
                    System.out.println("Nepareiza ievade");
                }
            }
            
            if (action.equals("-")) {
                if (list.isEmpty()) {
                    System.out.println("Saraksts ir tukšs!");
                } else {
                    System.out.println("\nKuru elementu vēlaties dzēst?");
                    try {
                        number = sc.nextInt();
                        list.remove(number);
                    } catch (Exception ex) {
                        System.out.println("Nepareiza ievade");
                    }
                    if (list.isEmpty()) {
                    System.out.println("Saraksts ir tukšs!");
                }
                }
            }

            
            System.out.println("");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ".skaitlis ir: " + list.get(i));
            }
            System.out.println("Viss saraksts: " + list + "\n");

        }

    }

    public static void SarakstaUzdevums() {
        //ievadam vai ejam ārā
        //cilvēka izvēlēts saraksta garums, ievada skaitļus
        //katras ievades beigās izvadās pilns saraksts
        //kārtas skaitlis plus elements

//        boolean exit = sc.next().equals("iziet");
//        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Kuru elementu vēlaties dzēst?");
            try {
                System.out.println("Ievadiet skaitļus: ");
                int number = sc.nextInt();
                list.add(number);
            } catch (Exception ex) {
                System.out.println("Nepareiza ievade");
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ".skaitlis ir: " + list.get(i));
            }
            System.out.println(list);
            System.out.println("Turpināt? Y/N");
            if (sc.next().equals("N")) {
                break;
            }

        }

    }

    public static void Dzesana() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ".skaitlis ir: " + list.get(i));
        }
        System.out.println("Kuru elementu vēlaties dzēst?");
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (list.isEmpty()) {
                System.out.println("Saraksts ir tukšs!");
                break;
            } else {
                try {
                    number = sc.nextInt();
                    list.remove(number);
                } catch (Exception ex) {
                    System.out.println("Nepareiza ievade");
                }

                System.out.println("Kuru elementu vēlaties dzēst?");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + ".skaitlis ir: " + list.get(i));
                }

            }
        }
    }

}

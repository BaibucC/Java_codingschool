/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Uzdevumi {

    //klasēs sout labāk neizmantot
    //mazāk rindu ir labāk
    public String Atbilde() {
        return Izvade1() + Izvade2();
    }

    private String Izvade1() {
        return "Man patīk";
    }

    private String Izvade2() {
        return " programmēt";
    }

    //uzdevums - cilvēks ievada simbolu virkni un mēs pābaudām, 
    //vai ir no 1-6 simboliem, tad izvadam veiksmīgi, citā gadījumā neveiksmīgi
    public String Salidzinat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet tekstu: ");
        String teksts = sc.nextLine();

        boolean a = true;
        a = false;

        int garums = teksts.length();
        if (garums >= 1 && garums <= 6) {
            return "Veiksmīgi!";
        } else {
            return "Neveiksmīgi!";
        }
        //return nozīmē funkcijas beigas
        //no objekta izsauc funkciju

        //funkciju, kas atgriež true, ja gadījumā skaitlis ir poz un false, ja negatīvs
    }

    //BOOLEAN
    public boolean Skaitlis(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author user
 */
public class Piemeri {

    public void Zarosanas() {
        int a = 5;
        //&& = izpildās, ja abas lietas, kas ir iekavās, arī izpildās
        //ja a nebūs lielāks par 4
        if (a < 5 && a != 4 && a > 0) {

        }

        int b = 6;
        //== ir vai.
        //ar && izpildās viss, ar || izpildās viena no funkcijām
        if (b == 7 || b < 5) {

        }

        if (a > 0 && b > 0) {
            //var salīdzināt vairākus mainīgos
            //var pārbaudīt intervālus
        }
    }

    public void Zarosanas2(){
        
        int a = 5;
        switch(a){  //ja zināmas konkrētas vērtības un to nav daudz
            case 1:
                System.out.println("1");
                break; //lai neizpildītu tālāk darbības
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default: //strādā kā else
                System.out.println("ai, nav pareizi!");
                break;
        }

}
    
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Ievadiet skaitli no 1 līdz 3: ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        switch(num){
//            case 1:
//                System.out.println("Case1: Skaitlis ir: "+num);
//                break;
//            case 2:
//                System.out.println("Case2: Skaitlis ir: "+num);
//                break;
//            case 3:
//                System.out.println("Case3: Skaitlis ir: "+num);
//                break;
//            default:
//                System.out.println("Nepareizs skaitlis: "+num);
//        }
        
        
        
        //patskanis vai līdzskanis
        boolean irPatsk=false;
        System.out.println("Ievadiet burtu: ");
        Scanner sc = new Scanner(System.in);
        char burts = sc.next().charAt(0);
        switch(burts)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : irPatsk = true;
        }
        if(irPatsk == true){
            System.out.println(burts+" ir patskanis");
        }
        else{
            if((burts>='a'&&burts<='z')||(burts>='A'&&burts<='Z'))
            System.out.println(burts+" ir līdzskanis");
            else{
            System.out.println("Nav ievadīts burts");
        }
        }

        
        
    }
    
}

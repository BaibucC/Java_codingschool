/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivers;

import java.util.Arrays;

/**
 *
 * @author Baiba
 */
public class Rivers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String number1s = "12365";
        long num = 124;
        number1s = String.valueOf(num);
        char[] chararray = number1s.toCharArray();
        int[] intarray = new int [number1s.length()];
        
        //skaitli pārveido par karakteru listi
        for (int i =0; i < number1s.length(); i++){
            intarray[i] = chararray[i];
        }
        System.out.println(Arrays.toString(intarray));
        int a = intarray[0];
        int b = intarray[1];
        int c = intarray[2];
        
        System.out.println(a + " " + b + " " + c);
        
        
        //num = Long.parseLong(number1s);
        //System.out.println(number1s);
        
//        long[] arr1 = new long[5];
//        System.err.println("Debug messages...");
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = 124;
//
//            arr1[i] = Long.parseLong(number1s);
//            System.out.println(number1s);
//            
//        }

        //         String number1 = arr[i].toString();
        // System.out.println(number1);
//long val = Long.valueOf(str);
        //System.out.println("42");
    }

}

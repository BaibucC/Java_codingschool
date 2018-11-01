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
        long resultFinal = 123;
        String number1s = String.valueOf(resultFinal);
        long result;

        //array1
        long[] array1 = new long[20];
        array1[0] = resultFinal;
        for (int i = 1; i < array1.length; i++) {
            number1s = String.valueOf(resultFinal);
            result = Long.valueOf(String.valueOf(number1s.charAt(0)));
            for (int j = 1; j < number1s.length(); j++) {
                result = result + Long.valueOf(String.valueOf(number1s.charAt(j)));
            }
            resultFinal = resultFinal + result;
            array1[i] = resultFinal;
            System.out.println("result: " + resultFinal + "  = num: " + resultFinal + " + kaka: " + result);
        }
        System.out.println(Arrays.toString(array1));

        //array2
        long resultFinal2 = 129;
        long[] array2 = new long[20];
        array2[0] = resultFinal2;
        for (int i = 1; i < array1.length; i++) {
            number1s = String.valueOf(resultFinal2);
            result = Long.valueOf(String.valueOf(number1s.charAt(0)));
            for (int j = 1; j < number1s.length(); j++) {
                result = result + Long.valueOf(String.valueOf(number1s.charAt(j)));
            }
            resultFinal2 = resultFinal2 + result;
            array2[i] = resultFinal2;
            System.out.println("result: " + resultFinal2 + "  = num: " + resultFinal2 + " + kaka: " + result);
        }
        System.out.println(Arrays.toString(array2));
        
        //compare arrays
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    System.out.println("sakrīt");
                    System.out.println(array1[i]);
                }
            }
        }
    }

}

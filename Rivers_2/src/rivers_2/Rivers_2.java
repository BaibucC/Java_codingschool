/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivers_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Baiba
 */
public class Rivers_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long r1 = 123;
        long r2 = 141;
        long result;
        String numbers = (String.valueOf(r1));
        List<Long> list1 = new ArrayList<>();
//        list1.add(r1);
        //l1.add(0, 1);  // adds 1 at 0 index 
        for (int i = 0; i < list1.size(); i++) {
            numbers = (String.valueOf(r1));
            result = Long.valueOf(String.valueOf(numbers.charAt(0)));
            for (int j = 1; j < numbers.length(); j++) {
                result = result + Long.valueOf(String.valueOf(numbers.charAt(j)));
            }
            result = r1 + result;
            list1.add(i, result);
            r1 = result;
        }
//        System.out.println(list1);

        List<Long> list2 = new ArrayList<>();
        list2.add(r2);
        for (int i = 0; i < list2.size(); i++) {
            numbers = (String.valueOf(r2));
            result = Long.valueOf(String.valueOf(numbers.charAt(0)));
            for (int j = 1; j < numbers.length(); j++) {
                result = result + Long.valueOf(String.valueOf(numbers.charAt(j)));
            }
            result = r2 + result;
            list2.add(i, result);
            r2 = result;
        }
//        System.out.println(list2);
        long first = 0;
        long second = 1;
        if (first != second) {
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    first = Long.valueOf(list1.get(i));
                    second = Long.valueOf(list2.get(j));
                    if (first == second) {
                        System.out.println(first);
                        break;
                    }

                }
            }
        }

    }

}

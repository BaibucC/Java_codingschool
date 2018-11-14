/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortarraylist;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Baiba
 */
public class BubblesortArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> saraksts = new ArrayList<>();
        saraksts.add("Time: 00 : 25   Baiba");
        saraksts.add("Time: 00 : 10   Baiba");
        saraksts.add("Time: 01 : 45   Baiba");
        saraksts.add("Time: 00 : 12   Baiba");
        String check = String.valueOf(saraksts.get(0));
        Collections.sort(saraksts);
        System.out.println(saraksts);

//String mydata = "some string with 'the data i want' inside";
        for (String ieraksts : saraksts) {
            String mydata = ieraksts;
            Pattern pattern = Pattern.compile("(\\d+\\s.\\s\\d+)");
            Matcher matcher = pattern.matcher(mydata);
            if (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }
        String mydata = saraksts.get(0);

    }
    
//    public void bubbleSort2(ArrayList<String> saraksts){
//        String temp;
//        for (int i=0; i< input.length; i++){
//            for(int j= i; j< input.length-1; j++){
//                char first = input[i].charAt(0);
//                char sec = input[j +1].charAt(0);
//                 if (first < sec)  {
//                     temp = input[j +1];
//                     input[j +1] = input[i];        
//                     input[i] = temp;
//                 }
//             }
//            list.add(input[i]);
//         }
//    }
    
        
        
//    public static void bubbleSort(ArrayList<String> list) {
//
//    int n = list.size();
//    int temp = 0;
//
//    for (int i = 0; i < n-i; i++) {
//        for (int j = 0; j < (n - i - 1); j++) {
//
//            if (list.get(j) > list.get(j+1)) {
//                temp = list.get(j);
//                list.set(j,list.get(j+1));
//                list.set(list.get(j+1), temp);
//            }
//
//        }
//    }
//}
}

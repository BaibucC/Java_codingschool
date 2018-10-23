/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatures;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Temperatures {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i] 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
//    void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {

        Temperatures ob = new Temperatures();
        int arr[] = {64, -34, 25, -12, 22, 11, -1, 125, -9};
        //ob.bubbleSort(arr);
        //System.out.println("Sorted array");
        //ob.printArray(arr);
        System.out.println("");
        int pos = arr[0];
        int neg = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] < pos) {
                    pos = arr[i];
                }
            }
            if (arr[i] < 0) {
                if (arr[i] > neg) {
                    neg = arr[i];
                }
            }

        }
        System.out.println(pos);
        System.out.println(neg);

//        int arrp[] = new int[arr.length]; //pos
//        int arrn[] = new int[arr.length]; //neg
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr));
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println("pos arrays ir: " + Arrays.toString(arrp));
//                System.out.println("neg arrays ir: " + Arrays.toString(arrn));
//                if (arr[i] > 0) {
//
//                    arrp[j] = arr[i];
//                    System.out.println("j ir:" + j + "   un i ir:" + i);
//
//                    System.out.println("poz ir " + arrp[j]);
//                }
//
//                if (arr[i] < 0) {
//                    arrn[j] = arr[i];
//                    System.out.println("j neg ir:" + j + "   un i neg ir:" + i);
//
//                    System.out.println("neg ir " + arrn[j]);
//                }
//                i++;
//            }
//
//        }
//        System.out.println("pos arrays ir: " + Arrays.toString(arrp));
//        System.out.println("neg arrays ir: " + Arrays.toString(arrn));
//
//        for (int i = 0; i < arrp.length; i++) {
//            int pos = 0;
//            if (arrp[i] > 0) {
//                pos = arrp[i];
//
//            }
//        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatures;

import java.util.Scanner;

/**
 *
 * @author Baiba
 */
public class Temperatures {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int arr[] = new int[n];
        int res = 0; // default value

        //creates an array of temperatures
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            arr[i] = t;
        }

        
        //loop for checking every instance of the array
        if(n>0){
        int resp = arr[0]; //default value for comparing
        int resn = arr[0]; //default value for comparing
        for (int i = 0; i < arr.length; i++) {

            //if positive temperature
                if (arr[i] > 0) {
                    if (arr[i] == resp) {
                        resp = arr[i];
                    }
                    if (arr[i] < resp) {
                        resp = arr[i];
                    }
                    if (arr[i] > resp) {
                        resp = resp;
                    }
                    if (arr[i] > resp && resp < 0) {
                        resp = arr[i];
                    }
                   // System.out.println("arr[i] ir:" + arr[i] + "resp ir:" + resp);
                }
            
            //if negative temperature
            if (arr[i] < 0) {
            if (Math.abs(arr[i]) < Math.abs(resn)) {
                    resn = arr[i];
            }
            if (Math.abs(arr[i]) > Math.abs(resn) && resn < 0) {
                    resn = resn;
            }
            if (Math.abs(arr[i]) > Math.abs(resn) && resn > 0) {
                    resn = arr[i];
            }
            }

            //results are:
            }
            if(resp==Math.abs(resn)){
                res = resp;
            }
            if(resp<Math.abs(resn)&&resp>0){
                res = resp;
            }
            if(resp<Math.abs(resn)&&resp<0){
                res = resp;
            }
            if(resp<resn){
                res = resn;
            }
            if(resp>Math.abs(resn)){
                res = resn;
            }
            

            System.out.println(res);
            }
            
            
            //if no temperatures are provided
            if(n==0){
            System.out.println(0);
        }
        
    }

}

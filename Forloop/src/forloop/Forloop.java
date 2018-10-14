/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

/**
 *
 * @author Baiba
 */
public class Forloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*for(initialization; condition ; increment/decrement)
{
statement(s);
}*/
 /*for(int i=10; i>1; i--){
            System.out.println("i vērtība ir: "+i);
        }*/
 
 
 /*int arr[]={2,4,8,15};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }*/
        
 
         int arr[] = {2, 4, 28, 15};
        for (int num : arr) {
            System.out.println(num);
        }
        
        String ar2[]={"hi", "hello", "bye"};
        for (String str : ar2){
            System.out.println(str);
        }

    }

}

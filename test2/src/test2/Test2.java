/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Baiba
 */
public class Test2 {

    //klasē definējam statiskos un instance mainīgos, veidojam objektus
    //statiskie mainīgie sākas ar programmu un beidzas līdz ar to
    static double salary1;
    static String DEPARTMENT = "Development ";
    
    //instance mainīgos definē pirms vai pēc izmantošanas
    //instance izveidojas līdz ar objektu (new)un pazūd līdz ar to   
    String name;
    double salary2;
    public Test2 (String empName) {
        name = empName;
    }
    void setSalary(double empSal) {
        salary2 = empSal;
    }
    void printEmp() {
        System.out.println("name : " + name);
        System.out.println("salary : " + salary2);
    }
    
    
    
    
    
    //start
    //metodē definējam lokālos mainīgos
    public static void main(String[] args) {
        salary1 = 1500;
        System.out.println(DEPARTMENT + "average salary: " + salary1);
        
        Test2 empOne = new Test2("Baiba");
        empOne.setSalary(2000);
        empOne.printEmp();
    }
    
}

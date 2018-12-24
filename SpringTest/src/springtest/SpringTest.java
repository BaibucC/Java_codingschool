/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Baiba
 */
public class SpringTest {

    
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        //Laptop l1 = context.getBean(Laptop.class);
        Alien al = context.getBean(Alien.class);
        //al.setComp(l1);
        al.show();
    }
    
}

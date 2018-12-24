/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author Baiba
 */
@Component
@Primary
public class Desktop implements Computer{
    
    @Override
    public void features() {
        System.out.println("17 16gb 2tb");
    }
    
}

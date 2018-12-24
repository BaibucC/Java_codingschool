/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.stereotype.Component;

/**
 *
 * @author Baiba
 */
@Component
public class Laptop implements Computer{
    
    @Override
    public void features() {
        System.out.println("13 2gb 500gb");
    }
    
}

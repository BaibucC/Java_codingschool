/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.awt.Color;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;

/**
 *
 * @author Baiba
 */
public class Button extends JButton {
    int red = 0;
    int green = 175;
    int blue = 206;

    Color kleur = new Color(red, green, blue);

    ButtonModel newModel = new DefaultButtonModel(){
        public void setPressed(boolean b) {
        if (b)
          System.out.println("Pressed: true");
        else
          System.out.println("Pressed: false");

        super.setPressed(b);
      }
    };
    
    public Button(String text) {
        super(text);

        this.setBackground(kleur);
        this.setBorder(null);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);

    }
}

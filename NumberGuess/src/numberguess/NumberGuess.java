/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguess;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Baiba
 */
public class NumberGuess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Game());
                frame.pack();
                frame.setVisible(true);
                Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((screen.getWidth() - frame.getWidth()) / 2);
                int y = (int) ((screen.getHeight() - frame.getHeight()) / 2);
                frame.setLocation(x, y);
                frame.setTitle("Number guessing game");
            }
        });
    }
    
}

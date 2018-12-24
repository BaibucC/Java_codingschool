/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

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
public class Memory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new Game());
                frame.pack();
                frame.setVisible(true);
                Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (int) ((screen.getWidth() - frame.getWidth()) / 2);
                int y = (int) ((screen.getHeight() - frame.getHeight()) / 2);
                frame.setLocation(x, y);
                Image image = new ImageIcon(this.getClass().getResource("/images/icon.png")).getImage();
                frame.setIconImage(image);
                frame.setTitle("Memory game by BaibucC");
            }
        });
    }

}

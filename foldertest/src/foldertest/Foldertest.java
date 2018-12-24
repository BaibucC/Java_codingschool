/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foldertest;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Baiba
 */
public class Foldertest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
JFrame frame = new JFrame();
                frame.getContentPane().add(new Folder());
                frame.pack();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

        });
    }

}

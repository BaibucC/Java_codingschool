/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class Day11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new Kalkulators());
                frame.pack();
                frame.setVisible(true);
                //sataisīt poas 0-9, jāpaādās ciparam, kas nospiests
            }
        });
    }

}

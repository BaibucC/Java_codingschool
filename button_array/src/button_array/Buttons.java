/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button_array;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Baiba
 */
public class Buttons extends javax.swing.JPanel {
    /**
     * Creates new form buttons
     */
    public Buttons() {
        initComponents();
GridLayoutEg();

//        field.setLayout(new GridLayout(8, 8));
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6; j++) {
//                add(new JButton("ttt")); // add component w/o 2nd parameter
//            }
//        }
        // an array of JButtons
        JButton[][] buttons = new JButton[4][4];

        /* actually creates each of the sixteen JButton objects and sets
each button's text to look something like "Button [1][2]" (depending on row and column) */
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new JButton("Button [" + i + "][" + j + "]");
            }
        }

// set the text later on some specific button if we want
        buttons[2][3].setText("changed text");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
public void GridLayoutEg() {
    this.add(field);
    field.setVisible(true);
field.setSize(500, 500);
        field.setLayout(new GridLayout(8, 8));

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                add(new JButton("ttt")); // add component w/o 2nd parameter
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

}

package Memory;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package button_array2;
//
//import java.awt.Color;
//import javax.swing.ButtonModel;
//import javax.swing.JButton;
//
///**
// *
// * @author Baiba
// */
//public class Buttons extends JButton {
//
//    private Color pressedForeground = Color.BLACK;
//    private Color pressedBackground = Color.WHITE;
//
//    Button() {
//        this(null);
//    }
//
//    Buttons(String text) {
//        super(text);
//        super.setContentAreaFilled(false);
//        setForeground(Color.WHITE);
//        setBackground(Color.BLACK);
//        setFocusPainted(false);
//        setBorderPainted(false);
//        setFont(new Font("arial", Font.PLAIN, 16));
//    }
//
////    @Override
////    public void paint(Graphics g) {
////        Color oldFg = getForeground();
////        Color newFg = oldFg;
////        ButtonModel mod = getModel();
////
////        if (mod.isPressed()) {
////            newFg = pressedForeground;
////            g.setColor(pressedBackground);
////        } else {
////            g.setColor(getBackground());
////        }
////
////        g.fillRect(0, 0, getWidth(), getHeight());
////        setForeground(newFg);
////        super.paintComponent(g);
////        setForeground(oldFg);
////    }
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

/**
 *
 * @author Baiba
 */
public class createIcons {
    public void createIcons(int n, ImageIcon icon, String sizeChosen, String iconsChosen, ArrayList<ImageIcon> iconList){
    for (int i = 0; i < n * n / 2; i++) {
            switch (iconsChosen) {
                case "photos":
                    icon = new ImageIcon(this.getClass().getResource("/images/photos/icon" + i + ".jpg"));
                    icon = new ImageIcon(this.getClass().getResource("/images/photos/icon" + i + ".jpg"));
                    break;
                case "clipart":
                    icon = new ImageIcon(this.getClass().getResource("/images/clipart/icon" + i + ".jpg"));
                    icon = new ImageIcon(this.getClass().getResource("/images/clipart/icon" + i + ".jpg"));
                    break;
                case "icons":
                    icon = new ImageIcon(this.getClass().getResource("/images/icons/icon" + i + ".jpg"));
                    icon = new ImageIcon(this.getClass().getResource("/images/icons/icon" + i + ".jpg"));
                    break;
            }
            Image resized = icon.getImage();
            if (sizeChosen.equals("medium")) {
                resized = icon.getImage().getScaledInstance(123, 123, Image.SCALE_SMOOTH);
            }
            if (sizeChosen.equals("large")) {
                resized = icon.getImage().getScaledInstance(81, 81, Image.SCALE_SMOOTH);
            }
            icon = new ImageIcon(resized);
            iconList.add(icon);
            iconList.add(icon);
        }
        Collections.shuffle(iconList);
    }
}

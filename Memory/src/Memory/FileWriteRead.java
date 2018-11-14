/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Baiba
 */
public class FileWriteRead {

    public void savePlayer(String player) {
        File myFile = new File("src\\data\\userList.txt");
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter(myFile, true);
            bw = new BufferedWriter(fw);
            myFile.canWrite();
            bw.write(player);
            bw.newLine();
            bw.close();
            //fw.close();
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public void removePlayer(String player) {
        File myFile = new File("src\\data\\userList.txt");
        File tempFile = new File("src\\data\\myTempFile.txt");
        BufferedWriter bw;
        BufferedReader br;
        String lineToRemove = player;
        String currentLine;
        try {
            br = new BufferedReader(new FileReader(myFile));
            bw = new BufferedWriter(new FileWriter(tempFile));

            while ((currentLine = br.readLine()) != null) {
                if (currentLine.equals(lineToRemove)) {
                    continue;
                }
                bw.write(currentLine + System.getProperty("line.separator"));
            }
            bw.close();
            br.close();
            myFile.delete();
            tempFile.renameTo(myFile);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public void saveResults(String result, String sizeChosen) {
        File myFile = null;
        if (sizeChosen.equals("medium")) {
            myFile = new File("src\\data\\resultListM.txt");
        }
        if (sizeChosen.equals("large")) {
            myFile = new File("src\\data\\resultListL.txt");
        }
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter(myFile, true);
            bw = new BufferedWriter(fw);
            myFile.canWrite();
            bw.write(result);
            bw.newLine();
            bw.close();
            //fw.close();
        } catch (Exception exc) {
            System.out.println("error Saving result");
        }
    }

    public void sortArrayList(ArrayList<String> ArrayForSort, List list){
        for (int i = 0; i < list.getItemCount() - 1; i++) {
                    ArrayForSort.add(list.getItem(i));
                }
                Collections.sort(ArrayForSort);
                    for (int i = 1; i < ArrayForSort.size(); i++){
                        list.add(i + ":     " + ArrayForSort.get(i));
                    }
    }
    
    public void addInfo(JComboBox userList, List resultListLarge, List resultListMedium) {
        BufferedReader input = null;
        BufferedReader input2 = null;
        BufferedReader input3 = null;
        try {
            input = new BufferedReader(new FileReader("src\\data\\userList.txt"));
            input2 = new BufferedReader(new FileReader("src\\data\\resultListL.txt"));
            input3 = new BufferedReader(new FileReader("src\\data\\resultListM.txt"));

            String line = null;
            String line2 = null;
            String line3 = null;
            ArrayList<String> sortedResultLarge = new ArrayList<>();
            ArrayList<String> sortedResultMedium = new ArrayList<>();
            try {
                while ((line = input.readLine()) != null) {
                    //strings.add(line);
                    userList.addItem(line);
                }
                while ((line2 = input2.readLine()) != null) {
                    //strings.add(line);
                    sortedResultLarge.add(line2);
                    System.out.println("lasa resultL");
                }
                while ((line3 = input3.readLine()) != null) {
                    sortedResultMedium.add(line3);
                    System.out.println("lasa resultM");
                }
                
                FileWriteRead sorrr = new FileWriteRead();
                sorrr.sortArrayList(sortedResultMedium, resultListMedium);
                sorrr.sortArrayList(sortedResultLarge, resultListLarge);
                
                
                System.out.println(sortedResultMedium);

            } catch (IOException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException e) {
            //System.err.println("Error, file " + filePath + " didn't exist.");
        } finally {
            try {
                input.close();
                input2.close();
                input3.close();
            } catch (IOException ex) {
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

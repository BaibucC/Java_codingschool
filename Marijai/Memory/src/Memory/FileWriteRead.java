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
import java.io.PrintWriter;
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

    public void createDirectory() {
        String directoryName = "Memory_game_data";
        File directory = new File(directoryName);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public void createFiles() {
        try {
            PrintWriter writer = new PrintWriter("Memory_game_data\\resultListL.txt", "UTF-8");
            writer = new PrintWriter("Memory_game_data\\resultListM.txt", "UTF-8");
            writer.close();
        } catch (Exception exf) {
            System.out.println("File creation failed");
        }
    }

    public void createUserFile() {
        try {
            PrintWriter writer = new PrintWriter("Memory_game_data\\userList.txt", "UTF-8");
            writer.close();
        } catch (Exception exf) {
            System.out.println("File creation failed");
        }
    }

    public void savePlayer(String player) {
        File myFile = new File("Memory_game_data\\userList.txt");
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter(myFile, true);
            bw = new BufferedWriter(fw);
            myFile.canWrite();
            bw.write(player);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public void removePlayer(String player) {
        File myFile = new File("Memory_game_data\\userList.txt");
        File tempFile = new File("Memory_game_data\\myTempFile.txt");
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
            myFile = new File("Memory_game_data\\resultListM.txt");
        }
        if (sizeChosen.equals("large")) {
            myFile = new File("Memory_game_data\\resultListL.txt");
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
            fw.close();
        } catch (Exception exc) {
            System.out.println("error Saving result");
        }
    }

    public void sortArrayList(ArrayList<String> ArrayForSort, List list) {
        for (int i = 0; i < list.getItemCount() - 1; i++) {
            ArrayForSort.add(list.getItem(i));
        }
        Collections.sort(ArrayForSort);
        for (int i = 0; i < ArrayForSort.size(); i++) {
            String number = (i < 9) ? ("  " + (i + 1)) : String.valueOf(i + 1);
            list.add(number + ":     " + ArrayForSort.get(i));
        }

    }

    public void userInfo(JComboBox userList) {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader("Memory_game_data\\userList.txt"));
            String line = null;
            try {
                while ((line = input.readLine()) != null) {
                    userList.addItem(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(Game.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException e) {
            createUserFile();
        } finally {
            try {
                input.close();

            } catch (IOException ex) {
                Logger.getLogger(Game.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void addInfo(List resultListLarge, List resultListMedium) {
        try {
            if (resultListLarge.getItemCount() != 0 && resultListMedium.getItemCount() != 0) {
                resultListLarge.removeAll();
                resultListMedium.removeAll();
            }
        } catch (Exception y) {
            System.out.println("result remove");
        }

        BufferedReader input2 = null;
        BufferedReader input3 = null;
        try {
            input2 = new BufferedReader(new FileReader("Memory_game_data\\resultListL.txt"));
            input3 = new BufferedReader(new FileReader("Memory_game_data\\resultListM.txt"));
            String line2 = null;
            String line3 = null;
            ArrayList<String> sortedResultLarge = new ArrayList<>();
            ArrayList<String> sortedResultMedium = new ArrayList<>();
            try {
                while ((line2 = input2.readLine()) != null) {
                    sortedResultLarge.add(line2);
                }
                while ((line3 = input3.readLine()) != null) {
                    sortedResultMedium.add(line3);
                }
                FileWriteRead sor = new FileWriteRead();
                sor.sortArrayList(sortedResultMedium, resultListMedium);
                sor.sortArrayList(sortedResultLarge, resultListLarge);

            } catch (IOException ex) {
                Logger.getLogger(Game.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException e) {
            //System.err.println("Error, file " + filePath + " didn't exist.");
        } finally {
            try {
                input2.close();
                input3.close();

            } catch (IOException ex) {
                Logger.getLogger(Game.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

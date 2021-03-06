/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foldertest;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Baiba
 */
public class Folder extends javax.swing.JPanel {

    /**
     * Creates new form Folder
     */
    public Folder() {
        initComponents();
    }
    String[] matches = new String[]{".jpg", ".png", ".gif", ".JPG"};
    String digitCount = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseFile = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        fileChooser = new javax.swing.JFileChooser();
        choose = new javax.swing.JButton();
        selected = new javax.swing.JLabel();
        fileList = new java.awt.List();
        btnListFiles = new javax.swing.JButton();
        totalFiles = new javax.swing.JLabel();
        renameList = new java.awt.List();
        btnRename = new javax.swing.JButton();
        formatText = new javax.swing.JTextField();
        formatNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        beforeAfter = new javax.swing.JLabel();
        btnTest = new javax.swing.JButton();

        chooseFile.setAlwaysOnTop(true);
        chooseFile.setName("Choose File"); // NOI18N

        jButton1.setText("jButton1");

        fileChooser.setCurrentDirectory(new java.io.File("H:\\"));
            fileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
            fileChooser.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fileChooserActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout chooseFileLayout = new javax.swing.GroupLayout(chooseFile.getContentPane());
            chooseFile.getContentPane().setLayout(chooseFileLayout);
            chooseFileLayout.setHorizontalGroup(
                chooseFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(chooseFileLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1)
                    .addContainerGap(34, Short.MAX_VALUE))
            );
            chooseFileLayout.setVerticalGroup(
                chooseFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(chooseFileLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(97, 97, 97))
                .addGroup(chooseFileLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE))
            );

            choose.setText("Choose folder");
            choose.setActionCommand("");
            choose.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chooseActionPerformed(evt);
                }
            });

            selected.setText("Selected folder: ");

            btnListFiles.setText("List files");
            btnListFiles.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnListFilesActionPerformed(evt);
                }
            });

            totalFiles.setText("Total files: ");

            btnRename.setText("Rename");
            btnRename.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRenameActionPerformed(evt);
                }
            });

            formatText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
            formatText.setToolTipText("");

            formatNumber.setText("+ 0001.*");

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jLabel2.setText("(Enter file name format, Ex. \"image_\". Can leave blank)");

            beforeAfter.setText("Format preview");

            btnTest.setText("Format test");
            btnTest.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnTestActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(choose)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(selected)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnListFiles)
                                    .addGap(18, 18, 18)
                                    .addComponent(totalFiles)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(beforeAfter)
                                    .addGap(134, 134, 134)
                                    .addComponent(btnRename))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(formatText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(formatNumber)
                                    .addGap(37, 37, 37)
                                    .addComponent(btnTest))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(fileList, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(renameList, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(choose)
                        .addComponent(formatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(formatNumber)
                        .addComponent(btnTest))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selected)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListFiles)
                            .addComponent(totalFiles))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beforeAfter)
                            .addComponent(btnRename)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(renameList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fileList, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }// </editor-fold>//GEN-END:initComponents

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        chooseFile.setVisible(true);
        chooseFile.setSize(500, 500);

    }//GEN-LAST:event_chooseActionPerformed

    private void btnListFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListFilesActionPerformed
        if (fileList.getItemCount() != 0) {
            fileList.removeAll();
        }
        File directory = fileChooser.getSelectedFile();
        ArrayList<File> fileListA = new ArrayList<>();

        for (String m : matches) {
            for (File item : directory.listFiles()) {
                if (item.getName().contains(m)) {
                    fileListA.add(item);
                }
            }
        }
        Collections.sort(fileListA);
        for (File item : fileListA) {
            fileList.add(String.valueOf(item));
        }

        int length = fileList.getItemCount();
        totalFiles.setText("Total files: " + length);
        if (length < 9) {
            digitCount = "%01d";
        } else if (length < 99) {
            digitCount = "%02d";
        } else if (length < 999) {
            digitCount = "%03d";
        } else if (length < 9999) {
            digitCount = "%04d";
        } else if (length < 99999) {
            digitCount = "%05d";
        }
        formatNumber.setText("+" + String.format(digitCount, 1) + ".*");
        beforeAfter.setText("Before: filename.jpg | After: " + formatText.getText() + String.format(digitCount, 1) + ".jpg");
    }//GEN-LAST:event_btnListFilesActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        selected.setText("Selected folder: " + fileChooser.getSelectedFile());
        chooseFile.setVisible(false);
    }//GEN-LAST:event_fileChooserActionPerformed

    private void btnRenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenameActionPerformed
        if (renameList.getItemCount() != 0) {
            renameList.removeAll();
        }
        
        File directory = fileChooser.getSelectedFile();
        File[] filesInDir = directory.listFiles();
        //ArrayList<String> renameListA = new ArrayList<>();
        ArrayList<File> fileListS = new ArrayList<>();

        for (File item : filesInDir) {
            for (String m : matches) {
                if (item.getName().contains(m)) {
                    fileListS.add(item);
                }
            }
        }

        for (int i = 0; i < fileListS.size(); i++) {
            String fileName = fileListS.get(i).toString();
            String ext = fileName.substring(fileName.length() - 4, fileName.length());
            int number = i + 1;
            String nNumber = String.format(digitCount, number);
            String formatT = formatText.getText();
            String newName = formatT + nNumber + ext;
            
            String absolutePath = String.valueOf(fileChooser.getSelectedFile());
            String newPath = absolutePath + "\\" + newName;
            fileListS.get(i).renameTo(new File(newPath));
            renameList.add(newPath);
        }
    }//GEN-LAST:event_btnRenameActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        beforeAfter.setText("Before: filename.jpg | After: " + formatText.getText() + String.format(digitCount, 1) + ".jpg");
    }//GEN-LAST:event_btnTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beforeAfter;
    private javax.swing.JButton btnListFiles;
    private javax.swing.JButton btnRename;
    private javax.swing.JButton btnTest;
    private javax.swing.JButton choose;
    private javax.swing.JFrame chooseFile;
    private javax.swing.JFileChooser fileChooser;
    private java.awt.List fileList;
    private javax.swing.JLabel formatNumber;
    private javax.swing.JTextField formatText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private java.awt.List renameList;
    private javax.swing.JLabel selected;
    private javax.swing.JLabel totalFiles;
    // End of variables declaration//GEN-END:variables
}

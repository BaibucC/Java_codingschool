/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author Baiba
 */
public class Game extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form panel2
     */
    int n = 4;
    ArrayList<JButton> buttons = new ArrayList<>(n * 2);
    ArrayList<ImageIcon> iconList = new ArrayList<>();
    JButton selected1 = null;
    JButton selected2 = null;
    boolean isMatch = false;
    String time = "00 : 00";
    int moves = 0;
    int movesMed = 12;
    int movesLarge = 35;
    int count = 0;
    String iconsChosen = "";
    String diffChosen = "";
    String sizeChosen = "";
    ImageIcon icon;
    ImageIcon background = new ImageIcon("src\\images\\bg.jpg");

    public Game() {
        initComponents();
        AddListen();
        FileWriteRead addInfo = new FileWriteRead();
        addInfo.addInfo(userList, resultListLarge, resultListMedium);
        addInfo.userInfo(userList);
        //Timer timer;
        timerPause.addActionListener(actionListenerT);
        timerPause.setSelected(false);
        labelEnd.setText("Choose your game options!");
        labelBackground.setIcon(background);
    }

//Taimeris
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int min = 0;
            count++;
            //TODO var mēģināt saīsināt
            if (count >= 60) {
                min = count / 60;
            }
            if (count < 60) {
                min = 0;
                time = String.valueOf(String.format("%02d", min)) + " : " + String.valueOf(String.format("%02d", count));
            } else {
                time = String.valueOf(String.format("%02d", min)) + " : " + String.valueOf(String.format("%02d", (count % (min * 60))));
            }
            System.out.println(time);
            if (count < 3600) {
                labelTime.setText("Time: " + time);
            } else {
                ((Timer) (evt.getSource())).stop();
            }
        }
    });

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field = new javax.swing.JPanel();
        labelBackground = new javax.swing.JLabel();
        panelGameChose = new javax.swing.JPanel();
        labelDifficulty = new javax.swing.JLabel();
        labelSize = new javax.swing.JLabel();
        newGame = new javax.swing.JButton();
        diffNormal = new javax.swing.JToggleButton();
        diffHard = new javax.swing.JToggleButton();
        sizeMedium = new javax.swing.JToggleButton();
        sizeLarge = new javax.swing.JToggleButton();
        imPhotos = new javax.swing.JToggleButton();
        imClipart = new javax.swing.JToggleButton();
        imIcons = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        addPlayer = new javax.swing.JButton();
        newPlayer = new javax.swing.JTextField();
        labelNewPlayer = new javax.swing.JLabel();
        labelPlayer = new javax.swing.JLabel();
        userList = new javax.swing.JComboBox<>();
        deletePlayer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelEnd = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        timerPause = new javax.swing.JToggleButton();
        movesRem = new javax.swing.JLabel();
        tabbed2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        resultListLarge = new java.awt.List();
        jPanel4 = new javax.swing.JPanel();
        resultListMedium = new java.awt.List();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(102, 102, 102));

        field.setMaximumSize(new java.awt.Dimension(510, 510));
        field.setPreferredSize(new java.awt.Dimension(501, 501));

        labelBackground.setText("background");

        javax.swing.GroupLayout fieldLayout = new javax.swing.GroupLayout(field);
        field.setLayout(fieldLayout);
        fieldLayout.setHorizontalGroup(
            fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        fieldLayout.setVerticalGroup(
            fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        panelGameChose.setBackground(new java.awt.Color(239, 237, 223));
        panelGameChose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelDifficulty.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelDifficulty.setText("Difficulty:");

        labelSize.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelSize.setText("Size:");

        newGame.setBackground(new java.awt.Color(215, 198, 172));
        newGame.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        newGame.setText("NEW GAME");
        newGame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, new java.awt.Color(51, 51, 51), java.awt.Color.darkGray));
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        diffNormal.setBackground(new java.awt.Color(215, 198, 172));
        diffNormal.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        diffNormal.setText("Normal");
        diffNormal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        diffHard.setBackground(new java.awt.Color(215, 198, 172));
        diffHard.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        diffHard.setText("Hard");
        diffHard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        sizeMedium.setBackground(new java.awt.Color(215, 198, 172));
        sizeMedium.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sizeMedium.setText("Medium");
        sizeMedium.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        sizeLarge.setBackground(new java.awt.Color(215, 198, 172));
        sizeLarge.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sizeLarge.setText("Large");
        sizeLarge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        imPhotos.setBackground(new java.awt.Color(215, 198, 172));
        imPhotos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        imPhotos.setText("Photos");
        imPhotos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        imClipart.setBackground(new java.awt.Color(215, 198, 172));
        imClipart.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        imClipart.setText("ClipArt");
        imClipart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        imIcons.setBackground(new java.awt.Color(215, 198, 172));
        imIcons.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        imIcons.setText("Icons");
        imIcons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        javax.swing.GroupLayout panelGameChoseLayout = new javax.swing.GroupLayout(panelGameChose);
        panelGameChose.setLayout(panelGameChoseLayout);
        panelGameChoseLayout.setHorizontalGroup(
            panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameChoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGameChoseLayout.createSequentialGroup()
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDifficulty)
                            .addComponent(labelSize)
                            .addComponent(imPhotos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(diffNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sizeMedium, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imClipart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sizeLarge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diffHard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imIcons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelGameChoseLayout.setVerticalGroup(
            panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameChoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGameChoseLayout.createSequentialGroup()
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imPhotos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imIcons, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSize)
                            .addComponent(sizeLarge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diffHard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDifficulty)))
                    .addGroup(panelGameChoseLayout.createSequentialGroup()
                        .addComponent(imClipart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sizeMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(diffNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(239, 237, 223));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        addPlayer.setBackground(new java.awt.Color(215, 198, 172));
        addPlayer.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        addPlayer.setText("ADD");
        addPlayer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        addPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerActionPerformed(evt);
            }
        });

        newPlayer.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        labelNewPlayer.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelNewPlayer.setText("New player: ");

        labelPlayer.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        labelPlayer.setText("PLAYER: ");

        userList.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        deletePlayer.setBackground(new java.awt.Color(215, 198, 172));
        deletePlayer.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        deletePlayer.setText("Delete player");
        deletePlayer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        deletePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePlayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNewPlayer)
                    .addComponent(labelPlayer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userList, 0, 112, Short.MAX_VALUE)
                    .addComponent(newPlayer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userList, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlayer)
                    .addComponent(deletePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPlayer)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNewPlayer)
                        .addComponent(addPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(239, 237, 223));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelEnd.setBackground(new java.awt.Color(255, 255, 255));
        labelEnd.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        labelEnd.setForeground(new java.awt.Color(204, 0, 0));
        labelEnd.setText("Game on!");

        labelTime.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        labelTime.setText("Time: ");

        timerPause.setBackground(new java.awt.Color(215, 198, 172));
        timerPause.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        timerPause.setSelected(true);
        timerPause.setText("pause");
        timerPause.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));
        timerPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerPauseActionPerformed(evt);
            }
        });

        movesRem.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        movesRem.setText("Moves remaining: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEnd)
                    .addComponent(movesRem)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(timerPause, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTime)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTime)
                    .addComponent(timerPause, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(movesRem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEnd)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tabbed2.setBackground(new java.awt.Color(239, 237, 223));
        tabbed2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbed2.setToolTipText("");
        tabbed2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tabbed2.setName(""); // NOI18N

        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        resultListLarge.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultListLarge, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultListLarge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        tabbed2.addTab("Best results: large size", jPanel3);

        resultListMedium.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultListMedium, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resultListMedium, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        tabbed2.addTab("Best results: medium size", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelGameChose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabbed2))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelGameChose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabbed2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbed2.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents
    
    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        //clears old field
        field.removeAll();
        buttons.removeAll(buttons);
        iconList.removeAll(iconList);
        //creates new field
        //timer.stop();
        count = 0;
        labelEnd.setText("Game on!");
        moves = (sizeChosen.equals("medium")) ? movesMed : movesLarge;
        if (diffChosen.isEmpty() || sizeChosen.isEmpty() || iconsChosen.isEmpty()) {
            System.out.println("empty");
            labelEnd.setText("Choose all game options!");
        } else {
            GridLayout();
        }
    }//GEN-LAST:event_newGameActionPerformed

    private void timerPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerPauseActionPerformed
        timer.stop();
    }//GEN-LAST:event_timerPauseActionPerformed

    private void addPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerActionPerformed
        String player = newPlayer.getText();
        FileWriteRead savePlayer = new FileWriteRead();
        savePlayer.savePlayer(player);
        userList.addItem(player);
        newPlayer.setText("");
        userList.setSelectedIndex(userList.getItemCount() - 1);

    }//GEN-LAST:event_addPlayerActionPerformed

    private void deletePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePlayerActionPerformed
        int rem = userList.getSelectedIndex();
        FileWriteRead removePlayer = new FileWriteRead();
        removePlayer.removePlayer(String.valueOf(userList.getSelectedItem()));
        userList.removeItemAt(rem);
    }//GEN-LAST:event_deletePlayerActionPerformed
    private void AddListen() {
        imIcons.addActionListener(actionListenerT);
        imClipart.addActionListener(actionListenerT);
        imPhotos.addActionListener(actionListenerT);
        diffHard.addActionListener(actionListenerT);
        diffNormal.addActionListener(actionListenerT);
        sizeLarge.addActionListener(actionListenerT);
        sizeMedium.addActionListener(actionListenerT);
        //newGame.addActionListener(actionListenerN);
    }

    private void GridLayout() {
        if (diffChosen.equals("hard")) {
            movesRem.setText("Pairs remaining: " + moves);
        } else {
            movesRem.setText("Pairs remaining: unlimited");
        }
        labelTime.setText("Time: " + time);

//creates field and addds buttons from arraylist   
        field.setLayout(new GridLayout(n, n));
        for (int i = 0; i < n * n; i++) {
            buttons.add(new JButton());
            buttons.get(i).setName("b" + i);
            field.add(buttons.get(i));
            buttons.get(i).addActionListener(actionListener);
            buttons.get(i).setBackground(Color.WHITE);
        }

        createIcons createIcons = new createIcons();
        createIcons.createIcons(n, icon, sizeChosen, iconsChosen, iconList);

    }

    ActionListener actionListenerT = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evttoggle) {
            //JToggleButton buttonT = (JToggleButton) evttoggle.getSource();
            String action = evttoggle.getActionCommand();
//timer.stop();
            switch (action) {
                case "Hard":
                    diffHard.setSelected(true);
                    diffNormal.setSelected(false);
                    diffChosen = "hard";
                    break;
                case "Normal":
                    diffChosen = "normal";
                    diffNormal.setSelected(true);
                    diffHard.setSelected(false);
                    break;
                case "Medium":
                    sizeMedium.setSelected(true);
                    sizeLarge.setSelected(false);
                    tabbed2.setSelectedIndex(1);
                    sizeChosen = "medium";
                    moves = movesMed;
                    n = 4;
                    break;
                case "Large":
                    sizeMedium.setSelected(false);
                    sizeLarge.setSelected(true);
                    tabbed2.setSelectedIndex(0);
                    sizeChosen = "large";
                    moves = movesLarge;
                    n = 6;
                    break;
                case "Photos":
                    iconsChosen = "photos";
                    imPhotos.setSelected(true);
                    imIcons.setSelected(false);
                    imClipart.setSelected(false);
                    break;
                case "Icons":
                    iconsChosen = "icons";
                    imClipart.setSelected(false);
                    imPhotos.setSelected(false);
                    imIcons.setSelected(true);
                    break;
                case "ClipArt":
                    iconsChosen = "clipart";
                    imIcons.setSelected(false);
                    imPhotos.setSelected(false);
                    imClipart.setSelected(true);
                    break;
            }
        }
    };

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            timerPause.setSelected(false);
            timer.setInitialDelay(1000);
            timer.start();
            if (diffChosen.equals("hard")) {
                movesRem.setText("Pairs remaining: " + moves);
            } else {
                movesRem.setText("Pairs remaining: unlimited");
            }

            clearIcons();

            JButton button = (JButton) evt.getSource();
            for (JButton btn : buttons) {
                if (button == btn) {
                    int name2 = Integer.valueOf((button.getName()).replace("b", ""));
                    button.setIcon(iconList.get(name2));
                    if (selected1 == null) {
                        selected1 = button;
                        selected1.removeActionListener(actionListener);
                    } else {
                        selected2 = button;
                        selected2.removeActionListener(actionListener);
                    }
                    checkIcons();
                    break;
                }
            }
        }
    };

    private void clearIcons() {
        if (selected1 != null && selected2 != null) {
            selected1.addActionListener(actionListener);
            selected2.addActionListener(actionListener);
            if (!isMatch) {//sakrīt
                selected1.setIcon(null);
                selected2.setIcon(null);

            }
            selected1 = null;
            selected2 = null;
            isMatch = false;
        }
    }

    private void checkIcons() {
//checks pairs
        if (selected1 != null && selected2 != null) {
            if (selected1.getIcon() == selected2.getIcon()) {
                System.out.println("match!");
                isMatch = true;
                selected1.setEnabled(false);
                selected2.setEnabled(false);
            }
            if (selected1.getIcon() != selected2.getIcon()) {
                System.out.println("no match!");
                isMatch = false;
            }
            if (diffChosen.equals("hard")) {
                moves--;
            }
            System.out.println("Sel1: " + selected1.getName() + "  sel2: " + selected2.getName());
        }
//if moves == 0
        if (diffChosen.equals("hard")) {
            if (moves == -1) {
                labelEnd.setText("Game over!");
                timer.stop();
                for (JButton btn : buttons) {
                    btn.removeActionListener(actionListener);
                }
            }
        }

//checks if every icons is revealed
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).getIcon() == null) {
                break;
            } else if (i == buttons.size() - 1) {
                labelEnd.setText("Completed! Result saved!");
                timer.stop();
                String result = labelTime.getText() + "     Player: " + userList.getSelectedItem();

                if (sizeChosen.equals("medium")) {
                    resultListMedium.add(result);
                }
                if (sizeChosen.equals("large")) {
                    resultListLarge.add(result);
                }
                FileWriteRead saveResults = new FileWriteRead();
                saveResults.saveResults(result, sizeChosen);
//                resultListMedium.removeAll();
//                resultListLarge.removeAll();
                saveResults.addInfo(userList, resultListLarge, resultListMedium);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPlayer;
    private javax.swing.JButton deletePlayer;
    private javax.swing.JToggleButton diffHard;
    private javax.swing.JToggleButton diffNormal;
    private javax.swing.JPanel field;
    private javax.swing.JToggleButton imClipart;
    private javax.swing.JToggleButton imIcons;
    private javax.swing.JToggleButton imPhotos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelDifficulty;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JLabel labelNewPlayer;
    private javax.swing.JLabel labelPlayer;
    private javax.swing.JLabel labelSize;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel movesRem;
    private javax.swing.JButton newGame;
    private javax.swing.JTextField newPlayer;
    private javax.swing.JPanel panelGameChose;
    private java.awt.List resultListLarge;
    private java.awt.List resultListMedium;
    private javax.swing.JToggleButton sizeLarge;
    private javax.swing.JToggleButton sizeMedium;
    private javax.swing.JTabbedPane tabbed2;
    private javax.swing.JToggleButton timerPause;
    private javax.swing.JComboBox<String> userList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

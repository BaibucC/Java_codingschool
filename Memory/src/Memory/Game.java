/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.Timer;
//import java.util.Timer;

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
    //ArrayList<String> userListL = new ArrayList<>();
    JButton selected1 = null;
    JButton selected2 = null;
    boolean isMatch = false;
    //boolean hard = false;
    String time = "0 : 0";
    int moves = 0;
    int movesMed = 12;
    int movesLarge = 35;
    int count = 0;
    String iconsChosen = "";
    String diffChosen = "";
    String sizeChosen = "";
    ImageIcon icon;

    public Game() {
        initComponents();
        AddListen();
        //Timer timer;
        timerPause.addActionListener(actionListenerT);
        timerPause.setSelected(false);
        labelEnd.setText("Choose your game!");
        
    }

//!!!!!!!!!!!!!TODO Pārveidot taimera actiolistener
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int min = 0;
            //TODO var mēģināt saīsināt
            if (count >= 60) {
                min = count / 60;
            }
            if (count < 60) {
                min = 0;
                time = String.valueOf(min) + " : " + String.valueOf(count);
            } else {
                time = String.valueOf(min) + " : " + String.valueOf(count % (min * 60));
            }
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
        labelTime = new javax.swing.JLabel();
        timerPause = new javax.swing.JToggleButton();
        movesRem = new javax.swing.JLabel();
        labelEnd = new javax.swing.JLabel();
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
        panelResults = new javax.swing.JPanel();
        labelResults = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList<>();
        resultsTitle = new javax.swing.JLabel();
        addPlayer = new javax.swing.JButton();
        newPlayer = new javax.swing.JTextField();
        labelNewPlayer = new javax.swing.JLabel();
        labelPlayer = new javax.swing.JLabel();
        userList = new javax.swing.JComboBox<>();

        setForeground(new java.awt.Color(102, 102, 102));

        field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        field.setMaximumSize(new java.awt.Dimension(510, 510));
        field.setPreferredSize(new java.awt.Dimension(501, 501));

        javax.swing.GroupLayout fieldLayout = new javax.swing.GroupLayout(field);
        field.setLayout(fieldLayout);
        fieldLayout.setHorizontalGroup(
            fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        fieldLayout.setVerticalGroup(
            fieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        labelTime.setText("Time: ");

        timerPause.setSelected(true);
        timerPause.setText("pause");
        timerPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerPauseActionPerformed(evt);
            }
        });

        movesRem.setText("Moves remaining: ");

        labelEnd.setBackground(new java.awt.Color(255, 255, 255));
        labelEnd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEnd.setForeground(new java.awt.Color(204, 0, 0));
        labelEnd.setText("Game on!");

        panelGameChose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelDifficulty.setText("Difficulty:");

        labelSize.setText("Size:");

        newGame.setText("New game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        diffNormal.setText("Normal");

        diffHard.setText("Hard");

        sizeMedium.setText("Medium");

        sizeLarge.setText("Large");

        imPhotos.setText("Photos");

        imClipart.setText("ClipArt");

        imIcons.setText("Icons");

        javax.swing.GroupLayout panelGameChoseLayout = new javax.swing.GroupLayout(panelGameChose);
        panelGameChose.setLayout(panelGameChoseLayout);
        panelGameChoseLayout.setHorizontalGroup(
            panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGameChoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGameChoseLayout.createSequentialGroup()
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDifficulty)
                            .addComponent(labelSize)
                            .addComponent(imPhotos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(diffNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sizeMedium, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imClipart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sizeLarge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diffHard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imIcons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGameChoseLayout.setVerticalGroup(
            panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGameChoseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGameChoseLayout.createSequentialGroup()
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imPhotos)
                            .addComponent(imIcons))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSize)
                            .addComponent(sizeLarge))
                        .addGap(11, 11, 11)
                        .addGroup(panelGameChoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diffHard)
                            .addComponent(labelDifficulty)))
                    .addGroup(panelGameChoseLayout.createSequentialGroup()
                        .addComponent(imClipart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sizeMedium)
                        .addGap(11, 11, 11)
                        .addComponent(diffNormal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelResults.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labelResults.setText("Size: ???   Difficulty: ???    Images: ????");

        jScrollPane1.setViewportView(resultList);

        resultsTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resultsTitle.setText("Results");

        javax.swing.GroupLayout panelResultsLayout = new javax.swing.GroupLayout(panelResults);
        panelResults.setLayout(panelResultsLayout);
        panelResultsLayout.setHorizontalGroup(
            panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultsTitle)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelResultsLayout.setVerticalGroup(
            panelResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultsTitle)
                .addGap(7, 7, 7)
                .addComponent(labelResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addPlayer.setText("ADD");
        addPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerActionPerformed(evt);
            }
        });

        labelNewPlayer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelNewPlayer.setText("New player: ");

        labelPlayer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPlayer.setText("PLAYER: ");

        userList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelResults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEnd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movesRem, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelTime)
                        .addGap(98, 98, 98)
                        .addComponent(timerPause))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNewPlayer)
                            .addComponent(labelPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPlayer)
                            .addComponent(userList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(addPlayer))
                    .addComponent(panelGameChose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelGameChose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNewPlayer)
                            .addComponent(newPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTime)
                            .addComponent(timerPause))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(movesRem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelEnd))
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        //clears old field
        field.removeAll();
        buttons.removeAll(buttons);
        iconList.removeAll(iconList);
        //creates new field
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
        
        userList.addItem(player);
        newPlayer.setText("");
        userList.setSelectedIndex(userList.getItemCount()-1);
    }//GEN-LAST:event_addPlayerActionPerformed

    private void userListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListActionPerformed
        
    }//GEN-LAST:event_userListActionPerformed
    private void AddListen() {
        imIcons.addActionListener(actionListenerT);
        imClipart.addActionListener(actionListenerT);
        imPhotos.addActionListener(actionListenerT);
        diffHard.addActionListener(actionListenerT);
        diffNormal.addActionListener(actionListenerT);
        sizeLarge.addActionListener(actionListenerT);
        sizeMedium.addActionListener(actionListenerT);
        newGame.addActionListener(actionListenerN);
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

//creates & shuffles icons
        for (int i = 0; i < n * n / 2; i++) {
            //icon = new ImageIcon();
            switch (iconsChosen) {
                case "photos":
                    icon = new ImageIcon("src\\images\\photos\\icon" + i + ".jpg");
                    icon = new ImageIcon("src\\images\\photos\\icon" + i + ".jpg");
                    break;
                case "clipart":
                    icon = new ImageIcon("src\\images\\clipart\\icon" + i + ".jpg");
                    icon = new ImageIcon("src\\images\\clipart\\icon" + i + ".jpg");
                    break;
                case "icons":
                    icon = new ImageIcon("src\\images\\icons\\icon" + i + ".jpg");
                    icon = new ImageIcon("src\\images\\icons\\icon" + i + ".jpg");
                    break;
            }
            Image resized = icon.getImage();
            if (sizeChosen.equals("medium")) {
                resized = icon.getImage().getScaledInstance(122, 122, Image.SCALE_SMOOTH);
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

    ActionListener actionListenerT = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evttoggle) {
            //JToggleButton buttonT = (JToggleButton) evttoggle.getSource();
            //boolean selected = button.getModel().isSelected();
            String action = evttoggle.getActionCommand();

            switch (action) {
                case "Hard":
                    diffNormal.setSelected(false);
                    diffChosen = "hard";
                    System.out.println("hard");
                    break;
                case "Normal":
                    System.out.println("normal");
                    diffChosen = "normal";
                    diffHard.setSelected(false);
                    break;
                case "Medium":
                    sizeLarge.setSelected(false);
                    System.out.println("medium");
                    sizeChosen = "medium";
                    moves = movesMed;
                    n = 4;
                    break;
                case "Large":
                    sizeMedium.setSelected(false);
                    System.out.println("large");
                    sizeChosen = "large";
                    moves = movesLarge;
                    n = 6;
                    break;
                case "Photos":
                    iconsChosen = "photos";
                    imIcons.setSelected(false);
                    imClipart.setSelected(false);
                    System.out.println("photos");
                    break;
                case "Icons":
                    iconsChosen = "icons";
                    imClipart.setSelected(false);
                    imPhotos.setSelected(false);
                    System.out.println("icons");
                    break;
                case "ClipArt":
                    iconsChosen = "clipart";
                    imIcons.setSelected(false);
                    imPhotos.setSelected(false);
                    System.out.println("cliparttttt");
                    break;
            }
        }
    };

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            count++;
//            try {
                timer.setInitialDelay(1000);
                timer.start();
                if (diffChosen.equals("hard")) {
                    movesRem.setText("Pairs remaining: " + moves);
                } else {
                    movesRem.setText("Pairs remaining: unlimited");
                }
                timerPause.setSelected(false);
                clearIcons();
                JButton button = (JButton) evt.getSource();

                for (JButton btn : buttons) {
                    if (button == btn) {
                        System.out.println("icon name:  " + button.getName());
                        int name2 = Integer.valueOf((button.getName()).replace("b", ""));
                        button.setIcon(iconList.get(name2));
                        System.out.println("icon n:  " + button.getIcon());
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
//            } catch (Exception ex) {
//
//            }
        }
    };

    ActionListener actionListenerN = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evn) {
            System.out.println("new game");          
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
        if (diffChosen.equals("normal")) {
            System.out.println("normal going on");
        }
//TODO !!!!!!!!!!!!!Nestrādā korekti ??
//checks if every icons is revealed
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).getIcon() == null) {
                break;
            } else if (i == buttons.size() - 1) {
                System.out.println("pilns");
                labelEnd.setText("Completed!");
                timer.stop();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPlayer;
    private javax.swing.JToggleButton diffHard;
    private javax.swing.JToggleButton diffNormal;
    private javax.swing.JPanel field;
    private javax.swing.JToggleButton imClipart;
    private javax.swing.JToggleButton imIcons;
    private javax.swing.JToggleButton imPhotos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDifficulty;
    private javax.swing.JLabel labelEnd;
    private javax.swing.JLabel labelNewPlayer;
    private javax.swing.JLabel labelPlayer;
    private javax.swing.JLabel labelResults;
    private javax.swing.JLabel labelSize;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel movesRem;
    private javax.swing.JButton newGame;
    private javax.swing.JTextField newPlayer;
    private javax.swing.JPanel panelGameChose;
    private javax.swing.JPanel panelResults;
    private javax.swing.JList<String> resultList;
    private javax.swing.JLabel resultsTitle;
    private javax.swing.JToggleButton sizeLarge;
    private javax.swing.JToggleButton sizeMedium;
    private javax.swing.JToggleButton timerPause;
    private javax.swing.JComboBox<String> userList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

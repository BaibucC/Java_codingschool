/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

/**
 *
 * @author user
 */
public class Kalkulators extends javax.swing.JPanel {

    /**
     * Creates new form Kalkulators
     */
    public Kalkulators() {
        initComponents();

    }

    private String num1 = "0";
    private String action = "";
    private String actionf = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        poga1 = new javax.swing.JButton();
        poga2 = new javax.swing.JButton();
        poga3 = new javax.swing.JButton();
        poga4 = new javax.swing.JButton();
        poga5 = new javax.swing.JButton();
        poga6 = new javax.swing.JButton();
        poga9 = new javax.swing.JButton();
        poga7 = new javax.swing.JButton();
        poga8 = new javax.swing.JButton();
        calc = new javax.swing.JLabel();
        poga10 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        result = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        div = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
<<<<<<< HEAD

        setBackground(new java.awt.Color(208, 229, 180));

=======
        clear = new javax.swing.JButton();

        setBackground(new java.awt.Color(212, 212, 109));

>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga1.setBackground(new java.awt.Color(153, 153, 0));
        poga1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga1.setForeground(new java.awt.Color(51, 51, 0));
        poga1.setText("1");
<<<<<<< HEAD
        poga1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga1ActionPerformed(evt);
            }
        });

        poga2.setBackground(new java.awt.Color(153, 153, 0));
        poga2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga2.setForeground(new java.awt.Color(51, 51, 0));
        poga2.setText("2");
<<<<<<< HEAD
        poga2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga2ActionPerformed(evt);
            }
        });

        poga3.setBackground(new java.awt.Color(153, 153, 0));
        poga3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga3.setForeground(new java.awt.Color(51, 51, 0));
        poga3.setText("3");
<<<<<<< HEAD
        poga3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga3ActionPerformed(evt);
            }
        });

        poga4.setBackground(new java.awt.Color(153, 153, 0));
        poga4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga4.setForeground(new java.awt.Color(51, 51, 0));
        poga4.setText("4");
<<<<<<< HEAD
        poga4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga4ActionPerformed(evt);
            }
        });

        poga5.setBackground(new java.awt.Color(153, 153, 0));
        poga5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga5.setForeground(new java.awt.Color(51, 51, 0));
        poga5.setText("5");
<<<<<<< HEAD
        poga5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga5ActionPerformed(evt);
            }
        });

        poga6.setBackground(new java.awt.Color(153, 153, 0));
        poga6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga6.setForeground(new java.awt.Color(51, 51, 0));
        poga6.setText("6");
<<<<<<< HEAD
        poga6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga6ActionPerformed(evt);
            }
        });

        poga9.setBackground(new java.awt.Color(153, 153, 0));
        poga9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga9.setForeground(new java.awt.Color(51, 51, 0));
        poga9.setText("9");
<<<<<<< HEAD
        poga9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga9ActionPerformed(evt);
            }
        });

        poga7.setBackground(new java.awt.Color(153, 153, 0));
        poga7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga7.setForeground(new java.awt.Color(51, 51, 0));
        poga7.setText("7");
<<<<<<< HEAD
        poga7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga7ActionPerformed(evt);
            }
        });

        poga8.setBackground(new java.awt.Color(153, 153, 0));
        poga8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga8.setForeground(new java.awt.Color(51, 51, 0));
        poga8.setText("8");
<<<<<<< HEAD
        poga8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga8ActionPerformed(evt);
            }
        });

        calc.setBackground(new java.awt.Color(255, 255, 153));
        calc.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        calc.setForeground(new java.awt.Color(51, 51, 0));
        calc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        calc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        calc.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        poga10.setBackground(new java.awt.Color(153, 153, 0));
        poga10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        poga10.setForeground(new java.awt.Color(51, 51, 0));
        poga10.setText("0");
<<<<<<< HEAD
        poga10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        poga10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        poga10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        poga10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poga10ActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(153, 153, 0));
<<<<<<< HEAD
        plus.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        plus.setForeground(new java.awt.Color(51, 51, 0));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plus.setMaximumSize(new java.awt.Dimension(31, 49));
        plus.setMinimumSize(new java.awt.Dimension(31, 49));
=======
        plus.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        plus.setForeground(new java.awt.Color(51, 51, 0));
        plus.setText("+");
        plus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(153, 153, 0));
<<<<<<< HEAD
        minus.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        minus.setForeground(new java.awt.Color(51, 51, 0));
        minus.setText("-");
        minus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        minus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minus.setMaximumSize(new java.awt.Dimension(17, 49));
        minus.setMinimumSize(new java.awt.Dimension(17, 49));
=======
        minus.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        minus.setForeground(new java.awt.Color(51, 51, 0));
        minus.setText("-");
        minus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        result.setBackground(new java.awt.Color(153, 153, 0));
        result.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
<<<<<<< HEAD
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setText("=");
        result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        result.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
=======
        result.setForeground(new java.awt.Color(51, 51, 0));
        result.setText("=");
        result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        multi.setBackground(new java.awt.Color(153, 153, 0));
<<<<<<< HEAD
        multi.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        multi.setForeground(new java.awt.Color(51, 51, 0));
        multi.setText("*");
        multi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        multi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multi.setMaximumSize(new java.awt.Dimension(25, 49));
        multi.setMinimumSize(new java.awt.Dimension(25, 49));
        multi.setPreferredSize(new java.awt.Dimension(25, 49));
=======
        multi.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        multi.setForeground(new java.awt.Color(51, 51, 0));
        multi.setText("*");
        multi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });

        div.setBackground(new java.awt.Color(153, 153, 0));
<<<<<<< HEAD
        div.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        div.setForeground(new java.awt.Color(51, 51, 0));
        div.setText("/");
        div.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        div.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
=======
        div.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        div.setForeground(new java.awt.Color(51, 51, 0));
        div.setText("/");
        div.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

<<<<<<< HEAD
=======
        clear.setBackground(new java.awt.Color(153, 153, 0));
        clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        clear.setForeground(new java.awt.Color(51, 51, 0));
        clear.setText("C");
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(calc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(poga1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(poga2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(poga3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(poga10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(poga7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(poga4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(poga5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(poga6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(poga8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(poga9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
=======
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(poga1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(poga2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(poga3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(poga4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(poga5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(poga6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                        .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(poga1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(poga4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(poga7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(poga10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
=======
                        .addGap(98, 98, 98)
                        .addComponent(poga10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poga1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poga2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poga3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(poga4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poga5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poga6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(poga7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(poga9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(poga10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void poga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga1ActionPerformed
//        if (actionf == "finalResult") {
//            calc.setText("1");
//        } else {
        setElementText("1"); //izsauc funkciju
//        }

    }//GEN-LAST:event_poga1ActionPerformed

    private void poga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga2ActionPerformed
        setElementText("2");
    }//GEN-LAST:event_poga2ActionPerformed

    private void poga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga3ActionPerformed
        setElementText("3");
    }//GEN-LAST:event_poga3ActionPerformed

    private void poga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga4ActionPerformed
        setElementText("4");
    }//GEN-LAST:event_poga4ActionPerformed

    private void poga5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga5ActionPerformed
        setElementText("5");
    }//GEN-LAST:event_poga5ActionPerformed

    private void poga6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga6ActionPerformed
        setElementText("6");
    }//GEN-LAST:event_poga6ActionPerformed

    private void poga7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga7ActionPerformed
        setElementText("7");
    }//GEN-LAST:event_poga7ActionPerformed

    private void poga8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga8ActionPerformed
        setElementText("8");
    }//GEN-LAST:event_poga8ActionPerformed

    private void poga9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga9ActionPerformed
        setElementText("9");
    }//GEN-LAST:event_poga9ActionPerformed

    private void poga10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poga10ActionPerformed
        setElementText("0");
    }//GEN-LAST:event_poga10ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        num1 = calc.getText();
        action = "sum";
        calc.setText("");
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        num1 = calc.getText();
        calc.setText("");
        action = "minus";
    }//GEN-LAST:event_minusActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        String num2 = calc.getText();
        double number1 = Double.valueOf(num1);
        double number2 = Double.valueOf(num2);
        Aprekini sum = new Aprekini();
        double result = 0;
<<<<<<< HEAD
=======
        String results = "";
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3

        switch (action) {
            case "sum":
                result = sum.Sum(number1, number2);
                break;
            case "minus":
                result = sum.Minus(number1, number2);
                break;
            case "multi":
                result = sum.Multi(number1, number2);
                break;
            case "div":
                result = sum.Div(number1, number2);
                break;
<<<<<<< HEAD
        }

        num1 = String.valueOf(result);
        calc.setText(num1);
=======
            default:
                result = 0;
                break;
        }

        //num1 = String.valueOf(result);
        results = String.valueOf(result);
        calc.setText(results);
        actionf = "finalResult";

>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3
    }//GEN-LAST:event_resultActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        num1 = calc.getText();
        calc.setText("");
        action = "multi";
    }//GEN-LAST:event_multiActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        num1 = calc.getText();
        calc.setText("");
        action = "div";
    }//GEN-LAST:event_divActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        calc.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void setElementText(String value) {
<<<<<<< HEAD
        calc.setText(value);
=======
        if (actionf == "finalResult") {
            calc.setText(value);
        } else {
            value = calc.getText() + value;
            calc.setText(value);
        }

//        if (results.charAt(0) == 0) {
//            results = results.substring(1);
//        }
>>>>>>> 68c762ae3a043862a39d99b17b3b34966cfc04b3

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calc;
    private javax.swing.JButton clear;
    private javax.swing.JButton div;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton minus;
    private javax.swing.JButton multi;
    private javax.swing.JButton plus;
    private javax.swing.JButton poga1;
    private javax.swing.JButton poga10;
    private javax.swing.JButton poga2;
    private javax.swing.JButton poga3;
    private javax.swing.JButton poga4;
    private javax.swing.JButton poga5;
    private javax.swing.JButton poga6;
    private javax.swing.JButton poga7;
    private javax.swing.JButton poga8;
    private javax.swing.JButton poga9;
    private javax.swing.JButton result;
    // End of variables declaration//GEN-END:variables
}
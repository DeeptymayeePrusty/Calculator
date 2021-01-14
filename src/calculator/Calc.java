
package calculator;
public class Calc extends javax.swing.JFrame {

    double num,res;
    int calc;
    public Calc() {
        initComponents();
        rb1.setEnabled(false);
    }
    public void operation()
    {
        switch(calc)
        {
            case 1:
                res=num+Double.parseDouble(tf.getText());
                tf.setText(Double.toString(res));
                break;
                
            case 2:
                res=num-Double.parseDouble(tf.getText());
                tf.setText(Double.toString(res));
                break;
                
            case 3:
                res=num*Double.parseDouble(tf.getText());
                tf.setText(Double.toString(res));
                break;
                
            case 4:
                res=num/Double.parseDouble(tf.getText());
                tf.setText(Double.toString(res));
                break;
        }
    }
    public void enable()
    {
        tf.setEnabled(true);
        rb1.setEnabled(false);
        rb2.setEnabled(true);
        
        b0.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true); 
        b11.setEnabled(true);
        ba.setEnabled(true);
        bs.setEnabled(true);
        bm.setEnabled(true);
        bd.setEnabled(true);
        be.setEnabled(true);
        bc.setEnabled(true);
    }
    public void disable()
    {
        tf.setEnabled(false);
        rb1.setEnabled(true);
        rb2.setEnabled(false);
        
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false); 
        b11.setEnabled(false);
        ba.setEnabled(false);
        bs.setEnabled(false);
        bm.setEnabled(false);
        bd.setEnabled(false);
        be.setEnabled(false);
        bc.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tf = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        b11 = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        ba = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bs = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bm = new javax.swing.JButton();
        bd = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        be = new javax.swing.JButton();
        l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 200));
        setType(java.awt.Window.Type.UTILITY);

        tf.setEditable(false);
        tf.setBackground(new java.awt.Color(255, 204, 153));
        tf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rb1.setText("ON");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rb2.setText("OFF");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(255, 0, 0));
        b11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b11.setText("<--");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        bc.setBackground(new java.awt.Color(255, 0, 0));
        bc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        ba.setBackground(new java.awt.Color(255, 0, 0));
        ba.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ba.setText("+");
        ba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(0, 0, 0));
        b7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b7.setForeground(new java.awt.Color(204, 204, 204));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(0, 0, 0));
        b8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b8.setForeground(new java.awt.Color(204, 204, 204));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(0, 0, 0));
        b9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b9.setForeground(new java.awt.Color(204, 204, 204));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bs.setBackground(new java.awt.Color(255, 0, 0));
        bs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bs.setText("-");
        bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(0, 0, 0));
        b4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b4.setForeground(new java.awt.Color(204, 204, 204));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b5.setForeground(new java.awt.Color(204, 204, 204));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(0, 0, 0));
        b6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b6.setForeground(new java.awt.Color(204, 204, 204));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bm.setBackground(new java.awt.Color(255, 0, 0));
        bm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bm.setText("x");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });

        bd.setBackground(new java.awt.Color(255, 0, 0));
        bd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bd.setText("/");
        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(0, 0, 0));
        b3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b3.setForeground(new java.awt.Color(204, 204, 204));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(0, 0, 0));
        b2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b2.setForeground(new java.awt.Color(204, 204, 204));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(0, 0, 0));
        b1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b1.setForeground(new java.awt.Color(204, 204, 204));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(0, 0, 0));
        b0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b0.setForeground(new java.awt.Color(204, 204, 204));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(0, 0, 0));
        b10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b10.setForeground(new java.awt.Color(204, 204, 204));
        b10.setText(".");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        be.setBackground(new java.awt.Color(0, 51, 255));
        be.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        be.setText("=");
        be.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beActionPerformed(evt);
            }
        });

        l.setBackground(new java.awt.Color(255, 0, 51));
        l.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb2)
                            .addComponent(rb1)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ba, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(be, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb2)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b7)
                            .addComponent(b8)
                            .addComponent(b9)
                            .addComponent(bs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b4)
                            .addComponent(b5)
                            .addComponent(b6)
                            .addComponent(bm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2)
                            .addComponent(b3)
                            .addComponent(bd))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b0)
                            .addComponent(b10)
                            .addComponent(be)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(b11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        int length=tf.getText().length();
        int num=tf.getText().length()-1;
        String store;
        
        if(length>0)
        {
            StringBuilder back=new StringBuilder(tf.getText());
            back.deleteCharAt(num);
            store=back.toString();
            tf.setText(store);
        }
    }//GEN-LAST:event_b11ActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
       tf.setText("");
    }//GEN-LAST:event_bcActionPerformed

    private void baActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baActionPerformed
       num=Double.parseDouble(tf.getText());
       calc=1;
       tf.setText("");
       l.setText(num + " +");
    }//GEN-LAST:event_baActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        tf.setText(tf.getText()+"7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        tf.setText(tf.getText()+"8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        tf.setText(tf.getText()+"9");
    }//GEN-LAST:event_b9ActionPerformed

    private void bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsActionPerformed
       num=Double.parseDouble(tf.getText());
       calc=2;
       tf.setText("");
       l.setText(num + " -");
    }//GEN-LAST:event_bsActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        tf.setText(tf.getText()+"4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        tf.setText(tf.getText()+"5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        tf.setText(tf.getText()+"6");
    }//GEN-LAST:event_b6ActionPerformed

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmActionPerformed
       num=Double.parseDouble(tf.getText());
       calc=3;
       tf.setText("");
       l.setText(num + " x");
    }//GEN-LAST:event_bmActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
       num=Double.parseDouble(tf.getText());
       calc=4;
       tf.setText("");
       l.setText(num + " /");
    }//GEN-LAST:event_bdActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        tf.setText(tf.getText()+"3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       tf.setText(tf.getText()+"2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       tf.setText(tf.getText()+"1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        tf.setText(tf.getText()+"0");
    }//GEN-LAST:event_b0ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        tf.setText(tf.getText()+".");
    }//GEN-LAST:event_b10ActionPerformed

    private void beActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beActionPerformed
        operation();
        l.setText("");
    }//GEN-LAST:event_beActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        disable();
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        enable();
    }//GEN-LAST:event_rb1ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton ba;
    private javax.swing.JButton bc;
    private javax.swing.JButton bd;
    private javax.swing.JButton be;
    private javax.swing.JButton bm;
    private javax.swing.JButton bs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel l;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}

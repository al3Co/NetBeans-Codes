/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author AldoC
 */
public class MDIPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MDIPrincipal
     */
            int Button5, Balance=1000;
            int User=1, Password=1;
            boolean Flag1=false, Flag2=false, Flag3=false;
            boolean Flag6=false,Flag4=false,Flag5=false;
            boolean FlagOthers=false;
    public MDIPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        textArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textArea1KeyPressed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Enter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("        ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(" ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setText("-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setText("ITNL Posgrado ATM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(178, 178, 178)
                        .addComponent(jButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(252, 252, 252))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(31, 31, 31)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton5)
                                .addGap(29, 29, 29)
                                .addComponent(jButton6)
                                .addGap(26, 26, 26)
                                .addComponent(jButton9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jLabel2.getAccessibleContext().setAccessibleName("jLabel1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        textArea1.setText("     Wellcome to the Automated Tellet Machine !\n"+"\nPress Start");
        jLabel2.setText("");
        jTextField1.setText("");
        Button5=0;
        Flag1=false;
        Flag2=false;
        Flag3=false;
        Flag4=false;
        Flag5=false;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void textArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textArea1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textArea1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            textArea1.setText("     Wellcome to the Automated Tellet Machine !\n"
                +"\n\n\n\n                            Enter User");
            jLabel2.setText("User Account");
            jTextField1.setText("");
            Flag5=true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    if(Flag5==true){
            Button5=Integer.parseInt(jTextField1.getText());
        if (Button5==User && Flag1==false && Flag2==false){
            Flag1=true;
            Flag2=false;
            textArea1.setText("     Wellcome to the Automated Tellet Machine !\n"
                +"\n\n\n\n                            Enter Password");
            jTextField1.setText("");
            jLabel2.setText("Password");
            Button5=0;
            
        }
        else if(Button5!=User && Flag1==false && Flag2==false){
            Flag1=false;
            Flag2=true;
            Button5=0;
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n User Account error Press Clear");
        }
        else if(Button5==Password && Flag1==true && Flag2==false){
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+
            "\n\n\n<<Check Balance                        Withdrawal>>\n"
            +"\n\n\n<<Deposit                                         Other>>\n");
            Flag1=true;
            Flag2=true;
            Button5=0;
            jLabel2.setText("");
            jTextField1.setText("");
        }
        else if(Button5!=Password && Flag1==true && Flag2==false){
            Flag1=false;
            Flag2=false;
            Button5=0;
            jLabel2.setText("");
            jTextField1.setText("");
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n            Password error"+"\n\n\n\n       Press clear and start again");
        }
        else if(Flag1==true && Flag2==true && Flag3==true){
            if(Button5<0){
                textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n Balance :"+Balance+"\n\n\nDeposit Imposible, Press back and try again");
            }
            else if(Button5>0 && Flag3==true){
                Balance=Balance+Button5;
                textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n New Balance: "+Balance +"\n\n       Press Back or Exit");
                jLabel2.setText("");
                jTextField1.setText("");
                Button5=0;
            }
        }
        else if(Flag1==true && Flag2==true && Flag4==true && FlagOthers==false){
            if(Button5<0 || Button5>Balance){
                textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n Balance :"+Balance+"\n\n\nWithdrawal Imposible, Press back and try again");
            }
            else if(Button5>0 && Flag4==true){
                Balance=Balance-Button5;
                textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n New Balance: "+Balance +"\n\n       Press Back or Exit");
                jLabel2.setText("");
                jTextField1.setText("");
                Button5=0;
            }
        }
        else if(Flag1==true && Flag2==true && Flag6==true && FlagOthers==false){
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n       Press Back or Exit");
                
        }
        else if (Flag1==true && Flag2==true  && FlagOthers==true){
            Password=Button5;
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n\n\n"+ "\n New Password: "+Password +"\n\n\n\n       Press Back or Exit");
            jLabel2.setText("");
            jTextField1.setText("");
            FlagOthers=false;
            Button5=0;
        }
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (Flag1==true && Flag2==true && FlagOthers==false){
            jLabel2.setText("");
            jTextField1.setText("");
            Button5=0;
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n Balance :"+Balance + "\n\n       Press Back or Exit");
        }
        if (Flag1==true && Flag2==true && FlagOthers==true){
            jLabel2.setText("New password: ");
            jTextField1.setText("");
            Button5=0;
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n Write your new password"+ "\n\n When finish press Enter then Back or Exit");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Flag1==true && Flag2==true){
            Flag3=false;
            FlagOthers=false;
            jLabel2.setText("");
            jTextField1.setText("");
            Button5=0;
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n<<Check Balance                        Withdrawal>>\n"
            +"\n\n\n<<Deposit                                       Other>>\n");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Flag1==true && Flag2==true && Flag3==false && FlagOthers==false){
            Flag3=true;
            jLabel2.setText("Deposit :");
            jTextField1.setText("");
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n Balance :"+Balance+"\n\n\n Insert the depositand and Press Enter Button"); 
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (Flag1==true && Flag2==true && Flag3==false && FlagOthers==false){
            Flag4=true;
            jLabel2.setText("Withdrawal :");
            jTextField1.setText("");
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n Balance :"+Balance+"\n\n\n Write quantity and Press Enter Button"); 
        }
        if (Flag1==true && Flag2==true && Flag3==false && FlagOthers==true){
            jLabel2.setText("Members :");
            jTextField1.setText("");
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n\n"+"\n\n Write quantity of Members\n And Press Enter Button"); 
         
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (Flag1==true && Flag2==true && Flag3==false && FlagOthers==false){
            Flag6=true;
            FlagOthers=true;
            jLabel2.setText("");
            jTextField1.setText("");
            textArea1.setText("Wellcome to the Automated Tellet Machine !\n"+"\n\n\n<<Change Password               New Members>>\n"
            +"\n\n\n<<-                                                       ->>\n");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
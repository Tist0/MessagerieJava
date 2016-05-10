/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author 21507124
 */
public class IfAppli extends javax.swing.JFrame {

    MyAbstractList model;
    private Component frame;

    /**
     * Creates new form jframe
     */
    public IfAppli() {
        model = new MyAbstractList();
        initComponents(); 
        Color bleuAzur = new Color (245, 250, 250);
     
        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));
        jInternalFrame1.getContentPane().setBackground(Color.WHITE);
        jPanel1.setBackground(bleuAzur);
        //.setBackground(Color.WHITE);
        jMenuBar1.setBackground(Color.WHITE);
        //jPanel4.setBackground(Color.WHITE);
        //jPanel5.setBackground(Color.WHITE);
        jPanel6.setBackground(Color.WHITE);
        taMsgSalon.setBackground(Color.WHITE);
        jPanel7.setBackground(bleuAzur);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPersonnes = new javax.swing.JList();
        lblPseudo = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        tfSendMessage = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMsgSalon = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDescription = new javax.swing.JMenu();
        mnuMembres = new javax.swing.JMenu();
        mnuGestion = new javax.swing.JMenu();
        jComboBox1 = new javax.swing.JComboBox();
        btnActualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lstPersonnes.setModel(model);
        lstPersonnes.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lstPersonnesComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(lstPersonnes);

        lblPseudo.setText("jLabel1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "En ligne", "Absent" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPseudo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblPseudo)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(null);
        jInternalFrame1.setForeground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setTitle("Projet Super Panda");
        jInternalFrame1.setToolTipText("");
        jInternalFrame1.setVisible(true);

        tfSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSendMessageActionPerformed(evt);
            }
        });

        taMsgSalon.setEditable(false);
        taMsgSalon.setColumns(20);
        taMsgSalon.setRows(5);
        jScrollPane2.setViewportView(taMsgSalon);

        mnuDescription.setText("Description");
        mnuDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuDescriptionMouseClicked(evt);
            }
        });
        mnuDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDescriptionActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuDescription);

        mnuMembres.setText("Membres connectés");
        jMenuBar1.add(mnuMembres);

        mnuGestion.setText("Gestion du salon");
        mnuGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGestionActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuGestion);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(tfSendMessage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnActualiser.setText("Actualiser");
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jInternalFrame1)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnActualiser))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualiser)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSendMessageActionPerformed
        String text = tfSendMessage.getText();

        Calendar cal = Calendar.getInstance();
        int minute = cal.get(Calendar.MINUTE);
        int hour =(Calendar.HOUR_OF_DAY);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        String date = (day+"/"+month+"/"+year);

        //En cours: condition pour afficher explicitement que c'est une nouvelle journée depuis le dernier message
        //BDD: Besoin d'un champs dateDernierMessage pour la table salon
        /*if (cal.get(Calendar.DAY_OF_YEAR) != dateDernierMessage)
        {
            jTextArea1.append(date);
        }*/

        taMsgSalon.append(hour+ ":" +minute+"   "+text+"\n");

        tfSendMessage.selectAll();

        tfSendMessage.setCaretPosition(tfSendMessage.getDocument().getLength());
        tfSendMessage.getText();
        tfSendMessage.setText("");
    }//GEN-LAST:event_tfSendMessageActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        Personne p = new Personne("Nom","Prenom");
        model.add(p);
        JMenuItem mi = new JMenuItem();

// affectation du texte
mi.setText("le texte");

// l'item de menu est actif
mi.setEnabled(true);
// Ajout de l'item à un menu 
mnuMembres.add(mi);
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void lstPersonnesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lstPersonnesComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lstPersonnesComponentAdded

    private void mnuGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGestionActionPerformed
        
    }//GEN-LAST:event_mnuGestionActionPerformed

    private void mnuDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDescriptionActionPerformed
       
    }//GEN-LAST:event_mnuDescriptionActionPerformed

    private void mnuDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDescriptionMouseClicked
        JOptionPane.showMessageDialog(taMsgSalon, "Description du salon : Les pandas ça sert à rien!");
    }//GEN-LAST:event_mnuDescriptionMouseClicked

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
            java.util.logging.Logger.getLogger(IfAppli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IfAppli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IfAppli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IfAppli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

               
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IfAppli().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiser;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPseudo;
    private javax.swing.JList lstPersonnes;
    private javax.swing.JMenu mnuDescription;
    private javax.swing.JMenu mnuGestion;
    private javax.swing.JMenu mnuMembres;
    private javax.swing.JTextArea taMsgSalon;
    private javax.swing.JTextField tfSendMessage;
    // End of variables declaration//GEN-END:variables
}

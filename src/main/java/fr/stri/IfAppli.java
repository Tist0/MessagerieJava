/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author 21507124
 */
public class IfAppli extends javax.swing.JFrame {
    MyAbstractList model;
    private Component frame;
    private String login;
    private int idSalon;

    /**
     * Creates new form jframe
     */
    public IfAppli() {
        String loginUse;
   
        model = new MyAbstractList();
        initComponents();
        
        actualiserListeSalon();
        actualiser();
        
        Timer tMessage = new Timer(2000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            actualiser();
        }           
        });
        tMessage.start();
        /*Applique un jeu de couleur*/   
        colorisation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tokupanda");
        setIconImages(null);
        setResizable(false);

        jPanel1.setName("Tokupanda"); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 153))); // NOI18N

        lstPersonnes.setModel(model);
        lstPersonnes.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lstPersonnesComponentAdded(evt);
            }
        });
        lstPersonnes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPersonnesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstPersonnes);

        lblPseudo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPseudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPseudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/en ligne.png"))); // NOI18N
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
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblPseudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblPseudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );

        jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jInternalFrame1.setForeground(new java.awt.Color(255, 255, 255));
        jInternalFrame1.setTitle("Projet Super Panda");
        jInternalFrame1.setToolTipText("");
        jInternalFrame1.setFocusable(false);
        jInternalFrame1.setVisible(true);

        tfSendMessage.setForeground(new java.awt.Color(153, 153, 153));
        tfSendMessage.setText("Entrer un message ici");
        tfSendMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSendMessageFocusLost(evt);
            }
        });
        tfSendMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSendMessageMouseClicked(evt);
            }
        });
        tfSendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSendMessageActionPerformed(evt);
            }
        });

        taMsgSalon.setEditable(false);
        taMsgSalon.setColumns(20);
        taMsgSalon.setRows(5);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, new javax.swing.JButton(), org.jdesktop.beansbinding.ELProperty.create("true"), taMsgSalon, org.jdesktop.beansbinding.BeanProperty.create("lineWrap"));
        bindingGroup.addBinding(binding);

        jScrollPane2.setViewportView(taMsgSalon);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfSendMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Croquis-panda-bannieredd - Copie.jpg"))); // NOI18N

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
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel2))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(647, 647, 647))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSendMessageActionPerformed
        String texte = tfSendMessage.getText();
        String text = texte.replace("\'","\''");
        
        Calendar cal = Calendar.getInstance();
        int seconde = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int heure =cal.get(Calendar.HOUR_OF_DAY);
        int jour = cal.get(Calendar.DAY_OF_MONTH);
        int mois = cal.get(Calendar.MONTH);
        int annee = cal.get(Calendar.YEAR);
        String date = (jour+"/"+mois+"/"+annee);
        String horaire = (heure+":"+minute+":"+seconde);
        
        /*Reste a mettre l'id salon dynamique*/
        Identification login = new Identification();
        String loginUse = login.log1.getLogin(); 
        System.err.println("TEST" + login);
        String envoieMsg = "INSERT INTO Message(date_Message,heure_Message,contenu,login_envoi,idSalon) VALUES ('"+date+"','"+horaire+"','"+text+"','"+loginUse+"',1);";
        System.err.println("TEST" + envoieMsg);
     
        ConnexionBDD cbdd = new ConnexionBDD();
        cbdd.insertSql(envoieMsg);
        
        //En cours: condition pour afficher explicitement que c'est une nouvelle journée depuis le dernier message
        //BDD: Besoin d'un champs dateDernierMessage pour la table salon
        /*if (cal.get(Calendar.DAY_OF_YEAR) != dateDernierMessage)
        {
            jTextArea1.append(date);
        }*/

        //taMsgSalon.append(heure+ ":" +minute+"   "+text+"\n");

        tfSendMessage.selectAll();

        tfSendMessage.setCaretPosition(tfSendMessage.getDocument().getLength());
        tfSendMessage.getText();
        tfSendMessage.setText(""); 
    }//GEN-LAST:event_tfSendMessageActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String statut = jComboBox2.getSelectedItem().toString();
        
        Identification login = new Identification();
        String loginUse = login.log1.getLogin(); 
        
        
        if ("En ligne".equals(statut)){
            String envoieMsg = "UPDATE USERS SET statut = '1' WHERE login = '"+loginUse+"';";
            
            ConnexionBDD cbdd = new ConnexionBDD();
            cbdd.insertSql(envoieMsg);
            lblPseudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/en ligne.png")));
        }
        else{
            String envoieMsg = "UPDATE USERS SET statut = '0' WHERE login = '"+loginUse+"';";
        
            ConnexionBDD cbdd = new ConnexionBDD();
            cbdd.insertSql(envoieMsg);
            lblPseudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/absent.png")));        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void lstPersonnesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lstPersonnesComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lstPersonnesComponentAdded

    private void mnuGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGestionActionPerformed
    }//GEN-LAST:event_mnuGestionActionPerformed

    private void mnuDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDescriptionActionPerformed
    }//GEN-LAST:event_mnuDescriptionActionPerformed

    private void mnuDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDescriptionMouseClicked
        /*########*/
        ConnexionBDD cbdd = new ConnexionBDD();
        String selection = jComboBox1.getSelectedItem().toString();
        String description = cbdd.descriptionSQL(selection);
        JOptionPane.showMessageDialog(taMsgSalon, description);
    }//GEN-LAST:event_mnuDescriptionMouseClicked

    private void lstPersonnesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPersonnesMouseClicked
        String personSelect = (lstPersonnes.getSelectedValue().toString());

        Identification login = new Identification();
        String loginUse = login.log1.getLogin(); 
        
        //jComboBox2.toString();
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            System.out.println(personSelect);
            
            ConnexionBDD cbdd = new ConnexionBDD();
            String salonPriveeExist = cbdd.idSalonPrivee(loginUse+personSelect);            
        }        
    }//GEN-LAST:event_lstPersonnesMouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        //String titreSalon = jComboBox1.getSelectedItem().toString();
        String titreSalon = jComboBox1.getSelectedItem().toString(); 
        jInternalFrame1.setTitle(titreSalon);       
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void tfSendMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSendMessageMouseClicked
        tfSendMessage.setText("");
        tfSendMessage.setForeground(new java.awt.Color(0, 0, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_tfSendMessageMouseClicked

    private void tfSendMessageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSendMessageFocusLost
        tfSendMessage.setForeground(new java.awt.Color(153, 153, 153));
        tfSendMessage.setText("Entrer un message ici");  
    }//GEN-LAST:event_tfSendMessageFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String login) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */           
        ConnexionBDD cbdd = new ConnexionBDD();
        cbdd.test();

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

        /*--------------------------------------------------*/
 /*----------------------------------------------------------*/
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IfAppli().setVisible(true);                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

public void actualiserListeSalon() {

        ConnexionBDD salonBD = new ConnexionBDD();
        ResultSet rsSalon = salonBD.listeSalon();
        
        try {
            while (rsSalon.next()) {
                String salon = rsSalon.getString("nom_salon");
                SalonDiscution q = new SalonDiscution(salon);                             
                jComboBox1.addItem(q);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public void actualiser() {
     /*Clear/Reset avant d'actualiser*/    
        model.clear();
        taMsgSalon.setText("");
        
        /*-----------------------------------------------*/
        /*ConnexionBDD salonBD = new ConnexionBDD();
        ResultSet rsSalon = salonBD.listeSalon();
        
        try {
            while (rsSalon.next()) {
                String salon = rsSalon.getString("nom_salon");
                SalonDiscution q = new SalonDiscution(salon);
                
                    System.out.println("\n\n\n\n"+q);
                    jComboBox1.addItem(q);               
            }
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /*Liste personnes*/
        /*------------------------------------------*/        
        ConnexionBDD cbdd = new ConnexionBDD();
        ResultSet rs = cbdd.listeMembre();
        
        try {
            while (rs.next()) {
                String login = rs.getString("login");
                Personne p = new Personne(login);                
                model.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*------------------------------------------*/
        /*Récupère les messages de la BDD*/
        String titreSalon = jComboBox1.getSelectedItem().toString(); 
        
        ConnexionBDD recupIdSalon = new ConnexionBDD();
        String numSalon = recupIdSalon.getIdSalon(titreSalon);
        
        try {
            ResultSet result = cbdd.recupHistoriqueSQL(numSalon);
            
            while (result.next()) {
                String loginH = result.getString("login_envoi");
                String dateH = result.getString("date_message");
                String heureH = result.getString("heure_message");
                String heureHE = heureH.substring(0,5);
                String messH = result.getString("contenu");
                taMsgSalon.append(dateH+"\t"+heureHE+"\n"+loginH+" : "+messH+"\n"+"\n\n");
            }      
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }        
        /*Messagerie*/
            /*------------------------------------------*/
            /*Reste a mettre le login dynamique, comme l'id salon*/
            
        /*------------------------------------------*/
        JMenuItem mi = new JMenuItem();

        // affectation du texte
        mi.setText("le texte");

        // l'item de menu est actif
        mi.setEnabled(true);
        // Ajout de l'item à un menu 
        
        mnuMembres.add(mi);
        
        /*Affecte le login de la personne connecté au lable1 (au-dessus du bouton absent)*/
        Identification login = new Identification();
        String loginUse = login.log1.getLogin(); 
        lblPseudo.setText(loginUse);    
}

    private void colorisation() {
        Color bleuAzur = new Color(245, 250, 250);

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
}

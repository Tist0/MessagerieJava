/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author florian b
 */
public class AjoutPersonnes extends javax.swing.JPanel {
    MyAbstractList listModel;

    /**
     * Creates new form AjoutPersonnes
     */
    public AjoutPersonnes() {
        initComponents();
        
        actualiserListeSalon();
        jComboBox2.removeAllItems();
        jComboBox1.removeAllItems();
        actualiser();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSalon = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        jLabel1.setText("Gestion des membres");

        jLabel2.setText("Salon");

        jComboBoxSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSalonActionPerformed(evt);
            }
        });

        jLabel3.setText("Sélectionnez un salon puis ajouter/retirez des membres");

        jButton1.setText("Ajouter>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<<Retirer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Membres du salon");

        jLabel5.setText("Liste de personnes");

        jComboBox1.setMaximumRowCount(250);

        jComboBox2.setMaximumRowCount(250);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1))
                            .addGap(113, 113, 113)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jButton2))
                            .addGap(14, 14, 14))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
/**
 * Ajoute un utilisateur à un salon
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String titreSalon = jComboBoxSalon.getSelectedItem().toString(); 
        String login = jComboBox1.getSelectedItem().toString(); 
        ConnexionBDD cbddd3 = new ConnexionBDD();        
        String recupIdSalon = cbddd3.getIdSalon(titreSalon);
        
        String requeteb = "INSERT INTO Acceder(login,idSalon) VALUES ('"+login+"','"+recupIdSalon+"');";    
        ConnexionBDD cbddb = new ConnexionBDD();
        cbddb.insertSql(requeteb);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Actualise la liste des salons lorsque on la développe
     * @param evt 
     */
    private void jComboBoxSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalonActionPerformed
        jComboBox2.removeAllItems();
        jComboBox1.removeAllItems();
        actualiser();
    }//GEN-LAST:event_jComboBoxSalonActionPerformed

    /**
     * Retire un utilisateur d'un salon
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            /*Suppression*/            
            
        String titreSalon = jComboBoxSalon.getSelectedItem().toString(); 
        String login = jComboBox2.getSelectedItem().toString(); 
        ConnexionBDD cbdda = new ConnexionBDD();
        String idSalon=cbdda.getIdSalon(titreSalon);
        String requetea = "DELETE FROM Acceder WHERE login='"+login+"' AND idSalon='"+idSalon+"';";
        cbdda.insertSql(requetea);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * Actualise la liste des personnes
     * Actualise les personnes d'un salon en fonction du salon selectionné
     */
    public void actualiser() {
     /*Clear/Reset avant d'actualiser*/    
        /*------------------------------------------*/        
        ConnexionBDD cbdd = new ConnexionBDD();
        ResultSet rs = cbdd.listeMembre();
             
        try {
            while (rs.next()) {
                String login = rs.getString("login");
                Personne p = new Personne(login);                
                jComboBox1.addItem(p.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*------------------------------------------*/
        String titreSalon = jComboBoxSalon.getSelectedItem().toString();
        
        ConnexionBDD cbdddd = new ConnexionBDD();
        String idSalon = cbdddd.getIdSalon(titreSalon);
        
        ConnexionBDD cbddd = new ConnexionBDD();
        ResultSet rsd = cbddd.listeMembreSalon(idSalon);
        
        try {
            while (rsd.next()) {
                String login = rsd.getString("login");
                Personne p = new Personne(login);                
                jComboBox2.addItem(p.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }      
}

/**
 * Actualise la liste des salons dans jComboBoxSalon
 */
    public void actualiserListeSalon() {
        Identification login = new Identification();
        String loginUse = login.log1.getLogin(); 
        
        ConnexionBDD salonBD = new ConnexionBDD();
        ResultSet rsSalon = salonBD.listeSalon(loginUse);
        
        try {
            while (rsSalon.next()) {
                String salon = rsSalon.getString("nom_salon");
                SalonDiscution q = new SalonDiscution(salon);                             
                jComboBoxSalon.addItem(q.toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(IfAppli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

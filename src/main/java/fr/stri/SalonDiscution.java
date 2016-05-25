/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

/**
 *
 * @author Firtorios
 */
class SalonDiscution {
    
    private String nom_salon;

    public SalonDiscution(String nom_salon) {
        this.nom_salon = nom_salon;
    }

    // Getters et setters

    public String getSalonDiscution() {
        return nom_salon;
    }

    public void setSalonDiscution(String nom_salon) {
        this.nom_salon = nom_salon;
    }

    @Override
    public String toString() {
        return getSalonDiscution(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

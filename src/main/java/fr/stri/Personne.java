/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

/**
 *
 * @author 21507124
 */
class Personne {

    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    // Getters et setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return getNom(); //To change body of generated methods, choose Tools | Templates.
    }

}

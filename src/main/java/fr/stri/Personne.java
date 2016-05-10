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
    private String prenom;
    

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    
    public String getNomPrenom(){        
        return (nom+" "+prenom);
    }    
    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    @Override
    public String toString() {
        return getNomPrenom(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

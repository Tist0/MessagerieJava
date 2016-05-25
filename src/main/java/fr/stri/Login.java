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
class Login {
    
    public String login;

    // Getters et setters

        public Login(String login) {
        this.login = login;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String loginValeur) {
        this.login = loginValeur;
    }

    @Override
    public String toString() {
        return getLogin(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Entrar
 */
public class Mail {
    private String mail;
    
    public Mail(String newMail) {
        mail = newMail;
    }
    
    public String getDomain() {
        return mail.split("@")[1];
    }
}

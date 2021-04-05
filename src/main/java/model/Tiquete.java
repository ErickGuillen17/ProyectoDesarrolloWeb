/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alejandro
 */
public class Tiquete {
    private String idTiquete;
    private String descripTiquete;

    public Tiquete(String idTiquete, String descripTiquete) {
        this.idTiquete = idTiquete;
        this.descripTiquete = descripTiquete;
    }

    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getDescripTiquete() {
        return descripTiquete;
    }

    public void setDescripTiquete(String descripTiquete) {
        this.descripTiquete = descripTiquete;
    }
    
    
}

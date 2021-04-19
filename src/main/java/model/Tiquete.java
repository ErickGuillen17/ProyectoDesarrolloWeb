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

    private int idTiquete;
    private String titulo;
    private String descripTiquete;
    private String categoria;

    public Tiquete() {
    }

    
    
    public Tiquete(int idTiquete, String titulo, String descripTiquete, String categoria) {
        this.idTiquete = idTiquete;
        this.titulo = titulo;
        this.descripTiquete = descripTiquete;
        this.categoria = categoria;
    }



    public int getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(int idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getDescripTiquete() {
        return descripTiquete;
    }

    public void setDescripTiquete(String descripTiquete) {
        this.descripTiquete = descripTiquete;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}

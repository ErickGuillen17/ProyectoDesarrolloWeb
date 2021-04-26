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
    private String descripcionTiquete;
    private String titulo;
    private String categoria;

    public Tiquete() {
    }

    public Tiquete(int idTiquete, String descripcionTiquete, String titulo, String categoria) {
        this.idTiquete = idTiquete;
        this.descripcionTiquete = descripcionTiquete;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public int getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(int idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getDescripcionTiquete() {
        return descripcionTiquete;
    }

    public void setDescripcionTiquete(String descripcionTiquete) {
        this.descripcionTiquete = descripcionTiquete;
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

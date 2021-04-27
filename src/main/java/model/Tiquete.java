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

//    private int idTiquete;    
    private String titulo;
    private String descripcionTiquete;    
    private int categoria;

    public Tiquete() {
    }

    public Tiquete(/*int idTiquete,*/ String titulo, String descripcionTiquete, int categoria) {
//        this.idTiquete = idTiquete;
          this.titulo = titulo;
          this.descripcionTiquete = descripcionTiquete;          
          this.categoria = categoria;
    }

//    public int getIdTiquete() {
//        return idTiquete;
//    }
//
//    public void setIdTiquete(int idTiquete) {
//        this.idTiquete = idTiquete;
//    }

    public String getDescripcionTiquete() {
        return descripcionTiquete;
    }

    public void setDescripcionTiquete(String descripcionTiquete) {
        this.descripcionTiquete = descripcionTiquete;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}

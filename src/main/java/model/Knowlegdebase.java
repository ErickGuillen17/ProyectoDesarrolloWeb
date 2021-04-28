/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Knowlegdebase {

//    private int codigo;
    private String titulo;
    private String contenido;
    private String tipo;

    public Knowlegdebase() {
    }

    public Knowlegdebase(/*int codigo,*/ String titulo, String contenido, String tipo) {
//         this.codigo = codigo;
        this.titulo = titulo;
        this.contenido = contenido;
        this.tipo = tipo;
    }

/*    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

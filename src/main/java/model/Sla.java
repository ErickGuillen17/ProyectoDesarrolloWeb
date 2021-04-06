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
public class Sla {

    private String idSla;
    private Severidad laSeveridad;
    private Urgencia laUrgencia;
    private String duracion; 

    public String getIdSla() {
        return idSla;
    }

    public void setIdSla(String idSla) {
        this.idSla = idSla;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Severidad getLaSeveridad() {
        return laSeveridad;
    }

    public Urgencia getLaUrgencia() {
        return laUrgencia;
    }

}

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
public class Incidente {

    private String idIncidente;
    private Tiquete elTiquete;
    private Severidad laSeveridad;
    private Sla elSla;
    private Urgencia laUrgencia;
    private EstadoCaso elEstadoCaso;
    //idProducto(FK)	
    private Inventario elInventario;
    private Usuario elUsuario;
    private String title;
    private String bitacora;
    private String fechaCreacion;
    private String fechaSla;
    private String fechaCierre;

    public String getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(String idIncidente) {
        this.idIncidente = idIncidente;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBitacora() {
        return bitacora;
    }

    public void setBitacora(String bitacora) {
        this.bitacora = bitacora;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaSla() {
        return fechaSla;
    }

    public void setFechaSla(String fechaSla) {
        this.fechaSla = fechaSla;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(String fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public Tiquete getElTiquete() {
        return elTiquete;
    }

    public Severidad getLaSeveridad() {
        return laSeveridad;
    }

    public Sla getElSla() {
        return elSla;
    }

    public Urgencia getLaUrgencia() {
        return laUrgencia;
    }

    public EstadoCaso getElEstadoCaso() {
        return elEstadoCaso;
    }

    public Inventario getElInventario() {
        return elInventario;
    }

    public Usuario getElUsuario() {
        return elUsuario;
    }



}

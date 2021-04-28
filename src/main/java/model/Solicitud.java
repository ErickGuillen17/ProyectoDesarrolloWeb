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
public class Solicitud {

    private String idSolicitud;
    private Tiquete elTiquete;
    private Sla elSla;
    private Urgencia laUrgencia;
    private EstadoCaso elEstado;
    //idProducto(FK)	
    private Inventario elInventario;
    private Usuario elUsuario;
    private String descripSolicitud;
    private String fechaCreacion;
    private String fechaSla;
    private String fechaCierre;

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getDescripSolicitud() {
        return descripSolicitud;
    }

    public void setDescripSolicitud(String descripSolicitud) {
        this.descripSolicitud = descripSolicitud;
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

    public Sla getElSla() {
        return elSla;
    }

    public Urgencia getLaUrgencia() {
        return laUrgencia;
    }

    public EstadoCaso getElEstado() {
        return elEstado;
    }

    public Inventario getElInventario() {
        return elInventario;
    }

    public Usuario getElUsuario() {
        return elUsuario;
    }
    
    

}

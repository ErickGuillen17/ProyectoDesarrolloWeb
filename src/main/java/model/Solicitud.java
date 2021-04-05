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
    public Tiquete elTiquete;
    public Sla elSla;
    public Urgencia laUrgencia;
    public EstadoCaso elEstado;
    //idProducto(FK)	
    public Inventario elInventario;
    public Usuario elUsuario;
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
    
    

}

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
    public Tiquete elTiquete;
    public Severidad laSeveridad;
    public Sla elSla;
    public Urgencia laUrgencia;
    public EstadoCaso elEstadoCaso;
    //idProducto(FK)	
    public Inventario elInventario;
    public Usuario elUsuario;
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



}

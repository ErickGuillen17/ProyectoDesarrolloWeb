/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Usuario {

    private int idUsuario;
    private String idEmpleado;
    private Empleado elEmpleado;
    private Rol miRol;
    private String nombreUsuario;
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(int idUsuario, String idEmpleado, String nombreUsuario, String contrasenia) {
        this.idUsuario = idUsuario;
        this.idEmpleado = idEmpleado;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getMiRol() {
        return miRol;
    }

    public Empleado getElEmpleado() {
        return elEmpleado;
    }

    public void setElEmpleado(Empleado elEmpleado) {
        this.elEmpleado = elEmpleado;
    }

}

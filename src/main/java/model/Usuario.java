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

    private String idUsuario;
    private String idEmpleado;
    private Empleado elEmpleado;
    public Rol miRol;
    private String nomUsuario;
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String idUsuario, String idEmpleado, String nomUsuario, String contrasenia) {
        this.idUsuario = idUsuario;
        this.idEmpleado = idEmpleado;
        this.nomUsuario = nomUsuario;
        this.contrasenia = contrasenia;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}

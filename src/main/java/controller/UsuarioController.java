/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gestion.UsuarioGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Usuario;

/**
 *
 * @author Dell
 */
@Named(value = "usuarioController")
@SessionScoped
public class UsuarioController extends Usuario implements Serializable {

    /**
     * Creates a new instance of UsuarioController
     */
    public UsuarioController() {
    }

    public String getUsuario() {
        Usuario usuario = UsuarioGestion.getUsuario(this.getNombreUsuario(),
                this.getContrasenia());
        if (usuario != null) {
            return "home.xhtml";
        } else {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Error", "Usuario o Contraseña incorrecta");
            FacesContext.getCurrentInstance().addMessage("loginForm:clave", msg);
            return "index.html";
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gestion.TiqueteGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Tiquete;

/**
 *
 * @author User
 */
@Named(value = "tiqueteController")
@SessionScoped
public class TiqueteController extends Tiquete implements Serializable {

    /**
     * Creates a new instance of TiqueteController
     */
    public TiqueteController() {
    }

    public List<Tiquete> getTiquetes() {
        return TiqueteGestion.getTiquetes();
    }

    public String insertTiquete() {
        if (TiqueteGestion.insertTiquete(this)) {
            FacesMessage msg = new FacesMessage("Tiquete ingresado corectamente");
            FacesContext.getCurrentInstance().addMessage("insertaTiqueteForm:titulo", msg);
            return "nuevoTiquete.xhtml";
        } else {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Ocurrio un error al ingresar el tiquete");
            FacesContext.getCurrentInstance().addMessage("insertaTiqueteForm:titulo", msg);
            return "nuevoTiquete.xhtml";

        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gestion.KnowlegdebaseGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.Knowlegdebase;

/**
 *
 * @author Dell
 */
@Named(value = "knowlegdebaseController")
@SessionScoped
public class KnowlegdebaseController extends Knowlegdebase implements Serializable {

    /**
     * Creates a new instance of KnowlegdebaseController
     */
    public KnowlegdebaseController() {
    }

    public List<Knowlegdebase> getKnowlegdebases() {
        return KnowlegdebaseGestion.getKnowlegdebases();
    }

    public String insertKnowlegdebase() {
        if (KnowlegdebaseGestion.insertKnowlegdebase(this)) {
            FacesMessage msg = new FacesMessage("Knowlegdebase ingresado corectamente");
            FacesContext.getCurrentInstance().addMessage("insertaKnowlegdebaseForm:titulo", msg);
            return "nuevoKnowlegdebase.xhtml";
        } else {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error",
                    "Ocurrio un error al ingresar el Knowlegdebase");
            FacesContext.getCurrentInstance().addMessage("insertaKnowlegdebaseForm:titulo", msg);
            return "nuevoKnowlegdebase.xhtml";

        }
    }

}

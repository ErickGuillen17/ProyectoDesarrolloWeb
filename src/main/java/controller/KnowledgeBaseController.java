/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import gestion.KnowledgeBaseGestion;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import model.KnowledgeBase;

/**
 *
 * @author Personal
 */
@Named(value = "knowledgeBaseController")
@SessionScoped
public class KnowledgeBaseController extends KnowledgeBase implements Serializable {

    /**
     * Creates a new instance of KnowledgeBaseController
     */
    public KnowledgeBaseController() {
    }
    
    public List<KnowledgeBase> getKnowledgeBases(){
        return KnowledgeBaseGestion.getKnowledgeBases();
    }
}

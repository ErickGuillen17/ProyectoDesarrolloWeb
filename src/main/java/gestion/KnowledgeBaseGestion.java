/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.KnowledgeBase;

/**
 *
 * @author Personal
 */
public class KnowledgeBaseGestion {
    
    private static final String SQL_GETKNOWLEDGEBASES = "SELECT * FROM KnowledgeBase";
    
    public static ArrayList <KnowledgeBase> getKnowledgeBases(){
        ArrayList<KnowledgeBase> lista = new ArrayList<>();
        try{
            PreparedStatement sentencia = Conexion.getConexion()
                    .prepareStatement(SQL_GETKNOWLEDGEBASES);
            ResultSet rs = sentencia.executeQuery();
            while(rs!=null && rs.next()){
                lista.add(new KnowledgeBase(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TiqueteGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}

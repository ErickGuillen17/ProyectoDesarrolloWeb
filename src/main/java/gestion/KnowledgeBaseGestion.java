/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import model.Conexion;
import model.KnowledgeBase;

/**
 *
 * @author Personal
 */
public class KnowledgeBaseGestion {
    
    private static final String SQL_GETARTICULOS = "SELECT * FROM proyecto.knowlegdebase";
    private static final String SQL_GETARTICULO = "SELECT * FROM proyecto.knowlegdebase where codigo=? and titulo=?";
    
    public static ArrayList<KnowledgeBase> getArticulos(){
        ArrayList<KnowledgeBase> lista = new ArrayList<>();
        try{
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(SQL_GETARTICULOS);
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
    public static KnowledgeBase getArticulo(int codigo, String titulo){
        KnowledgeBase kb=null;
        try{
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(SQL_GETARTICULO);
            sentencia.setInt(1, codigo);
            sentencia.setString(2, titulo);
            ResultSet rs = sentencia.executeQuery();
            while (rs != null && rs.next()){
                kb= new KnowledgeBase(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return kb;
    }
}
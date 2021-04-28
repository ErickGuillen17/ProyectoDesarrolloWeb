/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Knowlegdebase;

/**
 *
 * @author Dell
 */
public class KnowlegdebaseGestion {

    private static final String SQL_GETKNOWLEGDEBASES = "SELECT * FROM knowledgebase";
    private static final String SQL_INSERTKNOWLEGDEBASE = "insert into knowledgebase(titulo,contenido,tipo) VALUES (?,?,?)";

    public static ArrayList<Knowlegdebase> getKnowlegdebases() {
        ArrayList<Knowlegdebase> lista = new ArrayList<>();
        try {
            PreparedStatement sentencia = Conexion.getConexion()
                    .prepareStatement(SQL_GETKNOWLEGDEBASES);
            ResultSet rs = sentencia.executeQuery();
            while (rs != null && rs.next()) {
                lista.add(new Knowlegdebase(
                        //                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KnowlegdebaseGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public static boolean insertKnowlegdebase(Knowlegdebase knowlegdebase) {
        try {
            PreparedStatement sentencia = Conexion.getConexion()
                    .prepareStatement(SQL_INSERTKNOWLEGDEBASE);
//          sentencia.setInt(1, tiquete.getCodigo());
            sentencia.setString(1, knowlegdebase.getTitulo());
            sentencia.setString(2, knowlegdebase.getContenido());
            sentencia.setString(3, knowlegdebase.getTipo());
            return sentencia.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(TiqueteGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

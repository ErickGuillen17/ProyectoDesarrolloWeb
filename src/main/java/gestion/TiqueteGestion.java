/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Tiquete;


/**
 *
 * @author User
 */
public class TiqueteGestion {


    private static final String SQL_INSERTTIQUETE = "insert into tiquete(idTiquete,titulo,descripTiquete,categoria) VALUES (?,?,?,?)";


    public static boolean insertTiquete(Tiquete tiquete) {
        try {
            PreparedStatement sentencia = Conexion.getConexion()
                    .prepareStatement(SQL_INSERTTIQUETE);
            sentencia.setString(1, tiquete.getIdTiquete());
            sentencia.setString(2, tiquete.getTitulo());
            sentencia.setString(3, tiquete.getDescripTiquete());
            sentencia.setString(4, tiquete.getCategoria());
            return sentencia.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(TiqueteGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return false;
    }

}

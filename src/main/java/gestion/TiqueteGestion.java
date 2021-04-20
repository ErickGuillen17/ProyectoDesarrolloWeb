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
import model.Tiquete;

/**
 *
 * @author User
 */
public class TiqueteGestion {

    private static final String SQL_GETTIQUETES = "SELECT * FROM proyecto.tiquete";
    private static final String SQL_INSERTTIQUETE = "insert into proyecto.tiquete(idTiquete,descripcionTiquete,titulo,categoria) VALUES (?,?,?,?)";

    public static ArrayList<Tiquete> getTiquetes() {
        ArrayList<Tiquete> lista = new ArrayList<>();
        try {
            PreparedStatement sentencia = Conexion.getConexion()
                    .prepareStatement(SQL_GETTIQUETES);
            ResultSet rs = sentencia.executeQuery();
            while (rs != null && rs.next()) {
                lista.add(new Tiquete(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }

        } catch (SQLException ex) {
            Logger.getLogger(TiqueteGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return lista;

    }

    public static boolean insertTiquete(Tiquete tiquete) {
        try {
            PreparedStatement sentencia = Conexion.getConexion()
                    .prepareStatement(SQL_INSERTTIQUETE);
            sentencia.setInt(1, tiquete.getIdTiquete());
            sentencia.setString(2, tiquete.getTitulo());
            sentencia.setString(3, tiquete.getDescripcionTiquete());
            sentencia.setString(4, tiquete.getCategoria());
            return sentencia.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(TiqueteGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return false;
    }

}

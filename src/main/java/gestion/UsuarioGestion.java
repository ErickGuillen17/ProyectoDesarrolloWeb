/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Conexion;
import model.Usuario;

/**
 *
 * @author Dell
 */
public class UsuarioGestion {

    private static final String SQL_GetUsuario = "SELECT * FROM usuario where nombreUsuario=? and contrasenia=?";

    public static Usuario getUsuario(String nombreUsuario, String contrasenia) {
        Usuario usuario = null;
        try {
            PreparedStatement sentencia = Conexion.getConexion().prepareStatement(SQL_GetUsuario);
            sentencia.setString(1, nombreUsuario);
            sentencia.setString(2, contrasenia);
            ResultSet rs = sentencia.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setNombreUsuario(nombreUsuario);
                usuario.setContrasenia(contrasenia);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioGestion.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
}

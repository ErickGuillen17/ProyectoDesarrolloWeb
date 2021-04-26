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
import model.TotalIncidents;

/**
 *
 * @author Dell
 */
public class IncidenteGestion {

    private static final String SQL_INGRESO_TOTAL_INC = "select year(fechaCreacion) as Fecha,idTiquete,count(*) total from incidente group by year(fechaCreacion),idTiquere order by year(fechaCreacion)";

    public static ArrayList<TotalIncidents> getIngresoYear() {
        ArrayList<TotalIncidents> lista = new ArrayList<>();
        try {
            PreparedStatement sentencia = Conexion.getConexion()
                    .prepareStatement(SQL_INGRESO_TOTAL_INC);
            ResultSet rs = sentencia.executeQuery();
            while (rs != null && rs.next()) {
                lista.add(new TotalIncidents(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(2)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(IncidenteGestion.class.getName())
                    .log(Level.SEVERE, null, ex);

        }
        return lista;

    }
}

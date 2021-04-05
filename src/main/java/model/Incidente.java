/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alejandro
 */
public class Incidente {
    private String idIncidente;
    private Tiquete elTiquete;
    private Severidad laSeveridad;
    private Sla elSla;
    private Urgencia laUrgencia;
    private EstadoCaso elEstadoCaso;
            //idProducto(FK)	
    private Inventario elInventario;
    private Usuario elUsuario;
            /*title	
            bitacora
            fechaCreacion
            fechaSla	
            fechaCierre*/

}

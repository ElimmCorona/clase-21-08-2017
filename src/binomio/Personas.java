/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binomio;

import java.sql.ResultSet;

/**
 *
 * @author Alumno
 */
public class Personas {
        
    
    private String error = "";

    public Personas() {

    }
    
    public String ERROR() {
        return this.error;
    }
    
    public void agregarResp(String nom, String paterno, String materno, String escuela) {
        cDatos conex = new cDatos();
        try {
            conex.conectar();
            ResultSet rsguarda = null;
            rsguarda = conex.consulta("call spGuardaPersona( '"+ nom +"','"+ paterno +"','"+ materno +"','"+ escuela +"');");
            if (rsguarda.next())
                 conex.cierraConexion();
            else
                error= rsguarda.getString("msj");
        }
        catch (Exception error) {
            this.error=error.getMessage();
        }
    }
}

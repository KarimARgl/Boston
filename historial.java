/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boston;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MKARim
 */
public class historial {

    conexiones con;
    Statement stmt;
    ResultSet resultado;
    //public String;

    public historial() {
        con = new conexiones();
    }

    public void NuevaConsulta(String idpacientes, String fecha, String peso, String sintomas, String diagnostico, String tratamiento) {
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT INTO historial(idpaciente, fechaConsulta, peso, sintomas, tratamiento, diagnostico) values(?,?,?,?,?,?)");
            pstm.setString(1, idpacientes);
            pstm.setString(2, fecha);
            pstm.setString(3, peso);
            pstm.setString(4, sintomas);
            pstm.setString(5, diagnostico);
            pstm.setString(6, tratamiento);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Object[][] getDatos(String idpacientes) {
        int registros = 0;
        //obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as total FROM historial ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[][] data = new String[registros][5];
        //realizamos la consulta sql y llenamos los datos en "Object"
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("SELECT "
                    + " fechaConsulta, peso, sintomas, diagnostico, tratamiento "
                    + " FROM historial "
                    + " WHERE idPaciente = '" + idpacientes + "'"
                    + " ORDER BY idConsulta ");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                String fechaConsulta = res.getString("fechaConsulta");
                String peso = res.getString("peso");
                String sintomas = res.getString("sintomas");
                String diagnostico = res.getString("diagnostico");
                String tratamiento = res.getString("tratamiento");
                data[i][0] = fechaConsulta;
                data[i][1] = peso;
                data[i][2] = sintomas;
                data[i][3] = diagnostico;
                data[i][4] = tratamiento;
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

}

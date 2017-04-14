package boston;

import java.sql.*;

/**
 *
 * @author MKARim
 */
public class pacientes {

    conexiones con;
    Statement stmt;
    ResultSet resultado;
    public String busquedaidPaciente, busquedaNombre, busquedaSexo, busquedaRaza, busquedaColor, busquedaFecha, busquedaNotas, busquedaDueño, busquedaDireccion, busquedaTelefono, busquedaCelular;

    public pacientes() {
        con = new conexiones();
    }

    public void NuevoPaciente(String nombre, String sexo, String raza, String color, String fecha, String notas, String dueño, String direccion, String telefono, String celular) {
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT INTO pacientes(nombre, sexo, raza, color, fecha, notas, dueno, direccion, telefono, celular) values(?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, nombre);
            pstm.setString(2, sexo);
            pstm.setString(3, raza);
            pstm.setString(4, color);
            pstm.setString(5, fecha);
            pstm.setString(6, notas);
            pstm.setString(7, dueño);
            pstm.setString(8, direccion);
            pstm.setString(9, telefono);
            pstm.setString(10, celular);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void EditarPaciente(String idpacientes, String nombre, String notas, String dueño, String direccion, String telefono, String celular) {
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE pacientes SET nombre = ? ," + "notas = ? ," + "dueno = ? ," + "direccion = ? ," + "telefono = ? ," + "celular = ? " + "WHERE idpacientes = ? ");
            pstm.setString(1, nombre);
            pstm.setString(2, notas);
            pstm.setString(3, dueño);
            pstm.setString(4, direccion);
            pstm.setString(5, telefono);
            pstm.setString(6, celular);
            pstm.setString(7, idpacientes);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void BuscarPaciente(String idpacientes) {
        conexiones con;
        Statement stmt;
        ResultSet resultado;
        pacientes db = new pacientes();
        try {
            db.stmt = db.con.conn.createStatement();
            db.resultado = db.stmt.executeQuery("SELECT * from pacientes WHERE idpacientes = '" + idpacientes + "'");
            while (db.resultado.next()) {
                busquedaidPaciente = db.resultado.getString(1);
                busquedaNombre = db.resultado.getString(2);
                busquedaSexo = db.resultado.getString(3);
                busquedaRaza = db.resultado.getString(4);
                busquedaColor = db.resultado.getString(5);
                busquedaFecha = db.resultado.getString(6);
                busquedaNotas = db.resultado.getString(7);
                busquedaDueño = db.resultado.getString(8);
                busquedaDireccion = db.resultado.getString(9);
                busquedaTelefono = db.resultado.getString(10);
                busquedaCelular = db.resultado.getString(11);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
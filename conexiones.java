package boston;

import java.sql.*;

/**
 *
 * @author MKARim
 */
public class conexiones {

    static String bd = "boston";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost/" + bd;
    Connection conn = null;

    public conexiones() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexión
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("¡La conexión a la Base de Datos " + bd + " esta lista!");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void desconexion() {
        conn = null;
        System.out.println("La conexión a la  Base de Datos " + bd + " se ha cerrado.");
    }
}
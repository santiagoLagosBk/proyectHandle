package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String USERNAME="user";
    private static String CONTRASENA="123";
    private static final String URL="jdbc:mysql://localhost:3306/employees?useTimezone=true&serverTimezone=UTC";

    Connection con;

    public Connection getCon(){

        try {
            con= DriverManager.getConnection(URL,USERNAME,CONTRASENA);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return con;
    }

}

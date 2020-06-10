package javaguide.login.database;

import Config.Conexion;
import javaguide.login.principal.LoginU;

import java.sql.*;

public class LoginDao {

    public boolean validate(LoginU loginU) throws ClassNotFoundException {
        Conexion conexion=new Conexion();
        Class.forName("com.mysql.jdbc.Driver");
        boolean status=false;
        Connection con;
        try {
            String user=loginU.getUser();
            String pass=loginU.getPassword();
            con= conexion.getCon();
            PreparedStatement ps;
            ps=con.prepareStatement("select * from employ where usuario=? and contrasena=?");
            ps.setString(1,user);
            ps.setString(2,pass);
            ResultSet rs;
            rs=ps.executeQuery();
            status=rs.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return status;
    }
}

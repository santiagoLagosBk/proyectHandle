package javaguide.registration.dao;

import Config.Conexion;
import javaguide.registration.model.Employ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmplyDao {


        public int  registerEmploy(Employ employ){
            Conexion conexion=new Conexion();
            Connection con;

            int status=0;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con=conexion.getCon();
                PreparedStatement ps;

                ps=con.prepareStatement("INSERT into employ (id_empleado,nombre,apellido,usuario,contrasena,documento) values (?,?,?,?,?,?)");
                ps.setString(1,null);
                ps.setString(2,employ.getName());
                ps.setString(3,employ.getLastName());
                ps.setString(4,employ.getUser());
                ps.setString(5,employ.getPassword());
                ps.setString(6,employ.getDocumento());

                status=ps.executeUpdate();

            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }


            return status;
        }




}

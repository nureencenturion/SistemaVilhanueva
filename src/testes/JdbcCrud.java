/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author u71744222177
 */
public class JdbcCrud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user="marcos_vilhanueva";
            password="marcos_vilhanueva";
//            url="jdbc://mysql/localhost/db_nureen_centurion";
//            user="nureen_centurion";
//            password="nureen_centurion";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password); 
            //110
            //Statement stm = cnt.createStatement();
            //stm.executeUpdate("insert into mpv_usuarios (mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf ) values(110, 'nureen', 'nuri', '781.788.645-56')");
            
            PreparedStatement pst = cnt.prepareStatement("insert into mpv_usuarios (mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf ) values(?, ?, ?, ?)");
            pst.setInt(1,210);        
            pst.setString(2, "Nureen teste");
            pst.setString(3, "Nurii teste");
            pst.setString(4, "4759387498");
            pst.executeUpdate();
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("rodou");
    }
}

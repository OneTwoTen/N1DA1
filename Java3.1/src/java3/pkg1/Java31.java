/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3.pkg1;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author caodo
 */
public class Java31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var server = "DESKTOP-A3UGK24\\SQLEXPRESS";
        var user = "sa";
        var password = "123";
        var db = "polypro";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try (Connection cn = ds.getConnection()){
            System.out.println("ket not thanh cong");
            System.out.println(cn.getCatalog());
        }catch(SQLException e){
            
        }
    }
    
}

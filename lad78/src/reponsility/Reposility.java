/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reponsility;

import java.sql.Connection;
import connection.DBcontext;
import untity.UntityLogin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLEngine;

/**
 *
 * @author Nguyen Cam
 */
public class Reposility {

    public boolean addrow(UntityLogin lg) {
        String query = "insert into dangki values(?,?,?)";
        int check = 0;
        try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, lg.getUsername());
            ps.setObject(2, lg.getPassword());
            ps.setObject(3, lg.getEmail());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean checktk(UntityLogin lg) {
        String query = "select*from dangki where username=? and pass=?";
        int check = 0;
        try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, lg.getUsername());
            ps.setObject(2, lg.getPassword());
            ps.setObject(3, lg.getEmail());
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check > 0;
    }

    public boolean update(String id) throws SQLException {
        String delete = "update dangki" + "  set pass=12345678" + "  where username=?";
        int check = 0;
        try ( Connection con = DBcontext.getConnection();  PreparedStatement ps = con.prepareStatement(delete)) {
            ps.setString(1, id);
            ps.executeUpdate();
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check > 0;
    }
}

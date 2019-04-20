package PROJECT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author SANTOSH
 */
public class User {

    String username;
    char[] password;
    int flag;

    public int login(String usr, char[] psw) {
        flag = 0;
        PreparedStatement pstmt = null;
        try {
            pstmt = MyLogin.con.prepareStatement("select * from USER where USER_NAME = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pstmt.setString(1, usr);
            ResultSet rs = pstmt.executeQuery();
            pstmt.clearParameters();
            if (rs.next()) {
                username = rs.getString("USER_NAME");
                password = rs.getString("PASSWORD").toCharArray();
            }
            if (usr.equals(username) && Arrays.equals(psw, password)) {
                flag = 1;
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            System.out.println("Problem inside login method " + e);
        }
        return flag;
    }
}

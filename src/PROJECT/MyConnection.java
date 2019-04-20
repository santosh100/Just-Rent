package PROJECT;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SANTOSH
 */
public class MyConnection {

    Connection con = null;

    public Connection connectMe() {
        try {
            return DriverManager.getConnection("jdbc:ucanaccess://.\\test\\ROOM_RENT_MANAGEMENT.accdb");
        } catch (Exception ex) {
            System.out.println("sorry");
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
}

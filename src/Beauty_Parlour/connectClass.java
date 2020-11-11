package Beauty_Parlour;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connectClass {
    static Connection con;
    public static Connection ConnectDb()
    {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
             con=DriverManager.getConnection("jdbc:oracle:thin:@Huzzu-PC:1521:xe","huzzu","huzaifa");
             //JOptionPane.showMessageDialog(null, "Connectin Established");
             return con;
                    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}

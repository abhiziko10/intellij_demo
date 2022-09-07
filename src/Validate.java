import java.sql.*;

public class Validate {
    public static boolean checkUser(String username,String password)
    {
        boolean status =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.jdbc.Driver");

            //creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Verification","root",
                    "qwerty123@#");
            PreparedStatement ps = con.prepareStatement("select * from user where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            status = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
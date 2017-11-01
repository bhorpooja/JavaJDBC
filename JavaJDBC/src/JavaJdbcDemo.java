import java.sql.*;
/**
 * Created by pooja on 21/8/17.
 */

public class JavaJdbcDemo {
    public static void main(String[] args)  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "pooja");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Student;");
            while (rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            st.close();
            con.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}

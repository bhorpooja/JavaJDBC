/**
 * Created by pooja on 23/8/17.
 */
import java.sql.*;

/**
 * Created by raj on 14/7/17.
 */
public class JDBCToday {
    Connection con=null;
    Statement st=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    JDBCToday() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","pooja");

    }
    void Select() throws SQLException {
        String query="select * from Student;";
        st=con.createStatement();
        rs=st.executeQuery(query);

        while (rs.next())
            System.out.println(rs.getInt(1)+":"+rs.getString(2));


    }
   void  Insert(){
        try {
            int id=4;
            String name="Vijay";
            PreparedStatement stmt=con.prepareStatement("insert into Student values(?,?);");
           stmt.setInt(1,3);
           stmt.setString(2,"Sunita");
           stmt.executeUpdate();
           stmt.setInt(1,id);
           stmt.setString(2,name);
           int cnt=stmt.executeUpdate();
            System.out.println(cnt+"rows affected");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCToday jd=new JDBCToday();
        jd.Select();
        jd.Insert();
    }
}

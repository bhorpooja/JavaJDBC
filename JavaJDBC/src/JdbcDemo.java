import java.sql.*;

/**
 * Created by pooja on 1/11/17.
 */
public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root", "pooja");
            Statement st=con.createStatement();

            //create table command
//            String sql="create table Batch(id int(10),name varchar(20),city varchar(20))";
//            st.execute(sql);
//            System.out.println("Table created successfully");


            //select table command
//            ResultSet rs=st.executeQuery("select * from Batch;");
//            while (rs.next()){
//                System.out.println(" "+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//            }
//            System.out.println("Data fetch Successfully");


            //alter table command
            String sql="alter table Batch add(dept varchar(20));";
            st.execute(sql);
            System.out.println("Table alter successfully");
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

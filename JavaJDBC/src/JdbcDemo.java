import java.sql.*;

/**
 * Created by pooja on 1/11/17.
 */
public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root", "pooja");


            //create table command
//            Statement st=con.createStatement();
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
//            String sql="alter table Batch add(dept varchar(20));";
//            st.execute(sql);
//            System.out.println("Table alter successfully");


            //insert command
//            PreparedStatement ps=con.prepareStatement("insert into Batch values(?,?,?);");
//            ps.setInt(1,4);
//            ps.setString(2,"Sonal");
//            ps.setString(3,"Nagpur");
////            ps.setString(4,"Comp");
////            ps.setFloat(5,67.23f);
//            int count=ps.executeUpdate();
//            System.out.println(count+" Row inserted successfully");

            //update table
//            Statement st=con.createStatement();
//            String sql="update Batch set dept='E&TC', percentage=79.56 where name='pooja';";
//            st.execute(sql);
//            System.out.println("row updated successfully");

            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

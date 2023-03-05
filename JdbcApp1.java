package jdbcexamples;
import java.sql.*;
class JdbcApp1 

  {
    public static void main (String [] args)
     {
       try
         {
           Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver loaded successfully");
            Connection conn=DriverManager.getConnection
                      ("jdbc:oracle:thin:       @//RAKESH:1521/xe","advancejava","rakesh");
            System.out.println("Connection opened successfully");
            Statement st= conn.createStatement();
            ResultSet rs=st.executeQuery("Select ename,sal from emp");
            while(rs.next())
                {
                 String name=rs.getString(1);
                 int sal=rs.getInt(2);
                 System.out.println(name +"\t "+sal);
                }
            conn.close();
              }
           catch(ClassNotFoundException cnfc)
                   {
                     System.out.println("Cannot load the driver class ");
                   }
           catch(SQLException ex)
                  {
                    System.out.println("Error in DB");
                    ex.printStackTrace();
                  }
              }
      }
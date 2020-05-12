//STEP 1. Import required packages
import java.sql.*;

public class createJDBC{
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS?useSSL=false";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "samdav1997@";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
  //STEP 4: Execute a query
System.out.println("Creating statement...");
      stmt = conn.createStatement();
    
String sql = "UPDATE personalDetails " +
                   "SET age = 46 WHERE id in (3)";
      stmt.executeUpdate(sql);

      // Now you can extract all the records
      // to see the updated records
      sql = "SELECT id, first, last, age FROM personalDetails";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("id");
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", last: " + last);
      }
      rs.close();
     /* System.out.println("inserting row  in given database...");
      stmt = conn.createStatement();*/
     /*  System.out.println("Creating table in given database...");
      stmt = conn.createStatement();    */
  
/*
String sql = "INSERT INTO personalDetails " +
                   "VALUES (1, 'peter', 'red', 18)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO personalDetails " +
                   "VALUES (2, 'david', 'blue', 25)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO personalDetails  " +
                   "VALUES (3, 'jp', 'yellow', 30)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO personalDetails  " +
                   "VALUES(4, 'sam', 'black', 28)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");   */
/*
     String sql = "CREATE TABLE personalDetails " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 
     */

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
        


   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample

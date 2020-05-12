//jdbc final demo 

// in this we are going to create menu based student table management


public class JdbcMain{

public static void main(String [] arg){
Menu m = new Menu();
m.showMenu();

   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";


   static final String USER = "root";
   static final String PASS = "samdav1997@";
   

}
}


class Menu{

int choice;
Scanner sc;

public void showMenu(){

Student s= new Student();

sc= new Scanner(System.in);

System.out.println("Enter your choice");

System.out.println("1. Display All Student Details");
System.out.println("2. Display a Student Detail");
System.out.println("3. Update a Student Detail");
System.out.println("4. Delete a Student Detail");
System.out.println("5. Insert a Student Detail");
System.out.println("6. Exit");

choice=sc.nextInt();

	switch(choice)
	{

	case 1 : s.DisplayAllStudents();
                 break;
        case 2 : s.displayStudentDetail();
                 break;
        case 3 : s.updateStudentDetail();
                 break;
	case 4 : s.deleteStudentdetail();
                 break;
        case 5 : s.insertStudentDetails();
                 break;
        case 6 : s.exit();
                 break;
        }


}

}


class Student{

int id;
String fname;
String lname;
int age;

public void DatabaseConnection(){

System.out.println("Database connection method to be written");
 // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   

   Connection conn = null;
   Statement stmt = null;
  
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");


}


public void acceptStudent(){
//write code here to accept and insert the details to database
System.out.println("accepting student details method");
  System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO Registration " +
                   "VALUES (100, 'Zara', 'Ali', 18)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES (102, 'Zaid', 'Khan', 30)";
      stmt.executeUpdate(sql);
      sql = "INSERT INTO Registration " +
                   "VALUES(103, 'Sumit', 'Mittal', 28)";
      stmt.executeUpdate(sql);
      System.out.println("Inserted records into the table...");


public void displayAllStudents(){

System.out.println("Database connection method to be written");
 System.out.println("Creating statement...");
      stmt = conn.createStatement();

      String sql = "SELECT id, first, last, age FROM Registration";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
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
         System.out.println(", Last: " + last);
      }
      rs.close();
}
/*
public void displayStudentDetails(int sid){

I am not going to live without you.  Raju had asked me to come to his  house.. i told him that  Sam will  be there with me  only till he gets married..  i dont want to miss any days in between.. he got  furious.  You  alone is important for me.. but i will not trouble you for ever.. few more days only. 

}

public void updateStudentDetails(int sid){
 System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "UPDATE Registration " +
                   "SET age =  (sid)";
      stmt.executeUpdate(sql);

}

public void deleteStudentDetails(int sid){
}



}

*/



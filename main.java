// creating more than one class 


import java.util.Scanner;
class address
{
int houseno;
String streetname;
String city;
String state;
int pin;
Scanner input=new Scanner(System.in);


public void accept()
{
System.out.println("enter the house no");
houseno=input.nextInt();

System.out.println("enter the street name");
streetname=input.next();

System.out.println("enter the city");
city=input.next();


System.out.println("enter the state");
state=input.next();


System.out.println("enter the pin");
 pin=input.nextInt();
}

public void display()
{
System.out.println("the house no. is"+houseno);
System.out.println("the street name is"+streetname);
System.out.println("the city is"+city);
System.out.println("the state is"+state);
System.out.println("the pin is"+pin);
}
}

class personalDetails
{
String name;
address Address;  // example of abstract/user defined data type
String dob;
String gender;
Scanner input=new Scanner(System.in);
public personalDetails()
{
Address=new address();
}

public void accept()
{
//System.out.println("enter the name");
//name=input.next();
//System.out.println("enter the address");
//address=input.nextInt();

Address.accept();// example of utilisation relationship
//System.out.println("enter the dob");
//dob=input.next();
//System.out.println("enter the gender");
//gender=input.next();
}

public void display()
{
//System.out.println("the name is"+name);
//System.out.println("the address is"+address);
//Address=new address();
Address.display();
//System.out.println("the dob is"+dob);
//System.out.println("the gender is"+gender);
}
}

class student extends personalDetails
{
int id;
String schoolname;
float marks;
String faculty;
Scanner input=new Scanner(System.in);

public void accept()// example of overridding (because accept method is in both parent and child)
{
super.accept();
System.out.println("enter the id");
id=input.nextInt();
System.out.println("enter the schoolname");
schoolname=input.next();
System.out.println("enter the marks");
marks=input.nextFloat();
System.out.println("enter the faculty");
faculty=input.next();
}

public void displayDetails()

{
display();// calling parent class
System.out.println("the id is"+id);
System.out.println("the schoolname is"+schoolname);
System.out.println("the marks is"+marks);
System.out.println("the faculty is"+faculty);
}
}

class customer extends personalDetails
{
int custid;
String typeofcustomer;
float creditpoints;
Scanner input=new Scanner(System.in);

public void accept()
{
super.accept();
/*System.out.println("enter the custid");
custid=input.nextInt();
System.out.println("enter the typeofcustomer");
typeofcustomer =input.next();
System.out.println("enter the creditpoints");
creditpoints=input.nextFloat();*/
}

public void displayDetails()

{
display();
/*System.out.println("the custid is"+custid);
System.out.println("the typeofcustomer is"+typeofcustomer);
System.out.println("the creditpoints is"+creditpoints);*/
}
}

class employee extends personalDetails
{
int employeeid;
float salary;
int experience;
Scanner input=new Scanner(System.in);

public void acceptDetails()
{
accept();// calling parent details
System.out.println("enter the employeeid");
employeeid=input.nextInt();
System.out.println("enter the salary");
salary=input.nextFloat();
System.out.println("enter the experience");
experience=input.nextInt();
}

public void display()

{
super.display();
System.out.println("the employeeid"+employeeid);
System.out.println("the salary is"+salary);
System.out.println("the experience"+experience);
}
}
public class main
{
public static void main(String [] ar)
{
System.out.println("working with customer");
customer c=new customer();
c.accept();
c.displayDetails();
/*System.out.println("working with student");
student s=new student();
s.accept();
s.displayDetails();
System.out.println("working with employee");
employee e=new employee();
e.acceptDetails();
e.display();*/



}
}





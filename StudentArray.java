// write a program to accept 3 student details and display  them

import java.util.Scanner;
class Student{

String sname;
int rollno;
float marks;
Scanner input;

// Constructor is a special method that gets evoked when you create an object
// Constructor name is always the name of class  .. for example class student has contructor student()
// consutructor do not have any return type;

//Writing a constructor

	public Student() // constructors are used to initialize member variables
	{
		System.out.println("I am Student's constructor");
		sname=null;
		rollno=0;
		marks=0;
		input =  new Scanner(System.in);
	}

       public Student(int roll, String n, float m)
	{
	  rollno=roll;
	  sname= n;
          marks = m;
	}



	public void acceptStudentDetails()
	{
		System.out.println("Enter sname");
		sname=input.next();
		System.out.println("Enter rollno ");
		rollno= input.nextInt();
		System.out.println("Enter marks ");
		marks = input.nextFloat();
	}

//Displaying details


	public void displayStudentDetails()
	{
	System.out.format("The rollno %d name is %s has scored %f ", rollno,sname,marks);
	}



}

public class StudentArray
{
public static void main(String [] args)
{
/*Student s= new Student(); // to create an object of student class
s.acceptStudentDetails();
s.displayStudentDetails();

Student s1 = new Student();
s1.acceptStudentDetails();
s1.displayStudentDetails();

Student s2 = new Student();
s2.acceptStudentDetails();
s2.displayStudentDetails();*/

Student sobj[] = new Student[3]; // declaring an array of size 3 to hold Student type objects
for(int i=0; i<3; i++)
    sobj[i]=new Student(); // memory allocation



for(int i=0; i<3; i++)
{
sobj[i].acceptStudentDetails();
sobj[i].displayStudentDetails();
}




}

}


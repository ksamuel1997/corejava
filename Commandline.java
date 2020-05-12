// this program helps to  take input from command line
import java.util.Scanner;

public class Commandline
{

public static void main(String [] ar) //command line arguments reffered as argv argc
{
//System.out.println(" Welcome " + ar[0]);

//System.out.println(ar[1] + ar [2]);

// to convert a string to an interger use Interger.ParseInt

//System.out.println(Integer.parseInt(ar[1]) + Integer.parseInt(ar[2]));

// The below code helps to get details from the commandline

//declaring two variables  to store name and age of a person
String name;
int age;
Scanner sc=  new Scanner(System.in); // to accept keyboard input you should  use Scanner class from  java.util package
//to accept the name 
/*System.out.println("Enter your name");

name=sc.nextLine();  // reads the name from keyboard
System.out.println(" hi "+name);
System.out.println("Enter your age");
age = sc.nextInt(); // reads the age from keyboard
System.out.println(" your age is "+ age);

if(age >=18)
System.out.println("hi " + name+ "you are eligible to vote as your age is "+ age);
else
System.out.println("hi " + name+ "you are NOT eligible to vote as your age is "+ age); */

int month;
System.out.println("Enter the month number");
month=sc.nextInt();

if(month>12 || month < 1)
System.out.println("Invalid month");
else if(month ==1)
System.out.println("January");
else if(month == 2)
System.out.println("February");
else
System.out.println("December");

//switch case 

switch(month){
case 1: System.out.println("Janurary");
	break;
case 2: System.out.println("February");
	break;
case 3: System.out.println("March");
	break;
case 4: System.out.println("April");
	break;
case 5: System.out.println("May");
	break;
case 6: System.out.println("June");
	break;
default: 
	System.out.println("Invalid Month");
  
  }
}


}

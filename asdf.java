import java.util.Scanner;

/*
public class asdf{

public static void main(String [] ar){

System.out.println("Hi .. ");
try{
System.out.println(ar[0]); // command line argument
}
catch(Exception e)
{
System.out.println("Exception occured" + e);
}
System.out.println(" Good evening");

Scanner input = new Scanner(System.in);
System.out.println("Enter a number ");
int num = input.nextInt();


System.out.format("The number entered is %d ",num);
try{
System.out.println("The result of 50 devided by number entered is "+ (50/num));
} // you should not write any  lines of  code between try and catch
catch(Exception e){
System.out.println("hi.. something went wrong..result can not be published.. try once again");
//System.out.println(e);
}
System.out.println("Thank you");
}

}*/

class podavenna extends Exception
{
public String toString()
{
 return(" Dai.. mark olunga poduda.. ");
}

}

public class asdf
{
public static void main(String ar[])
{

try{

Scanner input = new Scanner(System.in);
System.out.println("Enter a number ");
int num = input.nextInt();
System.out.println("Hi .. ");
System.out.println(ar[0]); // command line argument
System.out.println("Good Evening");
System.out.format("The number entered is %d ",num);
System.out.println("The result of 50 devided by number entered is "+ (50/num));

System.out.println("Enter your marks");
int marks=input.nextInt();
if(marks < 0 || marks >100)
{
throw new podavenna();
}

System.out.println("Thank you");
}
catch(ArithmeticException ae)
{
System.out.println("Do not type 0 as input for number");
}
catch(ArrayIndexOutOfBoundsException aie)
{
System.out.println( "When  executing pls pass name .. example  java asdf john");
}
catch(Exception e){
System.out.println("Exception occured " +e);
}
finally
{
System.out.println("at last.. i am ending.. ");
}


}

}


/*

There is one throwable class

Error and exception are children of throwable

Error  -  comes in compile time [ javac filename.java]

exception - comes occationally.. sometime yes some times no



Exceptions can be handled using try and catch block

*/

// Array program.. to accept 5 numbers and show it sum and average

import java.util.Scanner;

public class arrayEx1
{

	public static void main(String []ar){
	
	int num[] = new int[5];
	int sum, avg;
	
	Scanner sc= new Scanner(System.in);
	sum=0;
	// to accept values into array
	for(int i =0; i<5; i++)
	{
		System.out.println("Enter the marks for subject  "+ (i+1));
		num[i] = sc.nextInt();
	}

	// To display the marks accepted
	for(int i=0; i< 5; i++)
	{
		System.out.println("Marks of subject  " + (i+1) + "  is " + num[i]);
		sum=sum+num[i];
	}
          System.out.println("Total marks is " + sum);
	  //avg=sum/5;
	   avg= sum / num.length;
	  System.out.println("Average is "+ avg);
	}

}

// to practice more https://www.w3resource.com/java-exercises/array/index.php

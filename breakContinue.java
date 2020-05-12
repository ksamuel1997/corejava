// accept 3 even numbers and find the average

// this is an example of break and continue statments
import java.util.Scanner;

public class breakContinue
{
	public static void  main(String ar[]){

	int evennum[] = new int[3]; // to accept 3 numbers
        int num, ctr;
	ctr=0;
	Scanner sc= new Scanner(System.in);

       			
             while(ctr < 3)
		{
		System.out.println("Enter "+ ctr+1 +" number .. it should be even number ");
		 num=sc.nextInt();
		 if(num % 2== 0)
		   {
			evennum[ctr]= num;
			ctr++;
			
				
		   }
		   else {
			continue ;
			}	
		}

	for(int i = 0; i< 3; i++)
	    System.out.println(" The numbe is " + evennum[i]);
	}

}








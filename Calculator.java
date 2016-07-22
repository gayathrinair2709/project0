import java.util.Scanner;
public class Calculator
{
  public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	int input,x,y,output;
	System.out.println("\t\tCALCULATOR");
	System.out.println("\tList of Operation");
	System.out.println("\t1.Add\n\t2.Subtract\n\t3.Multiply\n\t4.Division\n\t5.Take remainder");
	System.out.println("Enter your option");
	input=in.nextInt();

	
  
  switch(input)
  	{
	      
     	case 1: System.out.println("Enter two numbers");
	          x=in.nextInt();
	          y=in.nextInt();
	
                          output=x+y;
              	           System.out.println("The sum is:"+output);break;
	case 2: System.out.println("Enter two numbers");
	          x=in.nextInt();
	          y=in.nextInt();
	
                          output=x-y;
 	           System.out.println("The Difference is:"+output);break;
	case 3: System.out.println("Enter two numbers");
	          x=in.nextInt();
	          y=in.nextInt();
	
                           output=x*y;
                          System.out.println("The product is:"+output);break;
	case 4: System.out.println("Enter two numbers");
	          x=in.nextInt();
	          y=in.nextInt();
	
                          output=x/y;
                          System.out.println("The quotient is:"+output);break;
	case 5: System.out.println("Enter two numbers");
	          x=in.nextInt();
	          y=in.nextInt();
	
                          output=x%y;
                          System.out.println("The remainder is:"+output);break;
	default:System.out.println("Invalid entry!!!");break;
	}
              }
}




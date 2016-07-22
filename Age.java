import java.util.Scanner;
public class Age
{ 
public static void main(String args[])
{int age;
Scanner in=new Scanner(System.in);
System.out.println("enter the age:");
age=in.nextInt();
System.out.println("The age:"+age);
if(age>0)
{
if(age>16)
{System.out.println("WELCOME");
}
else{System.out.println("TOO YOUNG");
}
}
else
System.out.println("error");
}}
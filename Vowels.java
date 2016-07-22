import java.util.Scanner;
public class Vowels
{
public static void main(String args[])
{
char a;
Scanner in= new Scanner(System.in);
System.out.println("enter a character:");
a=in.nextLine().charAt(0);
switch(a)
{ case 'a':
case 'e':
case 'i':
case 'o':
case 'u':System.out.println("the character is a vowel");break;
default:System.out.println("not a vowel");
}
}
}
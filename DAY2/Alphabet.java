import java.util.Scanner;
class Alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("enter ch value");
ch=sc.next().charAt(0);
if(ch >= 'a' &&  ch <= 'z' || ch >= 'A' &&  ch <= 'Z')
{
System.out.println("x is alphabet");
}
else
{
System.out.println("x is not a alphabet");
}
}
}
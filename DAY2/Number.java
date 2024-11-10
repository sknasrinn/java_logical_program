import java.util.Scanner;
class Number{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("Enter any number");
n=s.nextInt();
if(n<0)
{
System.out.println("Given number is negative");
}
else if(n>0)
{
System.out.println("Given number is positive");
}
else if(n==0)
{
System.out.println("Given number is zero");
}
else
{
System.out.println("invalid input");
}
}
}


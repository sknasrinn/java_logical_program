import java.util.Scanner;
class Divisible{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int num;
System.out.println("Enter a number");
num=s.nextInt();
if(num%5==0 && num%11==0)
System.out.println("Given number is divisible by 5 and 11");
else
System.out.println("Given number is not divisible by 5 and 11");
}
}

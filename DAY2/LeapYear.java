import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int year;
System.out.println("Enter any year");
year=s.nextInt();
if((year%4==0 && year%100!=0)||(year%400==0))
System.out.println("Given year is leap year");
else 
System.out.println("Given year is not a leap year");
}
}
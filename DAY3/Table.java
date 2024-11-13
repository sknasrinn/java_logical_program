import java.util.Scanner;
class Table{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=1,n,m;
System.out.println("Enter n value");
n=s.nextInt();
for(i=1;i<=10;i++)
{
m=i*n;
System.out.println(n+"*"+i+"="+m);
}
}
}
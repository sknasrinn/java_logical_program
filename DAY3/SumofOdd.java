import java.util.Scanner;
class SumofOdd{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i=1,n,sum=0;
System.out.println("Enter n value");
n=s.nextInt();
while(i<=n)
{
if(i%2!=0)
{
sum=sum+i;
}
i++;
}
System.out.println(sum);
}
}
import java.util.Scanner;
public class Primetest
{
public static void main(String[] args)
{
 int num,i;
 Scanner sc= new Scanner(System.in);

 System.out.print("Enter a number:");
 num=sc.nextInt();
 
 for(i=2;i<num;i++)
{
 if(num%i==0)
{ 
 System.out.println("it is a prime number");
 break;
}
 if(num%i!=0)
{
 
 System.out.println("it is not  a prime number");
 break;
}
}
}
}

 
 

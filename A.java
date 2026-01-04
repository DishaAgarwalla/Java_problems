import java.util.Scanner;

class A
{
public static void main(String[] args)
{
int num, i,j;
 Scanner sc= new Scanner(System.in); 
    
 System.out.print("Enter a Number:");
 num = sc.nextInt();   
   
for(i=1; i<100; i++)
{
 for(j=2;j<i;i++)
{
 if(i%j != 0)
{
System.out.println(i);
break;
}

}

}      

}

}

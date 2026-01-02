import java.util.Scanner;
class Celsius
{
public double celcius(double c)
{
return (c*9/5)+32 ;
}
}
class B1
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a farenite");
double r = sc.nextDouble();
Test t1 = new Test();
double d =t1.celcius(r) ;
System.out.println("farenhite to celcius "+d);
}
}
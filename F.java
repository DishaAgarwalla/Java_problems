import java.util.Scanner;
class F
{
public double far(double c)
{
return (c-32)*5/9;
}
}
class B2
{ 
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the celcius ");
double v = sc.nextDouble();
F b1 = new F();
double d = b1.far(v);
System.out.println("celcius to farenhite"+d);
}

}

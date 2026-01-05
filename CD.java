class AB
{
void xyz()
{
System.out.println("hi");
}
void disp()
{
this.xyz();
System.out.println("hello");
}
}
 class CD
{
public static void main(String [] args)
{
AB p= new AB();
p.disp();
}

}

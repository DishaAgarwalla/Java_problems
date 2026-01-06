class Xyz
{
int n;
Xyz()
{
n=0;
}
Xyz(int x)
{
n=x;
}
Xyz(Xyz p)
{
n=p.n;
Void show()
{
System.out.println(n);
}
}
class pqr
{
public static void main(String []args)
{
Xyz k=new Xyz();
Xyz m=new Xyz(100);
Xyz z=new Xyz(m);
 m=show();
 z=show();
}
}

}

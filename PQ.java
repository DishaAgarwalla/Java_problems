class xyz
{
protected  int x,y;
void getdata()
{
x=50;
y=30;
}
void show()
{
System.out.println(x+" "+y);
}
}
class PQ
{
public static void main(String []args)
{
xyz p=new xyz();
p.getdata();
p.show();
System.out.println(p.x);
}

}


class xyz 
	{
		void sum(int x, int y)
		{
			int add = x+y;
			System.out.println("Sum = " + add);
		}
	void sum (int a, int b, int c)
	{
		int multi  = a*b*c;
		System.out.println("Multiplication= " + multi);
		}
		void print()
		{
			System.out.println("Hello sir !!" );
		}
	}
class pqr extends xyz
	{
		void print()
		{
			super.print();
			System.out.println("Good afternoon " );
		}
	}
class over 
	{
		public static void main(String args[])
			{
				pqr p = new pqr();
				p.sum( 2, 10);
				p.sum(3,3,7);
				p.print();
			}
	}
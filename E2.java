
class E2
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark = sc.nextInt();
		switch(mark/10)
		{
			case 1:
				System.out.println("F");
				
				break;
			case 2:
				System.out.println("F");
				
				break;
			case 3 :
				System.out.println("F");
				
				break;
			case 4 :
				System.out.println("F");
				
				break;
			case 5 :
				System.out.println("D");
				break;
			case 6 :
				System.out.println("C");
				break;
			case 7 :
				System.out.println("B");
				break;
			case 8:
				System.out.println("A");
				break;
			case 9:
			       System.out.println("E");
				break;
			case 10 :
				System.out.println("O");
				break ;
			default :
				System.out.println("Enter valid mark");
			
		}
	}
}
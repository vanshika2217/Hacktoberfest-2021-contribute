import java.util.Scanner;

class remainder
{
	static int cal(int x, int y) 
	{
		int s=x%y;
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for (int i= 0;i< T;i++)
			{
			int x= sc.nextInt();
			int y= sc.nextInt();
			int k=cal(x,y);
			System.out.println(k);
		}
	}
}

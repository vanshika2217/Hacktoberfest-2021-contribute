import java.util.*;
class largest
{
    static int find(int a, int b, int c)
	{
        if(a>b && a>c)
		{
            if(b>c)
			{
                return b;
            }else
			{
                return c;
            }
        }
		else
		{
            if(b>a && b>c)
			{
                if(a>c)
				{
                    return a;
                }else
				{
                    return c;
                }
            }
			else
			{
                if(a>b)
				{
                    return a;
                }
				else
				{
                    return b;
                }
            }
        }
    }
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int result=find(a,b,c);
		    System.out.println(result);
		}
	}
}

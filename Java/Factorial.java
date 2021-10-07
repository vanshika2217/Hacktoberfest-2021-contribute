import java.util.*;

class Factorial {

    protected static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n*(n-1);
    }

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		int t = sc.nextInt();
		int n;

		for(int i = 0; i < t; i++){
		    n = sc.nextInt();

            int fac = factorial(n);

            System.out.println(fac);
		}
	}
}

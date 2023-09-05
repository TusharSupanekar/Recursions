package recursions;

public class Fibonacci {
	//recursive approach
	public static int fibonacci(int n) {
		if(n==1||n==2) {
			return 1;
		}
		//method 1
//		int fib1=fibonacciUsingRecursion(n-1);
//		int fib2=fibonacciUsingRecursion(n-2);
//		return fib1+fib2;
		
		//method 2
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(13));
	}
	
	

	//iterative approach
//	public static void main(String[] args) {
//		int n=9;
//		int x=0;
//		int y=1;
//		int res=0;
//		while(res<=n) {
//			System.out.print(res+" ");
//			x=y;
//			y=res;
//			res=x+y;
//		}
//	}

}

package recursions;

public class FactorialByRecursions {
	public static int fact(int n) {
		if(n==1) {
			return n;
		}
		int small =fact(n-1);
		int result=small*n;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}

package recursions;

public class NaturalNumberByRecursions {
	public static void printNaturalNumbers(int n) {
		if(n==0) {
			return;
		}
		printNaturalNumbers(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		printNaturalNumbers(5);
	}
}

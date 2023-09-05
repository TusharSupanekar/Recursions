package recursions;

public class power {
	public static int powerRecursive(int n, int p) {
		//base case
		if(p==0) {
			return 1;
		}
		int x=powerRecursive(n, p-1);
		int res=x*n;
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(powerRecursive(4,5));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static int powerUsingRecursion(int n,int p) {
//		if(p==1) {
//			return n;
//		}
//		int pro=powerUsingRecursion(n, p-1);
//		int res=n*pro;
//		return res;
//	}
//	public static void main(String[] args) {
//		int n=5;
//		int p=4;
//		System.out.println(powerUsingRecursion(n, p));
//	}
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		int n=5;
//		int p=4;
//		int pro=1;
//		for(int i=1;i<=p;i++) {
//			pro=pro*n;
//		}
//		System.out.println(pro);
//	}

}

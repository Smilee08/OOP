package exp;

public class factorial {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			return (n*fact(n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5,i,factorial=1;
		System.out.println("Entered number:"+num);
		factorial=fact(num);
		
		System.out.println("Factorial of "+num+" is " +factorial);
	}

}

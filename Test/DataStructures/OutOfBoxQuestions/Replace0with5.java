package OutOfBoxQuestions;

public class Replace0with5 {
	
	static int replace0with5Rec(int n) {
		
		if (n==0)
			return 0;

		int digit = n % 10;
		
		if(digit == 0)
			digit =5;
		
		return replace0with5Rec(n/10)*10 + digit;
		
	}
	
	static int replace0with5(int n) {
		
		if(n == 0)
			return 5;
		
		else
			return replace0with5Rec(n);
	}

	public static void main(String[] args) {
		int n = 1000;
		int result = replace0with5(n);
		System.out.println(result);

	}

}

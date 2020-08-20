package arrayPractice;

public class PrintPrime {

	static boolean isNotInteger(String str) {

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == '-' || ch[i] == 'f' || ch[i] == '.') {

				return true;

			}

		}
		return false;

	}

	static boolean isStringisInteger(String str) {

		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {

				return true;
			}

		}

		return false;
	}

	static void Prime(String str) {

		if (isNotInteger(str)) {

			System.out.println("Number is not a prime");
		} else {

			int num = Integer.parseInt(str);

			boolean isPrime = false;
			for (int i = 2; i <= num / 2; i++) {

				if (num % 2 == 0) {

					isPrime = true;
					break;
				}
			}
			if (!isPrime) {

				System.out.println(num + " :is Prime Number");
			} else {

				System.out.println(num + " :is Not a Prime Number");
			}
		}
	}

	public static void main(String[] args) {

		String str = "1";
		String str1 = "1";
		String str2 = "0";
		
		if (isNotInteger(str)) {

			System.out.println("Number is not a prime");
		} else if (isStringisInteger(str)) {

			Prime(str);

		} else if (str.equals(str1) && str.equals(str2)) {
				
				System.out.println("Number is not a prime");
			}

	}

}

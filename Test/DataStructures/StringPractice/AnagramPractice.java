package StringPractice;

import java.util.Arrays;

public class AnagramPractice {

	public static boolean isAnagram(char[] a, char[] b) {

		if (a.length != b.length)
			return false;

		Arrays.sort(a);
		Arrays.sort(b);

		for (int i = 0; i < a.length; i++)

			if (a[i] != b[i])
				return false;

		return true;

	}

	public static void main(String[] args) {

		String str1 = "tea";
		String str2 = "ate";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(isAnagram(ch1, ch2)) {
			
			System.out.println("anagram");
		
		}else {
			System.out.println("not an anagram");
		}

	}

}

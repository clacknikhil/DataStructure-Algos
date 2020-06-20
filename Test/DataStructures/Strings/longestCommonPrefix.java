package Strings;

public class longestCommonPrefix {

	public String longestPrefix(String[] str) {

		//String[] str = { "flower", "flight", "flood" };
		String pre = "";

		if (str == null || str.length == 0) {
			return pre;

		}
		int index = 0;
		char[] ch = str[0].toCharArray();

		for (char c : ch) {
			for (int i = 0; i < str.length; i++) {

				if (index >= str.length || c != str[i].charAt(index)) {

					return pre;

				}

			}

			pre += c;
			index++;

		}

		return pre;

	}
	
	public static void main(String[] args) {
		String[] str = { "flower", "flight", "flood" };
		longestCommonPrefix fd = new longestCommonPrefix();
		String find =fd.longestPrefix(str);
		System.out.println(find);
		
		
		
	}

}

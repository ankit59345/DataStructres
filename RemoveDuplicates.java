import java.util.Scanner;

public class RemoveDuplicates {
	
	public static String Remove(String str, int i, String nStr) {
		if(i >= str.length()) {
			return nStr;
		}
		if(i == str.length()-1 && str.length() > 1) {
			if(str.charAt(i) != str.charAt(i-1)) {
				nStr = nStr + str.charAt(i);
			}
		}
		else {
			if(i == 0 && str.length() > 1) {
				if(str.charAt(i) != str.charAt(i+1)) {
					nStr = nStr + str.charAt(i);
				}
			}
			else {
				if(str.length() > 1) {
					if(str.charAt(i)!=str.charAt(i+1) && str.charAt(i)!=str.charAt(i-1)) {
						nStr = nStr + str.charAt(i);
					}
				}
				else {
					nStr = nStr + str.charAt(i);
				}
			}
		}
		return Remove(str, i+1, nStr);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int tCase = in.nextInt();
		while(tCase > 0) {
			System.out.println("Enter the String");
			String str = in.next();
			String nStr = new String();
			nStr = Remove(str, 0, nStr);
			System.out.println(nStr);
			tCase--;
		}
	}
}

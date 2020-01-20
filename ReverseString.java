import java.util.Scanner;
public class ReverseString {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int tCase = in.nextInt();
		while(tCase > 0) {
			System.out.println("Enter the String to reverse");
			String st = in.next();
			String[] stArr = st.split("\\.");
			String nst = new String();
			for(int i=stArr.length-1; i>0; i--) {
				nst = nst+stArr[i]+".";
			}
			nst = nst + stArr[0];
			System.out.println(nst);
			tCase--;
		}
	}
}

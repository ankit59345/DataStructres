import java.util.Scanner;
import java.util.Stack;

public class MinStack {
	
	public static int findMin(Stack<Integer> st) {
		int x = st.size()-1;
		int min = st.peek();
		while(x >= 0) {
			if(st.get(x) < min) {
				min = st.get(x);
			}
			x--;
		}
		return min;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements of Stack");
		int n = in.nextInt();
		Stack<Integer> st = new Stack<>();
		System.out.println("Enter the elements of Stack");
		for(int i=0; i<n; i++) {
			st.push(in.nextInt());
		}
		System.out.println(findMin(st));
		in.close();
	}
}

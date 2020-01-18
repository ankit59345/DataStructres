import java.util.Arrays;
import java.util.Scanner;

public class PythagorasTriplet {
	public static boolean binarySearch(int[] a, int start, int end, int value) {
		if(end > start) {
			int mid = (start+end)/2;
			if(a[mid] == value) {
				return true;
			}
			if(value > a[mid]) {
				return binarySearch(a, start+1, end, value);
			}
			else {
				return binarySearch(a, start, end-1, value);
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of test cases: ");
		int tCase = in.nextInt();
		while(tCase > 0) {
			System.out.println("Enter the size of array");
			int n = in.nextInt();
			System.out.println("Enter the elements of array");
			int[] a = new int[n];
			int b[] = new int[n];
			for(int i=0; i<n; i++) {
				a[i] = in.nextInt();
				b[i] = a[i];
			}
			int flag = 0;
			Arrays.sort(b);
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					int x = a[i]*a[i] + a[j]*a[j];
					double case1 = Math.sqrt(x);
					if(case1%1 == 0) {
						if(binarySearch(b, 0, n, (int)case1)) {
							System.out.println("Yes");
							flag = 1;
							break;
						}
					}
					case1 = Math.abs(a[i]*a[i] - a[j]*a[j]);
					if(case1%1 == 0) {
						if(binarySearch(b, 0, n, (int)case1)) {
							System.out.println("Yes");
							flag = 1;
							break;
						}
					}
				}
				if(flag == 1)
					break;
			}
			if(flag == 0)
				System.out.println("No");
			tCase--;
		}
	}
}

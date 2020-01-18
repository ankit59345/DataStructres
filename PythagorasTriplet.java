import java.util.Scanner;

public class PythagorasTriplet {
	public static boolean binarySearch(int[] a, int start, int end, int value) {
		if(start <= end) {
			int mid = (start+end)/2;
			if(a[mid] == value) {
				return true;
			}
			if(value > a[mid]) {
				binarySearch(a, start+1, end, value);
			}
			else {
				binarySearch(a, start, end-1, value);
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = in.nextInt();
		System.out.println("Enter the elements of array");
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				int x = a[i]*a[i] + a[j]*a[j];
				int case1 = Math.sqrt(x);
			}
		}
	}
}

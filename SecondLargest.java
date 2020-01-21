import java.util.Scanner;

public class SecondLargest {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = in.nextInt();
		System.out.println("Enter the elements of array");
		int[] arr = new int[n];
		int fLr = 0, sLr = 0;
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
			if(i == 0)
				fLr = arr[i];
			else {
				if(arr[i] > fLr) {
					sLr = fLr;
					fLr = arr[i];
				}
				else if(arr[i]<fLr && arr[i]>sLr) {
					sLr = arr[i];
				}
//				7 80 2 50 1 7 -1
			}
		}
		System.out.println("Largest-"+fLr+"\nSecond-"+sLr);
	}
}

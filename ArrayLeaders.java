import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayLeaders {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = in.nextInt();
		System.out.println("Enter the elements of array");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			int x = arr[i];
			int flag = 0;
			for(int j=i+1; j<n; j++) {
				if(x < arr[j]) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.print(x+" ");
			}
			if(i == n-2)
				System.out.println(arr[n-1]);
		}
	}

}

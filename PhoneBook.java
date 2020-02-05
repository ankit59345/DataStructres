import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer, String> phone_book = new HashMap<>();
		System.out.println("Enter number of entries of phone book");
		int n = Integer.parseInt(in.nextLine());
		System.out.println("Enter the values for phone book");
//		phone_book.put(99912222, "uncle sam");
//		phone_book.put(11122222, "tom");
//		phone_book.put(12299933, "harry");
		while(n > 0) {
			System.out.println("Enter name");
			String name = in.nextLine();
			System.out.println("Enter number");
			int number = Integer.parseInt(in.nextLine());
			phone_book.put(number, name);
			n--;
		}
		System.out.println("Enter the number of queries");
		int x = Integer.parseInt(in.nextLine());
		while(x > 0) {
			System.out.println("Enter the name");
			String name = in.nextLine();
			int flag = 0;
			for (HashMap.Entry<Integer,String> entry : phone_book.entrySet()) {
				if(entry.getValue().equals(name)) {
					flag = 1;
					System.out.println(name+"="+entry.getKey());
					break;
				}
			}
			if(flag == 0)
				System.out.println("Not found");
			x--;
		}
		in.close();
	}

}

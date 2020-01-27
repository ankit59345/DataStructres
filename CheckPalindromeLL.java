import java.util.Scanner;

public class CheckPalindromeLL {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public static boolean checkPalindrome() {
		if(head == null)
			return false;
		else {
			String a = "";
			String b = "";
			Node temp = head;
			while(temp!=null) {
				String x = Integer.toString(temp.data);
				a = a + x;
				b = x + b;
				temp = temp.next;
			}
			if(a.equalsIgnoreCase(b))
				return true;
			else {
				return false;
			}
		}
	}
	
	public static void display() {
		if(head == null)
			System.out.println("No LL exist");
		else {
			Node temp = head;
			while(temp.next != null) {
				System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of elements to insert");
		int n = in.nextInt();
		System.out.println("Enter the elements to insert");
		for(int i=0; i<n; i++) {
			insert(in.nextInt());
		}
		if(checkPalindrome()) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}

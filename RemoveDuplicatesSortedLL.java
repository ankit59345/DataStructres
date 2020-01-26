import java.util.Scanner;

public class RemoveDuplicatesSortedLL {
	
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
	
	public static void removeDuplicates() {
		if(head == null) {
			return;
		}
		else {
			Node temp1 = head;
			Node temp2 = head;
			int i=0, j=0;
			while(temp2 != null) {
				if(temp1.data == temp2.data) {
					if(temp1.next == null)
						break;
					if(temp1.data == temp1.next.data) {
						temp2 = temp2.next;
						j++;
						continue;
					}
					else {
						temp1 = temp1.next;
						i++;
						j++;
						temp2 = temp2.next;
					}
				}
				else {
					i++;
					temp1.next = temp2;
					temp1 = temp1.next;
				}
			}
			if(temp2==null && temp1.next!=null) {
				temp1.next = null;
				return;
			}
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
		System.out.println("Before removing duplicates");
		display();
		removeDuplicates();
		System.out.println("After removing duplicates");
		display();
	}
}

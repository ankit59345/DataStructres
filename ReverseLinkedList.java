import java.util.Scanner;
public class ReverseLinkedList {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static void insert(int data) {
		Node newNode = new Node(data);
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
	
	public static void reverse() {
		if(head == null)
			return;
		else {
			Node next = head;
			Node curr = head;
			Node prev = null;
			while(curr != null) {
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			head = prev;
		}
	}
	
	public static void display() {
		if(head == null) {
			System.out.println("No LinkedList present");
		}else {
			Node temp = head;
			while(temp.next != null) {
				System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter th number of elements");
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			insert(in.nextInt());
		}
		System.out.println("LinkedList is: ");
		display();
		System.out.println("");
		reverse();
		System.out.println("Reversed LinkedList is: ");
		display();
		System.out.println("");
	}

}

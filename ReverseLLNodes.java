import java.util.Scanner;

public class ReverseLLNodes {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node reverse(Node h, int k) {
		int count = 0;
		Node prev = null;
		Node curr = h;
		Node next = null;
		while(count<k && curr!=null) {
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next != null) {
			h.next = reverse(next, k);
		}
		return prev;
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
	
	public static void display() {
		if(head == null) {
			System.out.println("No LinkedList present");
		}else {
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
		System.out.println("Enter the number of elements");
		int n = in.nextInt();
		System.out.println("Enter the elements");
		for(int i=0; i<n; i++) {
			insert(in.nextInt());
		}
		System.out.println("Enter the value of k");
		int k = in.nextInt();
		display();
		head = reverse(head, k);
		display();
		in.close();
	}
}

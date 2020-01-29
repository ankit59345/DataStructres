import java.util.Scanner;

public class PairSumDoublyLL {
	
	static Node head, tail;
	
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public static void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
			tail = newNode;
		}
	}
	
	public static void findPairs(int sum) {
		if(head == null || head.next == null) {
			System.out.println("No pairs possible");
		}
		else {
			Node h = head;
			int size = 0;
			Node t = tail;
			while(h != null) {
				size++;
				h = h.next;
			}
			h=head;
			int mid = size/2;
			int flag = 0;
			while(h!=t) {
				if(h.data+t.data == sum) {
					System.out.println("("+h.data+", "+t.data+")");
					flag = 1;
					h = h.next;
					t = t.prev;
					continue;
				}
				if(h.data + t.data > sum) {
					t = t.prev;
				}
				else {
					h = h.next;
				}
			}
			if(flag == 0)
				System.out.println("No pairs found");
		}
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements of Doubly Linked List");
		int n = in.nextInt();
		System.out.println("Enter the elements of list");
		for(int i=0; i<n; i++) {
			insert(in.nextInt());
		}
		System.out.println("Enter the value of Sum");
		int sum = in.nextInt();
		findPairs(sum);
//		2, 3, 4, -2, 6, 8, 9, 11
	}
}

import java.util.HashSet;

public class DetectLoopLL {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
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
		}
	}
	
	public static boolean detectLoop() {
		HashSet<Node> h1 = new HashSet<>();
		Node curr = head;
		while(curr != null) {
			if(h1.isEmpty()) {
				h1.add(curr);
			}
			else {
				if(h1.contains(curr))
					return true;
				h1.add(curr);
			}
			curr = curr.next;
		}
		return false;
	}
	
	public static void display() {
		if(head == null)
			System.out.println("No Linked List present");
		else {
			Node temp = head;
			while(temp.next!=null) {
				System.out.print(temp.data+"-->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		display();
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node th = head;
		while(th.next != null) {
			if(th.data == 30)
				break;
			th = th.next;
		}
		temp.next = th;
		if(detectLoop())
			System.out.println("Loop Found");
		else
			System.out.println("No Loop Found");
	}

}

package demo;

public class SinglyLinkedList {
	class Node{
		int data; //instance variable
		Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
		
	}
	}
	public Node head=null;
	public Node tail=null;
	public void add(int data) {
		Node node=new Node(data);  //create new node
		if(head==null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			tail=node;
		}
		}
	
	public void delete() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			if(head!=tail) {
				head=head.next;
			}else {
				head=tail=null;
		}
	}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
		}
		System.out.println("Nodes of singly Linked List");
		while(current != null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		SinglyLinkedList slist=new SinglyLinkedList();
		slist.add(10);
		slist.add(20);
		slist.add(30);
		slist.add(40);
		slist.add(50);
		slist.add(60);
		slist.display();
		while(slist.head!=null) {
			slist.delete();
			slist.display();
		}
	}


}

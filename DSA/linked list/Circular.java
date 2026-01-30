 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Circular
{
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
        Node head = null;
        head = addFirst(head, 5);
        head = addFirst(head, 10);
        head = addFirst(head, 15);
        printCircularList(head);
    }
		
	private static Node addFirst(Node head, int data) {
    Node newNode = new Node(data);
    if (head == null) {
        newNode.next = newNode; 
        return newNode;
    }
    Node temp = head;
    while (temp.next != head) {   
        temp = temp.next;
    }

    temp.next = newNode;   
    newNode.next = head;   
    head = newNode;     

    return head;
}
private static void printCircularList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

}
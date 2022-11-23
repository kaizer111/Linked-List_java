import java.util.Scanner;

public class OpressionsonLinkedlist {
    Node head = null;
    Scanner Sc = new Scanner(System.in);

    public OpressionsonLinkedlist(Node head) {
        this.head = head;
    }
    public  void  insertatend() {
        System.out.println("Enter no of node to be inserted");
        int n = Sc.nextInt();
        System.out.println("Start inserting nodes");
        for(int i=0;i<n;i++) {
            int data= Sc.nextInt();
            Node traversenode = head ;
            if(head == null) {
                head = new Node(data,null);
            }
            else  {
                while (traversenode.next!=null) {
                    traversenode=traversenode.next;
                }
                traversenode.next=new Node(data,null);
            }
        }
    }
    public  void display() {
        if(head == null) {
            System.out.println("empty list");
        }
        else  {
            Node temp=head;
            while (temp != null) {
                System.out.print(temp.value+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public void insertatBegin() {
        System.out.println("enter the node ");
        int data= Sc.nextInt();

        if(head == null)
        {
            head = new Node(data , null);
        }
        else {
           //Node temp = new Node(data ,head);
           head = new Node(data , head);
        }
        display();
    }
    public void deletefromEnd() {
        if(head == null || head.next == null) {
            head= null;
        }
        else {
            Node temp = head;
            while(temp.next.next != null) {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void deletefromBegin() {
        if(head == null || head.next == null) {
            head= null;
        }
        else {
            head = head.next;
        }
    }
    public void displaynthNode() {
        System.out.println("enter the nth value");
        int n= Sc.nextInt();
        Node temp= head;
        while(n!=0) {
            temp= temp.next;
            n--;
        }
        System.out.println(temp.value);
    }
    public void reverse() {
        if(head == null || head.next == null) {
            System.out.println("less than i node");
        }
        else {
            Node c=head , prev= null, n=head.next;
            while(n!=null) {
                c.next=prev;
                prev=c;
                c=n;
                n=n.next;
            }
            c.next=prev;
            head=c;
        }
    }
}

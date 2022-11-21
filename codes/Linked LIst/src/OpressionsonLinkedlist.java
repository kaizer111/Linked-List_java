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
}

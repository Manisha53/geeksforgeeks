{
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                head = addToTheLast(new Node(a), head);
            }
            int k = sc.nextInt();
            Rotate g = new Rotate();
            head = g.rotate(head,
                            k); // rotate linked list anti-clockwise by k nodes
            printList(head);
        }
    }
    // insert function to build linked list
    public static Node addToTheLast(Node node, Node head) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
//-------------------------------------------------------------my code--------------------------------
class Rotate {
    
     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        // add code here.
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
       }
       temp.next=head;
       Node end=null;
       while(k-->0){
           end=head;
           head=head.next;
       }
       end.next=null;
       
       
          return head;  
            
    
    }
}

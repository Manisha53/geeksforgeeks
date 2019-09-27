//------------------my code-------------------------
class Gfg {
    Node rotateP (Node head, int p){
        //Write your code here
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
    
        while(p-->0){
            Node t=head;
            head=head.next;
            head.prev=null;
            last.next=t;
            t.prev=last;
            t.next=null;
            last=t;
        
        }

return head;
    }
}

 static Node partSeperator(Node head,int k){
        Node head1=head;
        Node prev=null,next=null;
        Node temp1=head,temp2=head;



        while(temp1!=null&&k!=0){
            temp2=temp1;
            k--;
            temp1=temp1.next;
        }
        temp2.next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        head=prev;
        while(prev!=null){
            head1=prev;
            prev=prev.next;
        }
        head1.next=temp1;
        return head;
    }
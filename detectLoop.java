static boolean detectLoop(Node head){
        Node fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data){
                return true;
            }

        }
        return false;
    }
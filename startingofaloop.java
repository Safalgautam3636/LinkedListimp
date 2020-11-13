 static Node startingLoop(Node head){
        boolean loopExisted=false;
        Node fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data){
                loopExisted=true;
            }

        }
         if(loopExisted){
            fast=head;
            while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
             return fast;
        }
         return fast;
    }
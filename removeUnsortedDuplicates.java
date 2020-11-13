 static Node removeUnsortedDuplication(Node head){
        HashSet<Integer>hash=new HashSet<>();
        Node current=head;
        Node prev=null;
        while(current!=null){

            if(hash.contains(current.data)){
                prev.next=current.next;
            }
            else {
                hash.add(current.data);
                prev = current;
            }
            current=current.next;

        }
        return head;
   }
# LinkedListimp
implementation of LL

# Detection and Removal of Loop in LL
We use Floyd's Algorithm :

1.initialise 2 pointers -slow and fast

2.while the fast.next and fast.next.next isnot null we will move these two pointers by 1 step and 2 steps respectively

3.if slow==fast then there is a loop
     
   ### Removal of a loop
     
     1.After the detection of a loop again initialize one of the two pointers to the head of the linked list.(Suppose that pointer be first)
     
     2.And put the another pointer as it is where they both meet at.(Suppose this pointer is slow)
     
     3.So,what floyd's algorithm says is -> "After step 1 && step 2 are done move the both of the pointers by one step and the codition 
     
     is the next of each pointers while moving mustnot be equal"
     
     4.If (fast.next==slow.next)->then the they will meet at the 1st node of the linked list where the cycle is created.
     
     5.Our goal is to remove the loop so we check
     
                                                  while(fast.next!=slow.next)
                                                   {
                                                       fast=fast.next;
                                                       slow=slow.next;
                                                   }
                                                   else{
                                                       make the next of slow as null
                                                       i.e.slow.next=null
                                                   }
    
     


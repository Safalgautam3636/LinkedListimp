# LinkedListimp
implementation of LL

# Detection and Removal of Loop in LL
We use Floyd's Algorithm :

1.initialise 2 pointers -slow and fast

2.while the fast.next and fast.next.next isnot null we will move these two pointers by 1 step and 2 steps respectively

3.if slow==fast then there is a loop


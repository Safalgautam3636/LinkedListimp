//Program to add 1 on the last digit of a linked list

//Eg:
   //  1->2->3->null
//digit is 123 and we have to return 124
 
 static double addOneToLast(Node head){
        double num=0; double value=0;
        Node ptr=head;
        while(ptr!=null){
            num++;
            ptr=ptr.next;
        }

        while (head!=null&&num>=0){
            num=num-1;
            double multiply=Math.pow(10,num);
           value+=multiply*head.data;
            head=head.next;
        }

        return value+1;

  }
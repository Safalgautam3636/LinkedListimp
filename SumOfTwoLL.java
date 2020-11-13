


/*	AIM:to find the sum of those linked list in individual fashain

Algorithm:
Steps:
1.Get two headers of two Linked List
2.static Node adderLinkedList(Node head1,Node head2){}
3.   
      1->2->3->4->null
      4->9->3->6->null
	   1     1
	4->3->2->1->null
	6->3->9->4->null
----------------------------
	0  7  1  6->6 1 7 0

static Node adderLinkedList(Node head1,Node head2){

	Node rhead1=reverse(head1);
	Node rhead2=reverse(head2);
	int sum=0,remainder=0,carry=0;

	while(rhead1!=null ||rhead2!=null){
	
	sum=carry+(rhead.data if rhead!=null)+(rhead.data if rhead!=null);
	
	
}*/
import java.util.HashSet;
import java.util.*;
public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
//problem->We are given two linked list and basically they both are heads of those linked lisr
    //our aim is to find the sum of the individual elements in the linkedlist

    static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    static Node reverse(Node head){
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node addNodes(Node head1,Node head2){
        Node rhead1=reverse(head1);
        Node rhead2=reverse(head2);
        Node node=new Node(0);
        Node first=node;
        int carry=0,sum=0,remain=0;
        while (rhead1!=null||rhead2!=null){
            sum=carry+((rhead1!=null)?rhead1.data:0)+((rhead2!=null)?rhead2.data:0);
            carry=0;
            if(sum>=10){
                carry=sum/10;
            }
            remain=sum%10;
            node.next=new Node(remain);
           if(rhead1!=null) rhead1=rhead1.next;
            if(rhead2!=null) rhead2=rhead2.next;
            node=node.next;

        }
        if(carry>0){
            Node naya=new Node(carry);
            node.next=naya;
        }
        return first.next;

    }


    public static void main(String[] args)throws Exception {
        //head
        Node node =new Node(2);
        Node node1=new Node(4);
        Node node2 =new Node(3);
        Node head=node;
        node.next=node1;
        node1.next=node2;
        node2.next=null;
        //heade
        Node nodee =new Node(9);
        Node nodee1=new Node(9);
        Node nodee2 =new Node(9);
        Node heade=nodee;
        nodee.next=nodee1;
        nodee1.next=nodee2;
        nodee2.next=null;
        Node x=addNodes(head,heade);
        print(reverse(x));





    }

}

	





}




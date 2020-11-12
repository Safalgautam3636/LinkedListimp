
import java.util.*;
public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    static boolean hasCycle(Node head) {
        try{
            Node slow=head;
            Node fast=head;
            while(slow!=null&&fast.next!=null){

                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }

            }
        }
        catch(Exception e){}
        return false;
    }
    static Node insertTail(Node head, int data) {


        Node last=new Node(data);
        if(head==null){
            head=last;
        }
        else{
            Node demo=head;
            while(demo.next!=null){
                demo=demo.next;
            }
            demo.next=last;
        }
        return head;
    }
    static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    static Node insertFirst(Node llist, int data) {

        Node x=new Node(data);
        if(llist==null){
            llist=x;
        }
        else{
            x.next=llist;
            llist=x;
        }
        return llist;

    }
    static Node insertPos(Node head, int data, int position) {
        Node ptr=head;
        Node x=head;
        Node nnode=new Node(data);
        int num=0;
        while(num<=position-1){
            ptr=x;
            num++;
            x=x.next;
        }
        nnode.next=x;
        ptr.next=nnode;
        return head;


    }
    static Node deleteNode(Node head, int position) {

        Node node=head;
        Node node1=head;
        if(position==0){
            head=head.next;
        }
        int num=0;
        while(num<=position-1){
            node1=node;
            num++;
            node=node.next;
        }
        node1.next=node.next;
        return head;

    }
    static void printReverse(Node head){
        Node prev=null;Node next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;

        }
        while(prev!=null){
            System.out.println(prev.data);
            prev=prev.next;
        }
    }
    static Node mergeLists(Node head1, Node head2) {
        Node merged=new Node(0);
        Node built=merged;
        if(head1==null&&head2==null)return null;
        if(head1==null&&head2!=null)return head2;
        if(head1!=null&&head2==null)return head1;

        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                merged.next=head1;
                head1=head1.next;
            }
            else if(head2.data<=head1.data){
                merged.next=head2;
                head2=head2.next;
            }
            merged=merged.next;
        }
        if(head1==null&&head2!=null){
            merged.next=head2;
        }
        if(head2==null&&head1!=null){
            merged.next=head1;
        }
        return built.next;




    }
    static Node removeDuplicate(Node head) {
        Node head1=head;
        while(head1!=null&&head1.next!=null){
            if(head1.data==head1.next.data){

                head1.next=head1.next.next;

            }
            else{
                head1=head1.next;
            }

        }
        return head;

    }
    public static void main(String[] args) {
        Node node =new Node(10);
        Node node1=new Node(20);
        Node node2 =new Node(50);
        Node node3=new Node(40);
        Node node4 =new Node(50);
        Node node5=new Node(60);
        Node node6 =new Node(50);
        Node node7=new Node(80);
        Node head=node;
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=null;
        System.out.println("First print");
        print(head);
        /*System.out.println("After tail insertion print");
        Node tail=insertTail(head,12);
        print(tail);
        Node first=insertFirst(head,34);
        System.out.println("After first insertion print");
        print(first);
        System.out.println("After position insertion print");
        Node pos=insertPos(head,99,3);
        print(pos);*/
        Node del=deleteNode(head,0);
        System.out.println("After position deletion print");
        print(del);
        System.out.println("The Reverse:");
        printReverse(del);
        //head2
        /*System.out.println("After merging");
        Node n1 =new Node(1);
        Node n2=new Node(2);
        Node n3 =new Node(3);
        Node n4=new Node(4);
        Node n5 =new Node(5);
        Node n6=new Node(6);
        Node n7 =new Node(7);
        Node n8=new Node(8);
        Node head1=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=null;
        Node merge=mergeLists(head,head1);
    print(merge);*/
        System.out.println("After the removal of Duplicates");
    Node remove=removeDuplicate(head);
    print(remove);


    }

}

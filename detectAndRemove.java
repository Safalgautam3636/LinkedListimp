
import java.util.*;
public class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }


    static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    static Node detectLoop(Node head){
        Node save=null;
        Node fast=head,slow=head;
        while(fast.next!=null&&fast.next.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data){
                 save=removeLoop( fast, slow, head);
            }

        }
        return save;
    }
    static Node removeLoop(Node fast,Node slow,Node head){

        fast=head;
        while(fast.next!=slow.next){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=null;
        return head;
    }

    public static void main(String[] args)throws Exception {
        Node node =new Node(1);
        Node node1=new Node(2);
        Node node2 =new Node(3);
        Node node3=new Node(4);
        Node node4 =new Node(5);
        Node node5=new Node(6);
        Node node6 =new Node(7);
        Node node7=new Node(8);
        Node head=node;
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;

//create a loop
        Node cyc=new Node(34);
        node7.next=cyc;
        cyc.next=node5;
//        System.out.println("First print");
//        print(head);
        Node xyz=detectLoop(head);
       print(xyz);




    }

}

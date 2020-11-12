//rotation clockwise
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
    static Node rotate(Node head,int k)throws Exception{
        try{
        Node temp=head;
        Node names=head;
        int count=0;
        while(temp!=null){
            names=temp;
            count++;
            temp=temp.next;
        }

        if(k>count){
            k%=count;
        }

        k=count-k;
        if(k==0||k==count){
            return head;
        }
        int num=0;
        Node name=head;
        Node safal=head;
        while(num<k&&name!=null){
            safal=name;
            name=name.next;
            num++;

        }


        names.next=head;
            safal.next=null;
            head=name;

        }
        catch (Exception e){}
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
        node7.next=null;
        System.out.println("First print");
        print(head);
        System.out.println("After Rotation");

            Node rotater = rotate(head, 2);
            print(rotater);





    }

}

import java.util.*;

class LinkedList{
      static ListNode head;
 
      static class ListNode{
             int data;
             ListNode next;

             ListNode(int data){
                 this.data=data;
                 this.next=null;
              }

        }


    
     void display(ListNode head){
          ListNode temp=head;
          while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
          }
       }




    
      public static void main(String args[]){
             LinkedList list=new LinkedList();
             list.head=new ListNode(1);
             list.head.next=new ListNode(2);
             list.head.next.next=new ListNode(3);
             list.head.next.next.next=new ListNode(4);
             list.head.next.next.next.next=new ListNode(5);
              
             list.display(head);
             
             
             
            
             }
       }
             
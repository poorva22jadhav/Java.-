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


       ListNode moveLast(ListNode head){
                ListNode current=head;
                ListNode prev=null;
                
                while(current.next!=null){
                       prev=current;
                       current=current.next;
                     }
                     prev.next=null;
                     current.next=head;
                     head=current;
                
                return head;
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
             ListNode head2=list.moveLast(head); 
             list.display(head2);
             
             
             
            
             }
       }
             
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


      ListNode addOne(ListNode head){
               ListNode temp=head;
               while(temp.next!=null){
                     temp=temp.next;
                   }
                   temp.data+=1;
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

             ListNode head2=list.addOne(head);
             list.display(head2);
             
             
             
            
             }
       }
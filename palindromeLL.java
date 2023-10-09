import java.util.*;

class LinkedList{
      static ListNode head;
 
      static class ListNode{
             char data;
             ListNode next;

             ListNode(char data){
                 this.data=data;
                 this.next=null;
              }

        }


      boolean Reverse(ListNode head){

               ListNode slow=head;
               ListNode fast=head;


               while(fast.next!=null && fast!=null){
                     slow=slow.next;
                     fast=fast.next.next;
                    }

              ListNode prev=null;
              ListNode current=slow;
              ListNode next;

                      while(current!=null){
                            next=current.next;
                            current.next=prev;
                            prev=current;
                            current=next;
                            }

             ListNode right=prev;
             ListNode left=head;

                        while(right!=null){
                              if(right.data!=left.data){
                                 return false;
                                 
                                }
                               
                              right=right.next;
                              left=left.next; 
                          }
               return true;


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
             list.head=new ListNode('M');
             list.head.next=new ListNode('A');
             list.head.next.next=new ListNode('D');
             list.head.next.next.next=new ListNode('A');
             list.head.next.next.next.next=new ListNode('M');
              
             list.display(head);
             System.out.println(list.Reverse(head));
             
             
            
             }
       }
             
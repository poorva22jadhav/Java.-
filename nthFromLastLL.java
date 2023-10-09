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


      ListNode nthFromLast(ListNode head){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter nth position from last");
           int n=sc.nextInt();
           int count=0;
             
           ListNode temp=head;
           while(temp!=null){
                 count++;
                 temp=temp.next;
                 
              }

            int loop=count-n+1;
            ListNode temp2=head;
            

           for(int i=1;i<loop-1;i++){
              
              temp2=temp2.next;
              }
           temp2.next=temp2.next.next;
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
             list.head=new ListNode(2);
             list.head.next=new ListNode(3);
             list.head.next.next=new ListNode(4);
             list.head.next.next.next=new ListNode(5);
             list.head.next.next.next.next=new ListNode(6);
             ListNode head2=list.nthFromLast(head);
            list.display(head2);
             }
       }
             
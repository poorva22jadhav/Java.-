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


       void deleteLoop(){
             ListNode slow=head;
             ListNode fast=head;

             while(fast!=null && fast.next!=null){
                   slow=slow.next;
                   fast=fast.next.next;

                   if(slow==fast){
                     while()






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
             //list.head.next.next.next.next=head.next;
             list.display(head);
             }
       }
             
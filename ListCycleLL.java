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

      static boolean ListCycle(ListNode head){
             if(head==null||head.next==null){
                return false;
             
               }

             ListNode slow=head;
             ListNode fast=head;

            while(fast!=null && fast.next!=null){
                  slow=slow.next;
                  fast=fast.next.next;

                  if(slow==fast){
                    return true;
                   }
               }
          return false;
           }

     

     public static void main(String args[]) {
             LinkedList list=new LinkedList();
              list.head=new ListNode(1);
              list.head.next=new ListNode(2);
              list.head.next.next=new ListNode(3);
              list.head.next.next.next=new ListNode(4);
              list.head.next.next.next.next = head.next;
              System.out.println(list.ListCycle(head));

              }
 }
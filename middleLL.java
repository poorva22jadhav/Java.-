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

     

     void middle(ListNode head){
           int count=0;
           ListNode temp=head;
           while(temp!=null){
                 temp=temp.next;
                 count++;
                }
           
           int mid=count/2;
           
            ListNode temp2=head;
            
           for(int i=1;i<=mid;i++){
               temp2=temp2.next;
               }

           while(temp2!=null){
                 
                 System.out.print(temp2.data+" ");
                 temp2=temp2.next;           
           }
          
            System.out.println(); 
          
       }


     static  ListNode  middle2(ListNode head){
                if(head==null || head.next==null){
                   return head;
                  }
                
                ListNode slow=head;
                ListNode fast=head;

               while(fast!=null&&fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                    }
               return slow;
               }
 
     static void display(ListNode head){
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
            
             
          
             list.middle(head);
             ListNode middle=middle2(head);
             display(middle);
             }
         }
             
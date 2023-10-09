class LinkedList{
      static Node head;
      static Node head2;
      static Node sumHead;

      static class Node{
            int data;
            Node next;


            Node(int data){
                 this.data=data;
                 this.next=null;
              }

            }

      Node reverse(Node head,int k){
           Node prev=null;
           Node current=head;
           Node last=head;
           Node next=null;


          for(int i=0;i<k;i++){
              next=current.next;
                   
              current.next=prev;
              
              prev=current;
              current=next;
           }
           Node head1=prev;
           Node temp=current;
           Node prev1=null;
           Node current1=temp;
           Node next1=null;

           while(current1!=null){
              next1=current1.next;
                   
              current1.next=prev1;
              
              prev1=current1;
              current1=next1;
            }

            Node first=prev1;
            last.next=first;
            return head1;
         
            
          
      }

      Node reverseInGroups(Node head, int k) {
                 Node current = head;
                 Node next = null;
                 Node prev = null;
                 int count = 0;

    // Reverse the first k nodes of the linked list
    

        while (current != null && count < k) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        count++;
    }

    // If there are more nodes to be reversed

        if (next != null) {
        head.next = reverseInGroups(next, k);
       }

    
    return prev;
   }
     



    


      void display(Node head){
           Node temp=head;
           while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
               }
          }


      public static void main(String args[]){
             LinkedList ll=new LinkedList();
             ll.head=new Node(1);
             ll.head.next=new Node(2);
             ll.head.next.next=new Node(3);
             ll.head.next.next.next=new Node(4);
             ll.head.next.next.next.next=new Node(5);
             
            
             Node head2=ll.reverseInGroups(head,3);
             ll.display(head2);
             }
      }


             
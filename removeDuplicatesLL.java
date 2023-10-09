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

      Node removeDuplicates(Node head){
           Node current=head;
           Node prev=null;

           while(current!=null){

                 prev = current;
                 current=current.next;
                
                if(prev.data==current.data){
                   prev.next=current.next;
                   prev=current.next;
                   
                   
                 }


                 


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
             ll.head=new Node(2);
             ll.head.next=new Node(2);
             ll.head.next.next=new Node(4);
             ll.head.next.next.next=new Node(5);
             
             
            
             Node head2=ll.removeDuplicates(head);
             ll.display(head2);
             }
      }
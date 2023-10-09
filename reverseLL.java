class LinkedList{
       static Node head;
         
       static class Node{
             int data;
             Node next;

             Node(int data){
                  this.data=data;
                  this.next=null;
                }
            }

        
        void reverseIterate(){
             Node prevNode=head;
             Node currNode=head.next;

             while(currNode!=null){
                  Node nextNode=currNode.next;
                  currNode.next=prevNode;
                  prevNode=currNode;
                  currNode=nextNode;
                  }
          
            head.next=null;
            head=prevNode;
      }

     static Node reverseRecursive(Node current,Node prev){
           if(current==null){
              head=prev;
              return head;}

           Node next=current.next;
           current.next=prev;
           return reverseRecursive(next,current);
           
          }


     
                

      void display(){
           Node temp=head;
           while(temp!=null){
               
                System.out.print(temp.data+" ");
                temp=temp.next;
             }
           System.out.println();
          }
               
           


         public static void main(String args[]){
                LinkedList list=new LinkedList();
                list.head=new Node(85);
                list.head.next=new Node(15);
                list.head.next.next=new Node(4);
                list.head.next.next.next=new Node(20);
                 
                System.out.println("Given linked list");

                list.display();
                //list.reverseIterate();
                //System.out.println("After reversal");
                //list.display();
                System.out.println("through recursive way");
                reverseRecursive(head,null);
                list.display();
               


               }
                   }
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

      void display(Node node){
           while(node!=null){
                Node p=node;
                System.out.println(p.data);
                p=p.next;
             }
          }
               
           


         public static void main(String args[]){
                LinkedList list=new LinkedList();
                list.head=new Node(85);
                list.head.next=new Node(15);
                list.head.next.next=new Node(4);
                list.head.next.next.next=new Node(20);
                 
                System.out.println(Given linked list);
                list.display(head);
               


               }
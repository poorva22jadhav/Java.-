class LinkedList{
     static Node head;

      class Node{
            int value;
            Node next;
           
            Node(int value){
                this.value=value;
                this.next=null;
                }

            }

   boolean isEmpty(){
           return head==null;
        }


     void insertAtstart(int value){
          Node newNode=new Node(value);
          if(isEmpty()){
             head=newNode;
             head.next=head;
             }
          else{
         newNode.next=head;
         Node current=head;
         while(current.next!=head){
              current=current.next;
              }
              current.next=newNode;
              head=newNode;
           }
       }

    void insertAtend(int value){
         Node newNode=new Node(value);
              
          if(isEmpty()){
             head=newNode;
             head.next=head;
             }
         else{

         Node current=head;
         while(current.next!=head){
              current=current.next;
              }
         current.next=newNode;
         newNode.next=head;
            }
        }
         

    void splitInHalf(){
         Node slow=head;
         Node fast=head;

        while(fast.next!=head&&fast!=head){
             slow=slow.next;
             fast=fast.next;
            }
       Node firstHalfEnd=slow;
       Node secondHalfStart=slow.next;
       
       firstHalfEnd.next=head;
       slow.next=secondHalfStart;

       display(head);
       System.out.println();
       display(secondHalfStart);
       }

     void display(Node start){
          Node current=start;
          while(current!=start){
                System.out.print(current.value+" ");
                current.next=current;
              } 
          }
          
         

         


     public static void main(String args[]){
            LinkedList ll=new LinkedList();
            ll.insertAtstart(2);
            ll.insertAtstart(3);
            ll.insertAtstart(4);
            ll.insertAtstart(5);
            ll.insertAtstart(6);
            ll.insertAtstart(7);

            ll.splitInHalf();
       }
      }
           
            
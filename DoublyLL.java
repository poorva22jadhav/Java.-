
class DoublyLinkedList{
     static Node head;
     static  Node tail;
     static class Node{
            int data;
            Node previous;
            Node next;

            Node(int data){
                 this.data=data;
                 this.previous=null;
                 this.next=null;
             
               }

           }

       
       static void addNode(int data){



              Node newNode=new Node(data);
              
              if(head==null){
                head=newNode;
                tail=newNode;

                }
             else{

             tail.next=newNode;
             newNode.previous=tail;
             tail=newNode;
       }}

       static void displayForward(){
              Node current=head;
              while(current!=null){
                    System.out.print(current.data+" ");
                    current=current.next;
                    }
                }

       static void displayBackward(){
              Node current=tail;
              while(current!=null){
                    System.out.print(current.data+" ");
                    current=current.previous;
                    }
                }


       public static void main(String args[]){
              DoublyLinkedList dl=new DoublyLinkedList();
              dl.addNode(10);
              dl.addNode(20);
              dl.addNode(30);
              dl.addNode(40);

             


             dl.displayForward();
             dl.displayBackward();


             }
       }












             
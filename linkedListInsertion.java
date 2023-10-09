

class LL{
     public static void main(String args[]){
            LinkedList ll=new LinkedList();
            ll.insert(5);
            ll.insert(4);
            ll.insert(9);
            ll.insertAtStart(3);
            ll.insertAt(2,10);
            ll.insertAt(3,11);
            
            ll.display();
             }
                  }

class Node{
      int data;
      Node next;   //datatype is node because it is referring to another node

     Node(int data){
         this.data=data;
         this.next=null;
      }
         }


class LinkedList{
      Node head;   //the head variable typically stores the reference to the first node in the list. 
                   //It points to the memory location where the first node is stored, rather than directly storing the address of the next node.


     public void insert(int data){
            Node newNode=new Node(data);

            if(head==null){
               head=newNode;
               }
           else{
                Node current=head;
                while(current.next!=null){
                     current=current.next;
                   }
                current.next=newNode;
              }

                 }



    public void insertAtStart(int data){
                Node newNode=new Node(data);

                if(head==null){
                  head=newNode;
                  }
               else{
                   newNode.next=head;
                   head=newNode;
               }
                 }


  public void insertAt(int index,int data){
         Node newNode=new Node(data);


         if(index==0){
           insertAtStart(data);
           }

         else{
        

         Node current=head;
         int position=0;
          
                     while(current!=null&& position<index-1){
                           current=current.next;
                           position++;
                         }
                    newNode.next=current.next;
                    current.next=newNode;
                    
                       
                 }

          }


    public void display(){
           Node current=head;

          while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
           }
          
          System.out.println();
              }
                  }
                  


          

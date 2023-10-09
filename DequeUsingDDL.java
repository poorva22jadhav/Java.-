class Node{
      int data;
      Node prev;
      Node next;


      Node(int data){
           this.data=data;
           this.prev=null;
           this.next=null;
          }

      }

class Deque{
      Node front;
      Node rear;
      int size;


      Deque(){
            front=null;
            rear=null;
            size=0;
          }
        
      boolean isEmpty(){
              return size==0;
            }
      
      int size(){
           return size;
                }

      
      void addFront(int item){
           Node newNode=new Node(item);
           
           if(isEmpty()){
             front=newNode;
             rear=newNode;
                  }
           else{
          newNode.next=front;
          front.prev=newNode;
          front=newNode;
                }
          size++;
       }

        int removeFront(){
             int removedElement=front.data;
              
             front=front.next;
             
             if(front==null){
               rear=null;
                          }
             else{
                  front.prev=null;
                 }
             size--;
             return removedElement;
           }

        void addRear(int item){
             Node newNode=new Node(item);
             
             if(isEmpty()){
                front=newNode;
                rear=newNode;
                     }
             else{

              rear.next=newNode;
              newNode.prev=rear;
              rear= newNode;
             }
              size++;

            }

      int removeRear(){
          if(isEmpty()){
             System.out.println("There is not any element to remove");
             return -1;
                       }

         int removeRear=rear.data;  
         rear=rear.prev;
                if(rear==null){
                   front=null;
                  }
               else{
                   rear.next=null;
                  }
               
              size--;
              return removeRear;
           }

        void display(){
             Node temp=front;
             while(temp!=null){
                   System.out.print(temp.data+" ");
                   temp=temp.next;
                      }
                   }

      public static void main(String args[]){
             Deque deque=new Deque();
             deque.addFront(1);
              deque.addFront(2);
              deque.addFront(3);
              deque.addRear(4);
               deque.addRear(5); 
             deque.addFront(11);
             deque.removeFront();
             deque.removeRear();
             deque.display();
             
                }
           }
           
           

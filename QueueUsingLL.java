class Node{
      int data;
      Node next;

      Node(int data){
          
           this.data=data;
           next=null;

           }
        }

class Queue{
      Node front;
      Node rear;

      Queue(){
           front=null;
           rear=null;
         }

      boolean isEmpty(){
              return front==null;
               }

      void push(int element){
           Node newNode=new Node(element);
           
           if(isEmpty()){
              front=newNode;
              rear=newNode;
             }

           rear.next=newNode;
           rear=newNode;
        }

      int pop(){
           if(isEmpty()){
              System.out.println("queue is empty cannot pop elements");
              return -1;
             }
            int popped=front.data;
            front=front.next;
            if(front==null){
               rear=null;
              }
            return popped;
          }

      int peek(){
             if(isEmpty()){
              System.out.println("queue is empty cannot peek anything");
              return -1;
             }

             return front.data;
        }

        void display(){
             if(isEmpty()){
              System.out.println("Queue is empty cannot display anything");
              return;
             }

             Node current=front;
             while(current!=null){
                  System.out.print(current.data+" ");
                  current=current.next;
                 }
          }
             
              

      public static void main(String args[]){
             Queue qu=new Queue();
             qu.push(1);
              qu.push(2);
              qu.push(3);
              qu.push(4);
              qu.pop();
              qu.pop();
              qu.push(5);
              

               qu.display();
          }
        }  
              
              
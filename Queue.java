class Queue{
      int array[];
      int front;
      int rear;
      int capacity;
      int size;

      Queue(int capacity){
            this.capacity=capacity;
            array=new int[capacity];
            front=0;
            rear=-1;
            size=0;
          }

      boolean isEmpty(){
              return size==0;
             }

       boolean isFull(){
               return size==capacity;
              }

        void enqueue(int element){
             if(isFull()){
                System.out.println("Queue is full,Cannot insert element "+element);
                return;
               }
              
             rear=(rear+1)%capacity;
             array[rear]=element;
             size++;

             }

          int dequeue(){
               if(isEmpty()){
                  System.out.println("Queue is empty,cannot pop anything");
                  return -1;
                 }
                int element=array[front];
                front=(front + 1) % capacity;
                size--;
                return element;
            }
 
            int peek(){
                if(isEmpty()){
                   System.out.println("Queue is empty");
                 }
         
                 return array[front];
            
              }

            void display(){
                 if(isEmpty()){
                   System.out.println("Queue is empty");
                   return;
                  }
                  int i=front;

                  while(true){
                    System.out.print(array[i]+" ");
                    if(i==rear){
                       break;
                      }
                 
                    i=(i+1)%capacity;
                  }
                    System.out.println();
               }

            public static void main(String args[]){
                   Queue qu=new Queue(6);
                   qu.enqueue(1);
                   qu.enqueue(2);
                   qu.enqueue(3);
                   qu.enqueue(4);
                   qu.enqueue(5);
                   qu.enqueue(6);
                   qu.dequeue();
                   qu.dequeue();
                    qu.enqueue(1);
                   qu.enqueue(2);
                   qu.display();
               }
            }
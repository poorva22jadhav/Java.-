class stack{
      int[]array;
      int top;
      int capacity;


      stack(int capacity){
            this.capacity=capacity;
            array=new int[capacity];
            top=-1;
           }

      boolean isEmpty(){
              return top==-1;
             }


      boolean isFull(){
              return top==capacity-1;
             }


      void push(int element){
           if(isFull()){
              System.out.println("Stack Overflow cannot push element "+element);
              return;
            }

           array[++top]=element;
       }

       int pop(){
           if(isEmpty()){
             System.out.println("Stack underflow,Cannot pop from an empty stack");
             return -1;
            }
          return array[top--];
           }

       int peek(){
           if(isEmpty()){
              System.out.println("Stack is empty Cannot peek");
              return -1;
            }
           
           return array[top];
         }

       void display(){
            if(isEmpty()){
              System.out.println("Stack is empty.No elements found to be displayed");
              return;
             }

            for(int i=top;i>=0;i--){
                System.out.print(array[i]+" ");
              }
            System.out.println();
          }


      public static void main(String args[]){
             stack st=new stack(4);
             st.push(2);
             st.push(3);
             st.push(4);
             st.push(5);
             System.out.println(st.pop());
             st.display();
      }
 }
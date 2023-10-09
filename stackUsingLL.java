class Node{
      int data;
      Node next;

      Node(int data){
           this.data=data;
           next=null;
        }
     }


class Stack{
      Node top;

     Stack(){
          this.top=null;
            }


     boolean isEmpty(){
             return top==null;
                }


     void push(int value){
          Node newNode=new Node(value);

         newNode.next=top;
         top=newNode;
         }

    int pop(){
         if(isEmpty()){
           System.out.println("Stack is empty");
           return -1;
                       }
         int popped=top.data;
         top=top.next;
          return popped;
            }
        

    int peek(){
         if(isEmpty()){
           System.out.println("Stack is empty");
           return -1;
                       }

         return top.data;
           }
              
        

    void display(){
          if(isEmpty()){
           System.out.println("Stack is empty,there are no elements to be displayed");
                       }

          Node current=top;
               while(current!=null){
                     System.out.print(current.data+" ");
                     current=current.next;
                     }
                System.out.println();
          }

     public static void main(String args[]){
            Stack stk=new Stack();
            stk.push(10);
            stk.push(20);
            stk.push(30);
            System.out.println(stk.peek());
          
            
            
            stk.display();
         }
      }


        
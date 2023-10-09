
private class LL{

      private Node head;
      private Node tail;
      private int size;

      public LL(){
             this.size=0;
              }
      public void insertFirst(int value){
             Node node = new Node(value);
             node.next=head;
             head=node;


             if(tail==null){
                tail=head;;
               }
            
             size+=1;
                   }


      public void display(){
             Node temp = head;
             while(temp!=null){
                  System.out.println(temp.value+"-> ");
                  temp=temp.next;
                }
            System.out.println("END");
                }


      private class Node{
               private int value;
               private Node next;

               public Node(int value, Node next){
                      this.value=value;
                      this.next=next;
                         }
                              }
                                  }


public class main{
        public static void main(String args[]){
               LL list = new LL();
               list.insertFirst(3);
               list.insertFirst(2);
               list.insertFirst(8);
               list.insertFirst(17);

               list.display();
       }
                }
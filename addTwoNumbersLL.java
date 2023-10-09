class LinkedList{
      static Node head;
      static Node head2;
      static Node sumHead;

      static class Node{
            int data;
            Node next;


            Node(int data){
                 this.data=data;
                 this.next=null;
              }

            }


     



    Node addTwoNumbers(Node head1, Node head2) {
    Node dummy = new Node(0);
    Node curr = dummy;
    int carry = 0;

    while (head1 != null || head2 != null || carry != 0) {
        int sum = carry;

        if (head1 != null) {
            sum += head1.data;
            head1 = head1.next;
        }

        if (head2 != null) {
            sum += head2.data;
            head2 = head2.next;
        }

        carry = sum / 10;
        int digit = sum % 10;

        Node newNode = new Node(digit);
        curr.next = newNode;
        curr = curr.next;
    }

    return dummy.next;
}



      void display(Node head){
           Node temp=head;
           while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
               }
          }


      public static void main(String args[]){
             LinkedList ll=new LinkedList();
             ll.head=new Node(1);
             ll.head.next=new Node(2);
             ll.head.next.next=new Node(3);
             
             ll.head2=new Node(4);
             ll.head2.next=new Node(5);

             
             Node sumHead=ll.addTwoNumbers(head,head2);
             ll.display(sumHead);
             }
      }


             
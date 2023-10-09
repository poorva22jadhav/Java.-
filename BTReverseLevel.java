import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

class BinarySearch{
      class Node{
      Node right;
      Node left;
      int value;

      Node(int value){
           this.right=null;
           this.left=null;
           this.value=value;

           }

     }


      static Node root;

      BinarySearch(){
            this.root=null;
           }

     void insert(int value){
          root=insertRecursive(root,value);

          }

     Node insertRecursive(Node root,int value){
          if(root==null){
             root=new Node(value);
             return root;
             }

         if(value<root.value){
            root.left=insertRecursive(root.left,value);
            }

         else if(value>root.value){
            root.right=insertRecursive(root.right,value);
                }

            return root;
         }

      void ReverseOrderLevel(Node root){
          
           Queue<Node>queue=new LinkedList<>();
           Stack<Node> st=new Stack<>();
            queue.add(root);
           while(!queue.isEmpty()){
                Node current=queue.poll();
                st.push(current);
                
                if(current.left!=null){
                   queue.add(current.left);
                  }

                if(current.right!=null){
                   queue.add(current.right);
                  }
              }

          while(!st.isEmpty()){
                Node current =st.pop();
                System.out.print(current.value+" ");
                }
            }

           public static void main(String args[]){
                  BinarySearch bs=new BinarySearch();
                  bs.insert(5);
                  bs.insert(3);
                  bs.insert(7);
                  bs.insert(2);
                  bs.insert(4);
                  bs.insert(6);

                  bs.ReverseOrderLevel(root);
            }
         }

                 

           
           
               

      
             
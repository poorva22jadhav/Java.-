import java.util.LinkedList;
import java.util.Queue;

class Node{
      Node left;
      Node right;
      int val;

      Node(int val){
          this.left=null;
          this.right=null;
          this.val=val;
          }
       }

       
class BinaryTree{
    static Node root;
           BinaryTree(){
             this.root=null;
                }

            void insert(int val){
                 root=insertRecursive(root,val);
                   }

           Node insertRecursive(Node root,int val){
                if(root==null){
                  root=new Node(val);
                  return root;
                 }

                if(val<root.val){
                   root.left=insertRecursive(root.left,val);
                         }
                else if(val>root.val){
                   root.right=insertRecursive(root.right,val);
                             }

                return root;
         
                }

        void levelOrderTraversal(Node root){

             if(root==null){
               return;
             }
            
             Queue<Node>queue=new LinkedList<>();
             queue.add(root);

            while(!queue.isEmpty()){
                  Node current=queue.poll();
                  System.out.print(current.val+" ");
                 
                 if(current.left!=null){
                    queue.add(current.left);
                   }

                 
                if(current.right!=null){
                    queue.add(current.right);
                    }

                
                }
           }

         public static void main(String args[]){
                BinaryTree bt=new BinaryTree();
                bt.insert(5);
                bt.insert(3);
                bt.insert(7);
                bt.insert(2);
                bt.insert(4);
                bt.insert(6);
                 
                System.out.println("Level Order Traversal would be ");
                bt.levelOrderTraversal(root);
                }
        }
             

            

           
 
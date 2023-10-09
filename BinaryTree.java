class Node{   
      int value;
      Node left;
      Node right;

      Node(int data){
           this.value=data;
           left=null;
           right=null;
          }
       }

        
      class BinaryTree{
            Node root;
  
            BinaryTree(){
                  this.root=null;
                         }

            void insertValue(int value){
                 root=RecursiveInsertion(root,value);
                             }

            RecursiveInsertion(Node current,int value){
                 if(root==null){
                    return new Node(value);
                         }

                if(value<current.value){
                       current.left=RecursiveInsertion(current.left,value);
                       }

                else if(value>current.value){
                       current.right=RecursiveInsertion(current.right,value);
                                    }

               return current;
                  }

            public boolean Search(int value){
                   return searchRecursive(root,value);
                                             }
           
           boolean searchRecursive(Node current,int value){
                   if(current==null){
                     return false;
                                    }
              
                  if(current.value==value){
                     return true;
                         }
 
                  if(value<current){
                    return searchRecursive(current.left,value);
                                 }

                  else if(value>current){
                     return searchRecursive(current.right,value);
                          }

                     }
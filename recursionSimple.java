class recursion{
     public static void main(String args[]){
            
          nTo1(5);
          System.out.println("---------------------------");
          oneToN(5);

     }


     static void nTo1(int n){
            if(n==1){
               System.out.println(n);
               return;
                       }

            System.out.println(n);
            nTo1(n-1);
                       }


     static void oneToN(int n){
            if(n==1){
               System.out.println(n);
               return;
                       }

            
            oneToN(n-1);
            System.out.println(n);
                       }
                        
                          }
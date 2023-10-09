class factorialRecursion{
       public static void main(String args[]){
               int product=1; 
               factorial(6,product);
               System.out.println(factorial2(6));
              }
 
       static void factorial(int n,int product){

             if(n==1){
               System.out.println(product);
               return;
                   }

              product=product*n;
              
              factorial(n-1,product);
            
             }



     static int factorial2(int n){
            if(n==1){
               return 1;
               }


            return n*factorial2(n-1);
                    }
                        }
              
                
              
               
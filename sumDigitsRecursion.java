class sumOfDigits{
      public static void main(String args[]){
             int n=123;
             int sum=0;
             sumDigits(n,sum);
             System.out.println(sumDigits2(n));
             System.out.println(" product would be "+product(n));

             }

     static void sumDigits(int n,int sum){
            if(n==0){
               System.out.println(sum);
               return;
             }

            int rem=n%10;
            n=n/10;
            sum+=rem;
      
            sumDigits(n,sum);
                   }


     static int sumDigits2(int n){
            if(n==0){
              return 0;
               }
          
           int rem=n%10;
           n=n/10;
          
            
               return rem+sumDigits2(n);

                     }


   static int product(int n){
          
        if(n%10==n){
           return n;
         }

         int rem=n%10;
         n=n/10;

         return rem*product(n);
                           }
                                }
            


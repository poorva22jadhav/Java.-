class recursion1{
      public static void main(String args[]){
               
              int sum=0;
              addNumbers(1,8,sum);
             
              }

      static void addNumbers(int i,int n,int sum){
                  if(i==n){
                     System.out.println(sum);
                     return;
                  }

                   
                 sum+=i;
                 
                 addNumbers(i+1,n,sum);
            
                       }
                           }
             
             


            
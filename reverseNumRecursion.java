class reverseNumRecursion{
      public static void main(String args[]){
      int n=3452;
      int num=0;
      reverse(n,num);
     
     
      

      }


   
      static void reverse(int n,int num){
             
            if(n==0){
               System.out.println(num);
               return;
            } 

             int rem=n%10;
             num=10*num+rem;
             n=n/10;

             reverse(n,num);
         }



      }
               

          

            


 
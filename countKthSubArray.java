class subArrayKth{
      public static void main(String args[]){
             int ar1[]=new int[]{3,4,-2,5,3,-2,8,2,1,4};
             int k=3;
             countSubArray(ar1,k);
             Approach2(ar1,k);
             }

     static void countSubArray(int ar1[],int k){
             int count=0;
             for(int i=0;i<ar1.length;i++){
                 if(i+(k-1)<ar1.length){
                    count++;
                   }
                 }

             System.out.println(count);
               }


   static void Approach2(int ar1[],int k){
        
          int end=k-1;
          int count=0;

          while(end<ar1.length){
                count++;
                end++;
              }

          System.out.println(count);
         }
           

    
           }
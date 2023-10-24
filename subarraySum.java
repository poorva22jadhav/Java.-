class subArrayKth{
      public static void main(String args[]){
             int ar1[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};
             int k=4;
             countSubArray(ar1,k);
             prefixSum(ar1,k);
             slidingWindow(ar1,k);
            
             }

     static void countSubArray(int ar1[],int k){
             int max=Integer.MIN_VALUE;
             for(int i=0;i<ar1.length;i++){
                  int sum=0;
                 for(int j=i;j<=i+(k-1) && j<ar1.length;j++){
                    sum=sum+ar1[j];
                      }
                  
                 if(sum>max){
                    max=sum;
                  }
                 }
                
             System.out.println(max);
               }


   static void prefixSum(int ar1[],int k){
           int prefix[]=new int[ar1.length];
           int max=Integer.MIN_VALUE;
           int sum=0;
           prefix[0]=ar1[0];

           for(int i=1;i<ar1.length;i++){
               prefix[i]=prefix[i-1]+ar1[i];
             }

           int start=0;
           int end=k-1;

           while(end<ar1.length){
                 if(start==0){
                   sum=prefix[end];
                   }
                 else{
                 sum=prefix[end]-prefix[start-1];
                     }

                 if(sum>max){
                    max=sum;
                  }

                 start++;
                 end++;
               }

        System.out.println(max);
            }


     static void slidingWindow(int ar1[],int k){
          
            int max=Integer.MIN_VALUE;
            int sum=0;
            int start=0;
            int end=k;

            for(int i=0;i<k;i++){
                sum=sum+ar1[i];
               }
            while(end<ar1.length){
                if(sum>max){
                 max=sum;
                 }
               
               sum=sum+ar1[end]-ar1[start]; 
               
              

              start++;
              end++;
              
                 }
          System.out.println(max);
            }

           }
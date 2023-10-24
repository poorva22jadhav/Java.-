class printMaxSubArray{
      public static void main(String args[]){
             int ar1[]={-2,1,-3,4,-1,2,1,-5,4};
             int size=ar1.length;
             
             //printSubArray(ar1,size);
             anotherApproach(ar1,size);
             }

     static void printSubArray(int ar1[],int size){
            int sum=0;
            int maxSum=Integer.MIN_VALUE;

            int startInd=-1;
            int endInd=-1;
               
         
            for(int i=0;i<size;i++){
                sum=sum+ar1[i];

                if(sum>maxSum){
                   maxSum=sum;
                   endInd=i;
                 }

               if(sum<0){
                  sum=0;
                  startInd=i+1;
                 }

              }

           for(int i=startInd;i<=endInd;i++){
               System.out.println(ar1[i]);
             }
         }


   static void anotherApproach(int ar1[],int size){
          int sum=0;
          int maxSum=Integer.MIN_VALUE;

          int x=-1;
          int startInd=-1;
          int endInd=-1;

          for(int i=0;i<size;i++){

             if(sum==0){
              x=i;
              }

              sum=sum+ar1[i];
            

              if(sum>maxSum){
                 maxSum=sum;
                 startInd=x;
                 endInd=i;
                }

             if(sum<0){
               sum=0;
             }

             }

            System.out.println(startInd);
            System.out.println(endInd);

         }
      }
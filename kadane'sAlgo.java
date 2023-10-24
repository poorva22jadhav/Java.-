class kadanesAlgo{
      public static void main(String args[]){
             int ar1[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
             int size=ar1.length;
             kadane(ar1,size);
          }
             

            static void kadane(int ar1[],int size){
                   int sum=0;
                   int maxSum=Integer.MIN_VALUE;

                   for(int i=0;i<size;i++){
                       sum=sum+ar1[i];

                       if(sum>maxSum){
                          maxSum=sum;
                            }

                       if(sum<0){
                          sum=0;
                         }

                      }

                    System.out.println(maxSum);
                 }
              }
                   
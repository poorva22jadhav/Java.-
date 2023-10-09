class searchIn2Darr{
      public static void main(String args[]){
             int arr[][]={{111,23,43},
                         {23,4,87},
                         {65,89,7}
                         };
             int target=89;

             searchIn2Darr obj=new searchIn2Darr();
             int[]ans=sort(arr,target);
             System.out.println(ans);
             System.out.println("minimum number in 2D array is "+obj.minNumber(arr));

                              }

     static int[] sort(int array[][],int target){
              
              for(int i=0;i<array.length;i++){
                  for(int j=0;j<array[i].length;j++){
                     if(array[i][j]==target){
                         return new int[]{i,j};
                           }
                     
                             }
                                       }
                     return new int[]{-1,-1};

                      

                                                }



          int minNumber(int array[][]){
             
              int min=array[0][0];
              for(int i=0;i<array.length;i++){
                  for(int j=0;j<array[i].length;j++){
                     if(array[i][j]<min){
                         min=array[i][j];
                           }
                    
                         
                             }
                                       }
                return min;

                      

                                                }
                                                   
                                                              }



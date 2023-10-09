class InsertionSort{
      public static void main(String args[]){
             int array[]={4,5,1,2,3};
             Insertion(array);
             for(int i=0;i<array.length;i++){
                 System.out.println(array[i]);
                   }
              
             }


     static void Insertion(int[]arr){

            for(int i=0;i<arr.length-1;i++){

                for(int j=i+1;j>0;j--){
                    if(arr[j]<arr[j-1]){
                       int temp=arr[j];
                       arr[j]=arr[j-1];
                       arr[j-1]=temp;
                           }
                   else{
                         break;
                                }

                              }
                                      }
                                                    }
                                                          }
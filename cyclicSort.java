
class cyclicSort{
      public static void main(String args[]){
             int arr[]={3,5,2,1,4};
             cyclic(arr);
             for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]);
                         }
              

                                             }


     static void cyclic(int array[]){
                  

                int i=0;
                while(i<array.length){
                  
                     int correct=array[i]-1;
                     if(array[i]!=array[correct]){
                         swap(array,i,correct);
                        }
                     else{
                        i++;
                             }
                                 }
                                         }


     static void swap(int array[],int i,int correct){
            int temp=array[correct];
            array[correct]=array[i];
            array[i]=temp;
                                       }
                                                }
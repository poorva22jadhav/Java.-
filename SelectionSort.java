class SelectionSort{
      public static void main(String args[]){
             int arr[]={12,10,4,5,6,7,9};
              selection(arr);
              for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]);
                     }

            }

      static void selection(int arr[]){
             for(int i=0;i<arr.length;i++){
                 int last=arr.length-1-i;
                 int maxIndex=getMaxIndex(arr,0,last);
                 swap(arr,maxIndex,last);
                 }
                    }

    static int getMaxIndex(int array[],int start,int end){
                int max=0;
                for(int i=start;i<=end;i++){
                    if(array[i]>array[max]){
                      max=i;
                       }
                    
                              }

                    return max;
                                    }


  static void swap(int array[],int first,int last){
              int temp=array[last];
              array[last]=array[first];
              array[first]=temp;
                     }
                             }
                   
                  
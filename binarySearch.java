class BinarySearch{
      public static void main(String args[]){
             int array[]={2,3,4,6,7,8,9,10};
             int array2[]={10,9,8,7,6,5,4,3,2};
             int target=4;
             int target2=2;
             System.out.println(binarySearchAsce(array,target));
             System.out.println(binarySearchDesc(array2,target2));
             }
       
      static int binarySearchAsce(int arr[],int target){
             int start=0;
             int end=arr.length-1;

             while(start<=end){
                  int mid=start+(end-start)/2;
                   
                  if(target>arr[mid]){
                     start=mid+1;
                                 }

                  else if(target<arr[mid]){
                      end=mid-1;
                                 }

                  else{
                      return mid;
                       }

                  
              
                          }
                 return -1;
                                }





           static int binarySearchDesc(int arr[],int target){
             int start=0;
             int end=arr.length-1;

             while(start<=end){
                  int mid=start+(end-start)/2;
                   
                  if(target>arr[mid]){
                      end=mid-1;
                                 }

                  else if(target<arr[mid]){
                      start=mid+1;
                                 }

                  else{
                      return mid;
                       }

                  
              
                          }
                 return -1;
                                }
                             
                                         }
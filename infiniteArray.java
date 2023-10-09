
//Here in this problem we dont know the size of the array so we are performing the binary search on chunks of the array
//we will take first chunk from index 0 to 1 with two elements and will double the size cause in binary searching we take the array then we minimize that array by half
//to apply searching effeciently.
//consider brutforce approach




class infiniteArray{
      public static void main(String args[]){
              int array[]={2,12,23,24,34,35,45,46,47,48,50,52,55,60};  //one drawback we need to take size of chunks which will be factors of 2
              int target=35;
              System.out.println(ans(array,target));
              }


static int ans(int array[],int target){
           int start=0;
           int end=1;

           while(target > array[end]){
                 int temp=end+1;
                 end=end+(end-start+1)*2;
                 start=temp;
                           }

           return BinarySearch(array,target,start,end);
                               }


static int BinarySearch(int array[],int target,int start,int end){

          
           while(start<=end){
                 
                int mid=start+(end-start)/2;

   
                if(target<array[mid]){
                   end=mid-1;
                                      }

                else if(target>array[mid]){
                   start=mid+1;
                                      }

                else{
                      return mid;
                                 }
                                     }

          return -1;

                                           }

                                                 }


       
                 



           
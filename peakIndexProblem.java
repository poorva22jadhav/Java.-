class peakIndexProblem{
      public static void main(String args[]){
             int array[]={0,10,20,30,5,2};
             
             int target=3;
             
             System.out.println(MountainSearch(array));

            }
//Target not given

static int MountainSearch(int array[]){
           
           int start=0;
           int end=array.length-1;

               while(start<end){
                    int mid=start+(end-start)/2;
                    if(array[mid]>array[mid+1]) {
                             end=mid;
                                                }

                    else{
                          start=mid+1;
                                 }

                                         }
                     return start;
                                        }
                                              }


/*  when target is given

      static int findPeakIndex(int array[],int target){
             
             int start=0;
             int end=array.length-1;

             int mid=start+(end-start)/2;

             if(array[mid+1]==target){
                return mid+1;
                                     }

             else if(array[mid-1]==target){
                 return mid-1;
                                          }

             else if(array[mid]==target){
                   return mid;
                                        }
            else{
                   return -1;
                          }



          

                                                  }

*/










                                                       
         


     
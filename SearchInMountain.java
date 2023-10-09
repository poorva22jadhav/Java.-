class SearchInMountain{
      public static void main(String args[]){
             int array[]={1,2,3,4,5,3,1,0};
             int target=0;
             int peakIndex=(findPeakIndex(array));
            
             int start=0;
             int end=peakIndex;
              
             int firstTry=OrderAgnosticBS(array,target,start,end);
            
             if(firstTry!=-1){
                 System.out.println(OrderAgnosticBS(array,target,start,end));
                
                   }
            else{
                start=peakIndex+1;
                end=array.length-1;
                System.out.println(OrderAgnosticBS(array,target,start,end));
                
             
                       }
                             }


     static int OrderAgnosticBS(int array[],int target,int start,int end){
           
            
                    

                    while(start<=end){
                         
                          int mid=start+(end-start)/2;

                          if(target==array[mid]){
                                   return mid;
                                }

                          if(array[start]<array[end]){
                                   if(target<array[mid]){
                                       end=mid-1;
                                     }
                                   
                                   else if(target>array[mid]){
                                          start=mid+1;
                                       }
                          }
                                 
                          
                         else{
                                if(target<array[mid]){
                                   start=mid+1;
                                   }
                                else if(target>array[mid]){
                                     end=mid-1;
                                       }

                                                }
                                                     }

                         return -1;
                                     }
                          





    static int findPeakIndex(int array[]){
               int start=0;
               int end=array.length-1;


               while(start<end){
                     int mid=start+(end-start)/2;

                     if(array[mid]>array[mid+1]){
                       end=mid;
                       }

                     else{
                       start=mid+1;
                     }
                           }
              return start;
                               } 
                                      }


     
class searchRange{
      public static void main (String args[]){
             int array[]={12,21,32,34,54,65,-9};
             int target=54;
             int start=2;
             int end=6;
             int answer=rangeSearch(array,target,start,end);
             System.out.println(answer);
             }
       
      static int rangeSearch(int arr[],int target,int start,int end){
                 if(arr.length==0){
                    return 1;
                    }
                 
                 for(int i=start;i<=end;i++){
                     if(arr[i]==target){
                        return i;
                        }
                               }
                     return -1;
                                                }  }
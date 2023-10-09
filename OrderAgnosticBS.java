class OrderAgnostic{
      public static void main(String args[]){
             int array[]={12,12,13,45,67,89,90};
             int target=45;
             int array2[]={90,89,87,56,45,34,32,21};
             int target2=56;
             
             System.out.println(BinarySearch(array2,target2));
                 }


      static int BinarySearch(int[]array,int target){
             int start=0;
             int end=array.length-1;
           /*  boolean IsAsce;
                     if(array[start]<array[end]){
                        IsAsce=true;
                        }
                     else{
                        IsAsce=false;
                        }


             //boolean IsAsce=array[start]<array[end];

         */

            while(start<=end){
                  int mid=start+(end-start)/2;

                  if(target==array[mid]){
                     return mid;
                                         }

                  if(array[start]<array[end]){

                     if(target>array[mid]){
                        start=mid+1;
                        }
                     else if(target<array[mid]){
                          end=mid-1;
                           }
                                 }


                  else{
                     if(target>array[mid]){
                          end=mid-1;
                        }
                     else if(target<array[mid]){
                          start=mid+1;
                           }

                     }
                         }
                    
                 return -1;
                               }
                                      }


             
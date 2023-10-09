class linearSearch{
      public static void main(String args[]){

            int array[]={10,20,32,45,21,-34,87};
            int target=32;
            int ans=linearSearch(array,target);
            System.out.println(ans);
            }         

             static int linearSearch(int arr[],int target){
                    if(arr.length == 0){
                       return -1;
                                       }

                    for(int i=0;i<arr.length;i++){
                       
                        if(arr[i] ==target){
                            return i;
                                          }
                                                  }
                    //this line will execute if none of the above return statements above have executed
                    //hence the target not found
                    return -1;
                                                      }
                                                           }
                          
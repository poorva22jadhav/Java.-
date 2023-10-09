class CeilingProblem{
      public static void main(String args[]){
                    int array[]={2,3,5,9,14,16,18};
                    int target=6;
                    System.out.println("Ceiling Number: "+CeilingFunc(array,target));
                    System.out.println("Flooring Number: "+FlooringFunc(array,target));
                    }


     static int CeilingFunc(int array[],int target){
                    int start=0;
                    int end=array.length-1;

                while(start<=end){

                    int mid=start+(end-start)/2;

                    if(target<array[mid]){
                      end=mid-1;
                                          }

                    else if(target>array[mid]){
                         start=mid+1;
                           }

                    else{
                          return array[mid];
                        }
                             }

                return array[start];
                                  }
                                            
  static int FlooringFunc(int array[],int target){
                    int start=0;
                    int end=array.length-1;

                while(start<=end){

                    int mid=start+(end-start)/2;

                    if(target<array[mid]){
                      end=mid-1;
                                          }

                    else if(target>array[mid]){
                         start=mid+1;
                           }

                    else{
                          return array[mid];
                        }
                             }

                return array[end];
                                  }
                                            }
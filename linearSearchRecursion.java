class linearSearchRecursion{
      public static void main(String args[]){
             int ar1[]={1,2,4,5,6,8,9};
             int target=9;
             System.out.println(linearSearch(ar1,target,0));
       
             }


      static int linearSearch(int ar1[],int target,int i){
              if(i>ar1.length-1){
               return -1;
               }

             if(ar1[i]==target){
                return i;
                  }

            
               

              return linearSearch(ar1,target,i+1);
                    }
                          }
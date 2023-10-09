class recursion{
      public static void main (String args[]){
             int ar1[]={1,2,4,6,7,8,9};
              int i=0; 
             sortedOrnot(ar1,i);
             System.out.println(sortedOrnot2(ar1,i));

             }

      static void sortedOrnot(int ar1[],int i){
            
             if(i==ar1.length-1){
                 System.out.println("array is sorted");
                 return;
               }
              
            
              
             if(ar1[i]<ar1[i+1]){
                 sortedOrnot(ar1,i+1);
             }

              else{
                 System.out.println("Array is not sorted");
                   }

                            }


       static boolean sortedOrnot2(int ar1[],int i){
              if(i==ar1.length-1){
                 return true;
               }

              return ar1[i]<ar1[i+1] && sortedOrnot2(ar1,i+1);
                    }
                                 }

             

             

             

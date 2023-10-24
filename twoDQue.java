+class twoD{
      public static void main(String args[]){
             int ar1[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
             
             //printArray1(ar1);
             //leftDiagonal(ar1);
               rightDiagonal(ar1);
             }



 static void printArray1(int ar1[][]){
             int sum=0;
             for(int i=0;i<ar1.length;i++){
                 
                 for(int j=0;j<ar1[i].length;j++){
                     sum=sum+ar1[i][j];
                    }
                 
               }

              System.out.println(sum);
            }

      static void printArray2(int ar1[][]){
             
             for(int i=0;i<ar1[i].length;i++){
                 int sum=0;
                 for(int j=0;j<ar1.length;j++){
                     sum=sum+ar1[j][i];
                    }
                 System.out.println(sum);
               }
            }


      static void leftDiagonal(int ar1[][]){
             for(int i=0;i<ar1[i].length;i++){
                
                    
                      System.out.println(ar1[i][i]);
                   
                  
               }
      }


     static void rightDiagonal(int ar1[][]){
            int i=0;
            int j=ar1[i].length-1;

            while(i<ar1.length && j>=0){
                  System.out.println(ar1[i][j]);
                  i++;
                  j--;
                }
           }
 }
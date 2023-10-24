class TransposeMatrix{
      public static void main(String args[]){
              int ar1[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
              Transpose(ar1);
              }

      static void Transpose(int ar1[][]){
               int N=ar1.length;
               int M=ar1[0].length;
               for(int i=0;i<M;i++){
                  for(int j=i;j<M;j++){
                      int temp=ar1[i][j];
                      ar1[i][j]=ar1[j][i];
                      ar1[j][i]=temp;
                    }
                }

               for(int i=0;i<ar1.length;i++){
                   for(int j=0;j<ar1[i].length;j++){
                      System.out.print(ar1[i][j]+" ");
                      }

                   System.out.println();
                 }
             }

       }
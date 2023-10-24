class SpiralBoundaryMatrix{
      public static void main(String args[]){
             int ar1[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
            SpiralBoundary(ar1);
           }

     static void SpiralBoundary(int ar1[][]){
             int i=0;
             int j=0;
             int N=ar1.length-1;

             while(N>1){
  
            for(int x=0;x<N;x++){
                System.out.print(ar1[i][j]+" ");
                j++;
               }
 
            System.out.println();

            for(int x=0;x<N;x++){
                System.out.print(ar1[i][j]+" ");
                i++;
                }

           
             System.out.println();

            for(int x=0;x<N;x++){
                System.out.print(ar1[i][j]+" ");
                j--;
             }

             System.out.println();

                

            for(int x=0;x<N;x++){
                System.out.print(ar1[i][j]+" ");
                i--;
             }

            System.out.println();
            N=N-2;
            i=1;
            j=1;


           }

        }
    }

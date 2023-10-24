class TwoDPattern{
      public static void main(String args[]){
             int ar1[][]={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
             
             Approach(ar1);
             }

     static void Approach(int ar1[][]){
            int N=4;
            int M=6;

            for(int j=M-1;j>=0;j--){
                int i=0;
                int y=j;

                while(y>=0 && i<N){
                     System.out.print(ar1[i][y]+" ");
                     i++;
                     y--;
                   }

                System.out.println();
               }

           }

       }

            
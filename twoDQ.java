class twoDque{
      public static void main(String args[]){
             int ar1[][]=new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
             Approach(ar1);
            
             }

     static void Approach(int ar1[][]){
               
                 
                
                   int i=0;
                   int size2=ar1[i].length-1;
                   int size=ar1.length;
                 int temp=1;
                 int j=size2;

                 while(j >= 0 && i < size){
                       System.out.print(ar1[i][j]+" ");
                       i++;
                       j--;


                                                
                       if(i==size){
                          i=0;
                          j=size2-temp;
                          temp++;
                          System.out.println();
                       } 

                      
                     }
             
              }


    static void Approach2(int ar1[][]){
           



            
             
    
          }
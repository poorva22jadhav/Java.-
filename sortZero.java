class zeroOneTwo{
      public static void main(String args[]){
             int ar1[]={2,0,1,2,0,1};
             int size=ar1.length;
             sort(ar1,size);

             }

    static void sort(int ar1[],int size){
            int j=0;
            int k=0;
            while(k<2){
            int i=0;
            for(i=0;i<size;i++){
              
                if(ar1[i]==k){
                    int temp=ar1[j];
                    ar1[j]=ar1[i];
                    ar1[i]=temp;
                    j++;
                    
                   }
                      }
              k++;
              
                         }
               
                  

                 
               
         for(int f=0;f<size;f++){
            System.out.println(ar1[f]);
                }
                        }
                           }
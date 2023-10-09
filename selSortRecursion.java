class selSortRecursion{
       public static void main(String args[]){
              int ar1[]={2,5,3,1,6,7,10,8};
              int size=ar1.length;
           

              
             selectionSort2(ar1,size);

               for(int element:ar1){
              System.out.println(element);
              }
             
 System.out.println("-----------");
              selectionSort(ar1,size);

             System.out.println("After sorting");
               for(int element2:ar1){
              System.out.println(element2);
              }

         


              }
                

      static void selectionSort(int ar1[], int size) {
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (ar1[j] > ar1[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = ar1[i];
            ar1[i] = ar1[maxIndex];
            ar1[maxIndex] = temp;
        }
    }
       static void selectionSort2(int ar1[],int size){
             int max=0;
             for(int i=0;i<size;i++){
              
               for(int j=0;j<size;j++){  
                 
                 if(ar1[j]>ar1[max]){
                    max=j;
                  }
              
                }
              int temp=ar1[size-1];
              ar1[size-1]=ar1[max];
              ar1[max]=temp;
              size--;
              max=0;
             
            }

          

               }
                  }                
            
             
             
             

             
              
                 









                
            
             
             
             

             
              
                 
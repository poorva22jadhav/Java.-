class minAndmax{
       public static void main(String[]args){
              int array[]={10,21,23,43,45,-8,-3};
              int min=minNumber(array);
              int max=maxNumber(array);
              System.out.println(min);
              System.out.println(max);
           
              }


       static int minNumber(int[] arr){
              int min=arr[0];
              for(int i=1;i<arr.length;i++){
                  
                  if(arr[i]<min){
                      min=arr[i];
                     }
               
                             }
               return min;
                              }
                                    



 static int maxNumber(int[] arr){
              int max=arr[0];
              for(int i=1;i<arr.length;i++){
                  
                  if(arr[i]>max){
                      max=arr[i];
                     }
               
                             }
               return max;
                              }
                                    }
              
              

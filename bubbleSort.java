class Bubblesort{

      public static void main(String args[]){
             
             int arr[]={5,4,3,2,1,0};
             Bubble(arr);
             for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
                    }
    }



    static void Bubble(int arr[]){
           

           for(int i=0;i<arr.length;i++){
              boolean swapped=false;

               for(int j=1;j<arr.length-i;j++){

                  if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                                     }


                                             }

               if(!swapped){                                 //if array is alredy sorted
                  break;
                           }
                                                      }
                                                             }
                                                                     }
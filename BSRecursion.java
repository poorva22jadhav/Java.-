class BSusingRecursion{
      public static void main(String args[]){
             int ar1[]={3,4,5,6,7,8,10};
             int target=6;
             int start=0;
             int end=ar1.length-1;
             System.out.println(search(ar1,target,start,end));
             

             }


     static int search(int ar1[],int target,int s,int e){
              
                 if(s>e){
                    return -1;
                 }

                  int m=s+(e-s)/2;

                  if(ar1[m]==target){
                     return m;
                    }

                  if(ar1[m]<target){
                       return search(ar1,target,m+1,e);
                        }
              
                 return search(ar1,target,s,e-1);
                                       } 
                                                }
                  
                  

                  
class countEven{
      
         public static void main(String args[]){
                 int array[]={0,235,4399,-78};
                 
                 System.out.println(findNumbers(array));
                  }

        static int findNumbers(int[]nums){
               int count=0;
               for(int num:nums){
                       if(even(num)){
                          count++;
                      }
                            }
               return count;
                                }



        static boolean even(int num){
              int noOfDigits = digits(num);
                   if(noOfDigits%2==0){
                         return true;
                                       }
                   else{
                          return false;
                       }

                              }




        static int digits(int num){
               if(num==0){
                  return 1;
                          }

               if(num<0){
                  num=num*-1;
                         }

                 int count=0;
               while(num>0){
                    
                    num=num/10;
                    count++;}

               return count;
                                }
                                       }
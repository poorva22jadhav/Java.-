class CountEven{
      public static void main(String args[]){

              int array[]={10,2,333,4325,765456,98};
              findNumbers(array);
             }

      static void findNumbers(int[]nums){
             
             
             for(int i=0;i<nums.length;i++){
                 int count=0;
                 int number=nums[i];
                 while(number!=0){
                       number=number/10;
                       count++;
                    }
                 if(count%2==0){
                    System.out.println(nums[i] +" contains " +count+ " digits");
                    }
                          }
                                } }
             
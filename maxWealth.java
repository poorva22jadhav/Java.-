class maxWealth{
      public static void main(String args[]){
             int array[][]={{12,21,42},{3,10,8},{23,88,76}};
             maxWealth(array);
             }

     static void maxWealth(int num[][]){
            int temp=0;
            for(int i=0;i<num.length;i++){
                int sum=0;
                for(int j=0;j<num[i].length;j++){
                    sum=sum+num[i][j];
                    }
                if(sum > temp){
                  temp=sum;
                     } 
                         } 
                System.out.println("maxwealth is " +temp);
                               }

                                     }
                     
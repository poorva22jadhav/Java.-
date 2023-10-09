class recursion{
      public static void main(String args[]){
             int n=5; 
             printNumber(n);
             printNumberIncrement(1);
              
              }

     static void printNumber(int n){
            if(n==0){
              return;
                }
            System.out.println(n);
            printNumber(n-1);
              }
                 
    
    static void printNumberIncrement(int n){
           if(n==6){
              return;
             }

           System.out.println(n);
           printNumberIncrement(n+1); 
                }
                    }

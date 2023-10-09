class patternRecursion{
     public static void main(String args[]){
            pattern(0);
            System.out.println("------");
            pattern2(4);
            System.out.println("------");
            pattern3(4,0);
            }

     static void pattern(int i){

            if(i!=5){
            
            int j=0;
            while(j<=i){
                  System.out.print("* ");
                  j++;
                  }
           System.out.println();
           pattern(i+1);
                       }

           }


     static void pattern2(int i){

            if(i>=0){
            
            int j=0;
            while(j<=i){
                  System.out.print("* ");
                  j++;
                  }
           System.out.println();
           pattern2(i-1);
                       }

           }



    static void pattern3(int r, int c){

           if(r==0){
              return;
           }

          if(r>c){
            System.out.print("* ");
            pattern3(r,c+1);
                  }
           
          else {
             System.out.println();
             pattern3(r-1,0);
           }
                 }

           
               }
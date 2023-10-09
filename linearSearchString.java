class linearSearchStr{
      public static void main(String[]args){
             String name="purva";
             char value='p';
             System.out.println(searchStr(name,value));

       }


     static boolean searchStr(String name,char str){
            if(name.length()== 0){
               return false;
               }

           for(int i=0;i<name.length();i++){
               if(str==name.charAt(i)){
                 return true;
                 }
                     }
                         return false;
                                    }    }
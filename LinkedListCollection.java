import java.util.LinkedList;
import java.util.List;
import java.util.Collection;


class LLCollection{
      public static void main(String args[]){

     Collection<Integer> list=new LinkedList<>();
     
     list.add(10);
     list.add(20);
     list.add(30);
     

    for(Integer element:list){
       System.out.print(element+" ");
          }

    

    int size=list.size();
    System.out.println(size);

    list.add(40);
   

    System.out.println("Elements would be "+list);
 
   }
}

    

     
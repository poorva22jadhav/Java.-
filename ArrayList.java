import java.util.ArrayList;
import java.util.List;


  class ListExample{
       public static void main(String args[]){
       // Create an ArrayList (a class implementing List interface)
              List<String> names=new ArrayList<>();

           names.add("Poorva");
           names.add("Riya");
           names.add("Roshani");

           int size=names.size();

           System.out.println("Elements in array");
           for(int i=0;i<size;i++){
               System.out.print(names.get(i)+" ");
                }

           boolean doContain=names.contains("Riya");
           System.out.println("Contains riya? "+doContain);

           System.out.println("Element at index 2 is "+names.get(2));
           
           names.remove("Roshani");
           //Iterate over arraylist using toString(),
               
           System.out.println("Elements in arrayList are "+names);

           //The toString() method is a method defined in the Object class in Java. 
           // It is inherited by all classes in Java, including user-defined classes. 
           // The toString() method is used to get a string representation of an object, 
           //which is useful for displaying the object's information in a human-readable format
           //public class Person {
           // public static void main(String[] args) {
           // Person person = new Person();
           //System.out.println(person); // Output: Person@4aa298b7
   
           }
              }
              
               
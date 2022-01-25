package printer;
public class Printer {
    public static void main(String[] args) {
     Integer[] intArray = {1,2,3,7,8,5,9};
     String[] stringArray = {"one","two","three","five"};
     printArray(intArray);
     printArray(stringArray);
    }

   public static <T> void printArray(T[] arr){
       for(T element : arr) System.out.println(element);
   }
    
}

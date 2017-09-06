package ExceptionString;


public class WordsInArray {

   public String find(String [] strArr, String element) {
       for (int i = 0; i <strArr.length ; i++) {
           if (element.equals(strArr[i])){
               return element;
           }

       }
       throw new ArrayStoreException("Nie ma takiego elelemntu");
   }
}

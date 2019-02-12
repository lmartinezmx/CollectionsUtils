import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Utilidades para colecciones");
        iterateAList();

    }

    private static void iterateAList(){

        List<String> myStringList;
        myStringList = Arrays.asList("one","two","three");
        List dynamicList = new ArrayList(myStringList);

        Iterator<String> myItarator = dynamicList.iterator();
        ListIterator<String> myListIterator = dynamicList.listIterator(dynamicList.size());

        //printing the list
        dynamicList.forEach(System.out::println);
        //printing the list direct by iterator *** Iterator.hasnext will return FALSE
        //myItarator.forEachRemaining(System.out::println);

        //iterating by iterator, and removing
        while(myItarator.hasNext()){
            String next = myItarator.next();
            System.out.println("before remove element: ");
            dynamicList.forEach(System.out::println);
            System.out.println("next element: "+next);
            myItarator.remove();
            System.out.println("afeter remove element: ");
            dynamicList.forEach(System.out::println);
        }
        //ooor
        //myItarator.forEachRemaining(System.out::println);
    }
}

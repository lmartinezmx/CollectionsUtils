import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Utilidades para colecciones");
        //iterateAListNext();
        //iterateAListPrevious();
        fullInterate();

    }

    private static void fullInterate() {

        List<String> myStringList;
        myStringList = Arrays.asList("one","two","REPLACE_ME","three");
        List dynamicList = new ArrayList(myStringList);

        System.out.println("First list: ");
        dynamicList.forEach(System.out::println);
        ListIterator<String> listIterator = dynamicList.listIterator();
        while(listIterator.hasNext()) {
            String nextWithIndex = (String) dynamicList.get(listIterator.nextIndex());
            System.out.println("nextWithIndex: "+nextWithIndex);
            String next = listIterator.next();
            System.out.println("next: "+next);
            if("REPLACE_ME".equals(next)) {
                listIterator.set("REPLACED");
            }
        }
        System.out.println("After replace: ");
        dynamicList.forEach(System.out::println);
        listIterator.add("NEW");
        System.out.println("After add: ");
        dynamicList.forEach(System.out::println);
        while(listIterator.hasPrevious()) {
            String previousWithIndex
                    = (String) dynamicList.get(listIterator.previousIndex());
            System.out.println("previousWithIndex: "+previousWithIndex);
            String previous = listIterator.previous();
            System.out.println("previous: "+previous);
        }
        System.out.println("After all: ");
        dynamicList.forEach(System.out::println);
    }

    private static void iterateAListNext(){

        List<String> myStringList;
        myStringList = Arrays.asList("one","two","three");
        List dynamicList = new ArrayList(myStringList);

        Iterator<String> myItarator = dynamicList.iterator();

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
    }

    private static void iterateAListPrevious(){

        List<String> myStringList;
        myStringList = Arrays.asList("one","two","three");
        List dynamicList = new ArrayList(myStringList);

        ListIterator<String> myListIterator = dynamicList.listIterator(dynamicList.size());

        while(myListIterator.hasPrevious()){
            String previous = myListIterator.previous();
            //infinite loop :D
            //myListIterator.add("another_"+myListIterator.previousIndex());
            System.out.println("previous element: "+previous);
            dynamicList.forEach(System.out::println);
        }


    }
}

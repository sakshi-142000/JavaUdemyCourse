import java.util.*;

public class Main{
    public static void main(String[] args){
        //List Interface

        List<String> arrayList = new ArrayList<>();
        arrayList.add("first element");
        arrayList.add("second");

        System.out.println("ArrayList: "+ arrayList);


        LinkedList<String> linkedList= new LinkedList<>();

        linkedList.add("first ll");
        linkedList.add("second ll");

        System.out.println("LinkedList: "+ linkedList);

        linkedList.addFirst("newFirst");
        linkedList.addLast("newLast");

        // arrayList.removeElement("first element");//invalid, only available in vector
        
        // we have two overridden method, remove(Object o) and remove(int idx)
        // compiler matches by the data type

        arrayList.remove(0);
        arrayList.remove("first element");

        System.out.println(arrayList);
        System.out.println(linkedList);



    }
}
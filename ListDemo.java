import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

                list.add("A");
        list.add("B");
        System.out.println("After add(): " + list);

                System.out.println("Size: " + list.size());

               System.out.println("Is empty? " + list.isEmpty());

               System.out.println("Contains B? " + list.contains("B"));

               Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

                ArrayList<String> newList = new ArrayList<>();
        newList.add("C");
        newList.add("D");
        list.addAll(newList);
        System.out.println("After addAll(): " + list);

                list.remove("A");
        System.out.println("After remove(): " + list);

              ArrayList<String> removeList = new ArrayList<>();
        removeList.add("C");
        removeList.add("D");
        list.removeAll(removeList);
        System.out.println("After removeAll(): " + list);
    }
}

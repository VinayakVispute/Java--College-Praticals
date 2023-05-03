import java.util.LinkedList;


public class pratical33{
    public static void main(String[] vinayak)
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // Print the contents of the LinkedList
        System.out.println("LinkedList: " + list);

        // Add an element to the beginning of the LinkedList
        list.addFirst("David");
        System.out.println("After adding first element: " + list);

        // Add an element to the end of the LinkedList
        list.addLast("Eve");
        System.out.println("After adding last element: " + list);

        // Remove the first element from the LinkedList
        list.removeFirst();
        System.out.println("After removing first element: " + list);

        // Remove the last element from the LinkedList
        list.removeLast();
        System.out.println("After removing last element: " + list);   
    }
}


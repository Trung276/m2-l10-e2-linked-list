import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("no1");
        linkedList.add("no2");
        linkedList.add(2, "no3");
        linkedList.addFirst("no4");
        linkedList.addLast("no5");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.remove("no3");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.clone());
        System.out.println(linkedList.contains("no1"));
        System.out.println(linkedList.indexOf("no5"));
        linkedList.clear();
        System.out.println(linkedList);
    }
}

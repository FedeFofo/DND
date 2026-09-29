public class SinglyLinkedListTester {
    public static void main(String[] args) {
        String[] test = new String[3];
        test[0] = "AA";
        test[1] = "BB";
        test[2] = "CC";
        
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>(test);
        System.out.println(testList.toString());


        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
        list.add("A");
        list.add(null);
        list.add("B");
        System.out.println(list.indexOf(null));
        System.out.println(list.contains(null));
        System.out.println(list.remove(null));
    }
}

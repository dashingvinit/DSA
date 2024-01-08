public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(15);
        list.insert(25);
        list.insert(35);
        list.insert(45);
        list.insert(55);
        list.insertAtStart(5);
        list.insertAt(6, 65);
        list.delete(2);

        list.show();


    }
}

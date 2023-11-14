import java.util.HashSet;

public class RemoveDuplicatesInLL {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList(1);
        mylist.append(2);
        mylist.append(3);
        mylist.append(1);
        mylist.append(4);
        mylist.append(2);
        mylist.append(5);
        // 1 2 3 1 4 2 5
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(mylist.head.value);
        LinkedList.Node current = mylist.head;
        LinkedList.Node nextNode = current.next;
        while (nextNode!=null){
            if (mySet.contains(nextNode.value)){
                current.next =  nextNode.next;
                nextNode = current.next;
                continue;
            }else {
                mySet.add(nextNode.value);
            }
            nextNode = nextNode.next;
            current = current.next;
        }

        mylist.printList();
    }
}

public class PartitionTheLinkedList {

    public LinkedList.Node partition(LinkedList.Node head, int x) {
        if(head==null) return null;
        LinkedList.Node left = null;
        LinkedList.Node right = null;
        LinkedList.Node current = head;
        LinkedList.Node temp = head;
        LinkedList.Node rightHead = null;

        while (current != null){
            if (current.value < x){
                temp = current.next;
                if (left==null){
                    head = current;
                    left = current;
                    current.next = null;
                    current = temp;
                }else {
                    left.next = current;
                    current.next = null;
                    current = temp;
                    left = left.next;
                }
            }else {
                temp = current.next;
                if (right==null){
                    rightHead = current;
                    right = current;
                    current.next = null;
                    current = temp;
                }else {
                    right.next = current;
                    current.next = null;
                    current = temp;
                    right = right.next;
                }
            }
        }

        if(left==null) return rightHead;
        if(rightHead==null) return head;
        left.next = rightHead;
        return head;
    }
    
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(1);
        myList.append(1);
        myList.append(3);
        myList.append(2);
        myList.append(5);
        myList.append(2);
        
    }
}

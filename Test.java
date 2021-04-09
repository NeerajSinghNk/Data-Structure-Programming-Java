
import java.util.Scanner;

//Here we have create a Node class and create a getter & setter method for accessing instance...
class Node {

    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }

    public void setData(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }

    public int getData() {
        return (data);
    }

    public Node getNext() {
        return (next);
    }

}

class LinkedList {

    private int size;
    private Node start;

    public LinkedList() {
        size = 0;
        start = null;
    }

//******************Insert data at first position*************************
    public void insertAtFirst(int val) {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;
    }

//**************************Insert data at last position********************************************
    public void insertAtLast(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);
        t = start;
        if (t == null) {
            start = n;
        } else {
            while (t.getNext() != null) {
                t = t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }

//*****************************Insert data at given position**********************************************
    public void insertAtPos(int val, int pos) {
        if (pos == 1) {
            insertAtFirst(val);
        } else if (pos == size + 1) {
            insertAtLast(val);
        } else {
            Node n, t;
            n = new Node(val, null);
            t = start;
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;

        }
    }

//************************Delete at first position******************************
    public void deleteFirst() {
        if (start == null) {
            System.out.println("List is already null");
        } else {
            start = start.getNext();
            size--;
        }
    }

//************************Delete at last position******************************
//    public void deleteLast() {
//        if (start == null) {
//            System.out.println("List is already null");
//        } else if (size == 1) {
//            start = null;
//            size--;
//        } else {
//            Node t;
//            t = start;
//            for (int i = 1; i < size - 1; i++) {
//                t.getNext();
//            }
//            t.setNext();
//            size--;
//        }
//    }

//************************Delete at given position******************************
    public void deleteAtPos(int pos) {
        if (start == null) {
            System.out.println("List is already null");
        } else if (pos > size || pos < 1) {
            System.out.println("Invalid Position");
        } else if (pos == 1) {
            deleteFirst();
        } else if (pos == size) {
//            deleteLast();
        } else {
            Node t, t1;//t1 save a while loop
            t = start;
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;

        }
    }

//*******************Check if list is empty or not****************************
    public boolean isEmpty() {
        if (start == null) {
            return (true);
        } else {
            return (false);
        }
    }

//********************View the list*******************************
    public void viewList() {
        Node t;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            t = start;
            for (int i = 1; i <= size; i++) {
                t = t.getNext();
            }
        }
    }

//******************get the size of the list**************************
    public int getListSize() {
        return (size);
    }

}

//********************Driver Code**************************
public class Test {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        //System.out.println("Please choose any one option...");
        boolean flag = true;

        while (flag) {
            System.out.println("\n");
            System.out.println("Please choose any one option...");
            System.out.println("Insert at First.");
            System.out.println("Insert at last.");
            System.out.println("Insert at any position.");
            System.out.println("Delete at first.");
            System.out.println("Delete at last.");
            System.out.println("Delete at any position.");
            System.out.println("View List.");
            //System.out.println("Please choose any one option...");
            int val, pos, ch;
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;
                case 2:
                    val = sc.nextInt();
                    list.insertAtLast(val);
                    break;
                case 3:
                    System.out.println("Insert the position.");
                    pos = sc.nextInt();
                    System.out.println("Insert value.");
                    val = sc.nextInt();
                    list.insertAtPos(val, pos);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
//                    list.deleteLast();
                    break;
                case 6:
                    System.out.println("Insert the position.");
                    pos = sc.nextInt();
                    list.deleteAtPos(pos);
                    break;
                case 7:
                    list.viewList();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        }

    }
}

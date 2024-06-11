import java.util.*;

/**
 * @author K
 */
public class Main {
    public class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    class List {
        int size;
        Node dummyhead;

        List() {
            size = 0;
            dummyhead = new Node(-1, null);
        }

        private void checkPositionIndex(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException(index);
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void addFirst(int val) {
            add(0, val);
        }

        public void add(int index, int val) {
            //插入空链表和插入链表末尾时index==size
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException(index);
            }
            Node pre = dummyhead;
            while (index-- > 0) {
                pre = pre.next;
            }
            pre.next = new Node(val, pre.next);
            size++;
        }

        public int get(int index) {
            checkPositionIndex(index);
            Node p = dummyhead.next;
            while (index-- > 0) {
                p = p.next;
            }
            return p.val;
        }

        public void remove(int index) {
            checkPositionIndex(index);
            Node pre = dummyhead;
            while (index-- > 0) {
                pre = pre.next;
            }
            pre.next = pre.next.next;
            size--;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node p = dummyhead.next;
            while (p != null) {
                sb.append(p.val + " ");
                p = p.next;
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>(); //自带链表
//        List list = new Main().new List(); //手写链表
        int n = in.nextInt();
        while (n-- > 0) {
            int i = in.nextInt();
            list.addFirst(i); //初始化链表 从头部插入
        }
        int m = in.nextInt();
        while (m-- > 0) {
            String s = in.next();
            switch (s) {
                case "get":
                    try {
                        int a = in.nextInt();
                        System.out.println(list.get(a - 1));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("get fail");
                    }
                    break;
                case "delete":
                    try {
                        int a = in.nextInt();
                        list.remove(a - 1);
                        System.out.println("delete OK");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("delete fail");
                    }
                    break;
                case "insert":
                    try {
                        int a = in.nextInt();
                        int e = in.nextInt();
                        list.add(a - 1, e);
                        System.out.println("insert OK");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("insert fail");
                    }
                    break;
                case "show":
                    System.out.println(list.isEmpty() ? "Link list is empty" : list.toString());
                    break;
            }
        }
    }
}
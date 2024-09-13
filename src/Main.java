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

        public void reverse() {
            Node p = dummyhead.next;
            if (p==null || p.next==null)return;
            Stack<Integer> s = new Stack<>();
            while (p.next != null) {
                s.push(p.val);
            }
            while (!s.isEmpty()) {
                Integer peek = s.peek();

                
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>(); //自带链表
//        List list = new Main().new List(); //手写链表
        while (true){
            int n = in.nextInt();
            if (n==0) {
                System.out.println("list is empty");
                break;
            }
            while (n-- > 0) {
                int i = in.nextInt();
                list.addFirst(i); //初始化链表 从头部插入



            }
        }


        }
}
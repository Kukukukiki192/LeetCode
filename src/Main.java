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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node head = new Node();
        while (n-- > 0) {
            int i = in.nextInt();
            //初始化链表
        }
        int m = in.nextInt();
        in.nextLine();//读取\n 将cursor放到下一行
        while (m-- > 0) {
            String line = in.nextLine();
            String[] str = line.split(" ");

        }
        System.out.println();

    }
}
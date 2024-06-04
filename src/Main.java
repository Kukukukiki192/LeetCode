import java.util.*;

/**
 * @author K
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < str.length(); i += 2) {
                s.append(str.charAt(i + 1));
                s.append(str.charAt(i));
            }
            System.out.println(s);
        }
    }
}
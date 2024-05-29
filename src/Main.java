import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int ans = 0;
            while (n > 0) {
                int t = n % 10;
                if (t % 2 == 0) ans += t;
                n /= 10;
            }
            System.out.println(ans + "\n");
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 4);
        map.put("B", 3);
        map.put("C", 2);
        map.put("D", 1);
        map.put("F", 0);
        while (in.hasNext()) {
            String[] s = in.nextLine().split(" ");
            double sum = 0;
            for (String c : s) {
                Integer gpa = map.get(c);
                if (gpa == null) { //not in {A,B,C,D,F}
                    System.out.println("Unknown");
                    break;
                }
                sum += gpa;
            }
            double avg = sum / s.length;
            if (avg > 0) System.out.printf("%.2f", avg);
        }
    }
}
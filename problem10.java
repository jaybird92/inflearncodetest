import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem = in.next();
        String key = in.next();

        int[] distance = new int[problem.length()];

        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < problem.length(); i++) {
            if (String.valueOf(problem.charAt(i)).equals(key)) {
                target.add(i);
            }
        }

        for (int i = 0; i < problem.length(); i++) {
            int min = problem.length();
            for (int j = 0; j < target.size(); j++) {
                int tmp = Math.abs(i - target.get(j));
                if (tmp < min) {
                    min = tmp;
                }
            }
            distance[i] = min;
        }

        for (int i = 0; i < problem.length(); i++) {
            System.out.print(distance[i] + " ");
        }

    }

}
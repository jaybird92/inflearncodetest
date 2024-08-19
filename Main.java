import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();

        String problem = in.next();

        HashMap<Character, Integer> candidate = new HashMap<>();
        candidate.put('A', 0);
        candidate.put('B', 0);
        candidate.put('C', 0);
        candidate.put('D', 0);
        candidate.put('E', 0);

//        System.out.println("problem = " + problem);

        for (int i = 0; i < length; i++) {
//            System.out.println("problem.charAt(i) = " + problem.charAt(i));
//            System.out.println("candidate.get(problem.charAt(i)) = " + candidate.get(problem.charAt(i)));
            candidate.put(problem.charAt(i), candidate.get(problem.charAt(i)) + 1);
        }

        int max = 0;
        char answer = 0;

        for (Character key : candidate.keySet()) {
            if (candidate.get(key) > max) {
                max = candidate.get(key);
                answer = key;
            }
        }

        System.out.println(answer);

    }
}
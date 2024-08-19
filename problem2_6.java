import java.util.Scanner;

public class problem2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        String[] problem = new String[length];

        for (int i = 0; i < problem.length; i++) {
            problem[i] = in.next();
        }

        for (int i = 0; i < length; i++) {
            char[] converts = problem[i].toCharArray();
            for (int j = 0; j < converts.length / 2; j++) {
                char tmp = converts[j];
                converts[j] = converts[converts.length - j - 1];
                converts[converts.length - j - 1] = tmp;
            }
            problem[i] = String.valueOf(converts);
        }

        boolean[] answer = new boolean[length];

        for (int i = 0; i < length; i++) {
            answer[i] = true;
            for (int j = 2; j <= Math.sqrt(Integer.parseInt(problem[i])); j++) {
                if (Integer.parseInt(problem[i]) % j == 0) {
                    answer[i] = false;
                    break;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            if (Integer.parseInt(problem[i]) == 1) {
                continue;
            }
            if (answer[i]) {
                System.out.print(Integer.parseInt(problem[i])+ " ");
            }
        }

    }

}
import java.util.Scanner;

public class problem2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] problem = new int[length];
        for (int i = 0; i < length; i++) {
            problem[i] = in.nextInt();
        }

        int score = 1;
        int answer = 0;

        for (int i = 0; i < length; i++) {
            if (problem[i] == 1) {
                answer += score;
                score++;
            } else {
                score = 1;
            }
        }

        System.out.println(answer);

    }

}
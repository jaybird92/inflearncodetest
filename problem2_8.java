import java.util.Scanner;

public class problem2_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] problem = new int[length];

        for (int i = 0; i < length; i++) {
            problem[i] = in.nextInt();
        }

//        int max = 0;
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            int max = problem[i];
            for (int j = 0; j < length; j++) {
                if (problem[j] < max) {
                    answer[j]++;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(answer[i]+1 + " ");
        }

    }

}
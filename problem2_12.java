import java.util.Scanner;

public class problem2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int student = in.nextInt();
        int test = in.nextInt();
        int[][] problem = new int[test][student];

        for (int i = 0; i < test; i++) {
            for (int j = 0; j < student; j++) {
                problem[i][j] = in.nextInt();
            }
        }

        int[][] answer = new int[student][student];

        for (int i = 0; i < test; i++) {
            for (int j = 0; j < student - 1; j++) {
                for (int k = j + 1; k < student; k++) {
                    answer[problem[i][j] - 1][problem[i][k] - 1]++;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < student; j++) {
                if (answer[i][j] == test) cnt++;
            }
        }

        System.out.println(cnt);

    }


}
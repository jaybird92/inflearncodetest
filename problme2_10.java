import java.util.Scanner;

public class problme2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[][] problem = new int[length + 2][length + 2];

        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                problem[i][j] = in.nextInt();
            }
        }

        int counter = 0;
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                //4방향체크
                if (problem[i][j] > problem[i-1][j]
                        && problem[i][j] > problem[i+1][j]
                        && problem[i][j] > problem[i][j+1]
                        && problem[i][j] > problem[i][j-1]) {
                    counter++;
                }
            }
        }

        System.out.println(counter);


    }

}
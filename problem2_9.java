import java.util.Scanner;

public class problem2_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[][] problem = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                problem[i][j] = in.nextInt();
            }
        }

        int answer = 0;

        //horizon
        int horizonMax = 0;
        for (int i = 0; i < length; i++) {
            int tmp = 0;
            for (int j = 0; j < length; j++) {
                tmp += problem[i][j];
            }
            if (tmp > horizonMax) {
                horizonMax=tmp;
            }
        }

        //vertical
        int verticalMax = 0;
        for (int i = 0; i < length; i++) {
            int tmp = 0;
            for (int j = 0; j < length; j++) {
                tmp += problem[j][i];
            }
            if (tmp > verticalMax) {
                verticalMax=tmp;
            }
        }

        answer = Math.max(horizonMax, verticalMax);

        //diganol
        int diagMax = 0;
        for (int i = 0; i < length; i++) {
            diagMax+= problem[i][i];
        }

        //rdiga
        int rdiagMax = 0;
        for (int i = length-1; i > 0; i--) {
            rdiagMax+= problem[i][i];
        }

        answer = Math.max(answer,Math.max(diagMax, rdiagMax));
        System.out.println(answer);


    }

}
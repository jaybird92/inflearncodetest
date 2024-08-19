import java.util.Scanner;

public class problem2_11 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int length = in.nextInt();
        int[][] problem = new int[length][5];

        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < 5; j++) {
                problem[i][j] = in.nextInt();
            }
        }

        int[][] answer = new int[length][length];

        //대상
        for (int i = 0; i < length ; i++) {
            //학년
            for (int j = 0; j < 5; j++) {
                //비교대상
                for (int k = 0; k < length; k++) {
                    //자기 자신과 비교할 경우 skip
                    if(i==k) continue;
                    //같은 반이면 정답란에 1을 표기
                    if (problem[i][j] == problem[k][j]) {
                        answer[i][k] = 1;
                    }
                }
            }
        }

        int max = 0;
        int president = 0;

        //같은 반이 된 적이 있는 횟수를 학생별로 셈
        for (int i = 0; i < length; i++) {
            int tmp = 0;
            for (int j = 0; j < length; j++) {
                tmp += answer[i][j];
//                System.out.print(answer[i][j] + " ");
            }
            if (tmp > max) {
                president = i;
                max = tmp;
            }
//            System.out.println();
        }

        System.out.println(president+1);

    }
}
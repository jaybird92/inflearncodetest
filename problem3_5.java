import java.util.Scanner;

public class problem3_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int targetSum = in.nextInt();

        int[] problem = new int[targetSum];
        for (int i = 0; i < targetSum; i++) {
            problem[i]= i;
        }

        int lt = 1;
        int rt = 1;

        int sum = 0;
        int answer = 0;

        for (rt = 1; rt < targetSum; rt++) {
            sum += problem[rt];
            if(sum == targetSum) {
                answer++;
//                System.out.println("lt = " + lt);
//                System.out.println("rt = " + rt);
            }

            while (sum >= targetSum) {
                sum -= problem[lt++];
                if(sum == targetSum) {
                    answer++;
//                    System.out.println("lt = " + lt);
//                    System.out.println("rt = " + rt);
                }
            }
        }
        System.out.println(answer);
    }
}
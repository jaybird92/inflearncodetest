import java.util.Scanner;

public class problem3_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arrayLength = in.nextInt();
        int targetSum = in.nextInt();

        int[] problem = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            problem[i]= in.nextInt();
        }

        int lt = 0;
        int rt = 0;

        int sum = 0;
        int answer = 0;

        for (rt = 0; rt < arrayLength; rt++) {
            sum += problem[rt];
            if(sum == targetSum) answer++;
            while (sum >= targetSum) {
                sum -= problem[lt++];
                if(sum == targetSum) answer++;
            }
        }
        System.out.println(answer);
    }
}
import java.util.Scanner;

public class problem3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int change = in.nextInt();

        int[] problem = new int[length];
        for (int i = 0; i < length; i++) {
            problem[i] = in.nextInt();
        }

        int lt = 0;
        int rt = 0;

        int max = Integer.MIN_VALUE;
        int count = 0;

        for (rt = 0; rt < length; rt++) {
            if(problem[rt]==0) count++;
            while (count > change) {
                if(problem[lt]==0) count--;
                lt++;
            }
            max = Math.max(max, rt - lt + 1);
        }

        System.out.println(max);


    }
}
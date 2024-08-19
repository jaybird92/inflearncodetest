import java.util.Scanner;

public class problem2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] problem = new int[length];
        
        for (int i = 0; i < length; i++) {
            problem[i]= in.nextInt();
        }

        int counter = 1;
        int max = problem[0];

        for (int i = 1; i < length; i++) {
            if (problem[i] > max) {
                counter++;
                max = problem[i];
            }
        }

        System.out.println(counter);
    }

}
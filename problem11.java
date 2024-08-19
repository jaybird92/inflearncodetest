import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem = in.next();

        int counter = 1;
        System.out.print(problem.charAt(0));

        for (int i = 1; i < problem.length(); i++) {
            if (problem.charAt(i - 1) == problem.charAt(i)) {
                counter++;
            } else {
                if(counter!=1) System.out.print(counter);
                counter = 1;
                System.out.print(problem.charAt(i));
            }
        }
        if (counter != 1) {
            System.out.print(counter);
        }
    }

}
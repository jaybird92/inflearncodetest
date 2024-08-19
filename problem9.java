import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem = in.nextLine();

        String answer = "";
        for (int i = 0; i < problem.length(); i++) {
            if (problem.charAt(i) >= '0' && problem.charAt(i) <= '9') {
                answer += problem.charAt(i);
            }
        }
        System.out.println(Integer.valueOf(answer));
    }

}
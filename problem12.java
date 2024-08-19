import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        String problem = in.next();

        List<Character> answer = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < problem.length(); i++) {
            if (problem.charAt(i) == '#') {
                tmp.append("1");
            }else {
                tmp.append("0");
            }
            if (i % 7 == 6) {
                answer.add((char)Integer.parseInt(tmp.toString(), 2));
                tmp = new StringBuilder();
            }
        }

        for (Character character : answer) {
            System.out.print(character);
        }

    }

}
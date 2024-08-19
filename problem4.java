import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int problemNumber = in.nextInt();

    String[] problems = new String[problemNumber];
        for (int i = 0; i < problemNumber; i++) {
        problems[i] = in.next();
    }

        for (int i = 0; i < problemNumber; i++) {
        String tmp = "";
        for (int j = problems[i].length() - 1; j >= 0; j--) {
            tmp += problems[i].charAt(j);
        }
        problems[i] = tmp;
    }
        for (String asw : problems) {
        System.out.println(asw);
    }
}





}
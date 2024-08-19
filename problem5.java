import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem = in.next();

        int lt = 0;
        int rt = problem.length() - 1;

        char[] asw = problem.toCharArray();

        while (lt < rt) {
            if (!Character.isAlphabetic(asw[lt])) lt++;
            else if (!Character.isAlphabetic(asw[rt])) {
                rt--;
            } else {
                char tmp = asw[lt];
                asw[lt] = asw[rt];
                asw[rt] = tmp;

                lt++;
                rt--;
            }

        }

        for (char s : asw) {
            System.out.print(s);
        }
    }

}
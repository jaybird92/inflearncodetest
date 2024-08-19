import java.util.Scanner;

public class problem6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem = in.next();
        String asw = "";
        for (int i = 0; i < problem.length(); i++) {
//            System.out.println(problem.charAt(i) + " " + i + " " + problem.indexOf(problem.charAt(i)));
            if (i == problem.indexOf(problem.charAt(i))) {
                asw += problem.charAt(i);
            }
        }

        System.out.println(asw);



    }

}
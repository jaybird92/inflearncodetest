import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String problem = in.nextLine();
        char [] problemArray = problem.toLowerCase().toCharArray();
        String answer = "YES";
        int lt = 0;
        int rt = problem.length() -1;
        while (lt < rt) {
            if(!Character.isAlphabetic(problemArray[lt])) lt++;
            else if(!Character.isAlphabetic(problemArray[rt])) rt--;
            else {
                if(problemArray[lt]!= problemArray[rt]){
                    answer = "NO";
                    break;
                }
                lt++; rt--;
            }
        }
        System.out.println(answer);

    }

}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        List<Integer> pivonachi = new ArrayList<>();
        pivonachi.add(1);
        pivonachi.add(1);

        for (int i = 2; i < length; i++) {
            pivonachi.add(pivonachi.get(i - 2) + pivonachi.get(i - 1));
        }

        for (int x : pivonachi) {
            System.out.print(x + " ");
        }

    }

}
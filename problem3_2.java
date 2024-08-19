import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problem3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int firstLength = in.nextInt();
        int[] firstArray = new int[firstLength];
        for (int i = 0; i < firstLength; i++) {
            firstArray[i] = in.nextInt();
        }

        int secondLength = in.nextInt();
        int[] secondArray = new int[secondLength];
        for (int i = 0; i < secondLength; i++) {
            secondArray[i] = in.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<Integer>();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int firstPointer = 0;
        int secondPointer = 0;

        while (firstPointer < firstLength && secondPointer < secondLength) {
            if (firstArray[firstPointer] < secondArray[secondPointer]) {
                firstPointer++;
            } else if (firstArray[firstPointer] > secondArray[secondPointer]) {
                secondPointer++;
            } else {
                answer.add(firstArray[firstPointer]);
                firstPointer++;
                secondPointer++;
            }
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}
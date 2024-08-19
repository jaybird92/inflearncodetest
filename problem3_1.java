import java.util.Scanner;

public class problem3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrLength1 = in.nextInt();
        int[] arr = new int[arrLength1];
        for (int i = 0; i < arrLength1; i++) {
            arr[i] = in.nextInt();
        }

        int arrLength2 = in.nextInt();
        int[] arr2 = new int[arrLength2];
        for (int i = 0; i < arrLength2; i++) {
            arr2[i] = in.nextInt();
        }

        int point1 = 0;
        int point2 = 0;
        int index = 0;

        int[] answer = new int[arrLength1 + arrLength2];

        while (point1 < arrLength1 && point2 < arrLength2) {
            if (arr[point1] < arr2[point2]) {
                answer[index++] = arr[point1++];
            } else {
                answer[index++] = arr2[point2++];
            }
        }

        while (point1 < arrLength1) {
            answer[index++] = arr[point1++];
        }

        while (point2 < arrLength2) {
            answer[index++] = arr2[point2++];
        }

        for (int j : answer) {
            System.out.print(j + " ");
        }
    }
}
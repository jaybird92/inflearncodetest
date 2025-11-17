package new_section1;

import java.util.Scanner;

/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 문자열은 영어 알파벳으로만 구성되어 있습니다
 */
public class problem2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(changeCase(input));
    }

    private static StringBuilder changeCase(String input){

//        String answer ="";
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == Character.toLowerCase(input.charAt(i))) {
//                answer += String.valueOf(input.charAt(i)).toUpperCase();
                answer.append(Character.toUpperCase(input.charAt(i)));
            } else {
                answer.append(Character.toLowerCase(input.charAt(i)));
            }
        }

        return  answer;
    }
}

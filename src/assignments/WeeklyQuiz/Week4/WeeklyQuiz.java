package assignments.WeeklyQuiz.Week4;

import java.util.Scanner;
import java.util.Stack;

public class WeeklyQuiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str;
        str = scanner.next();

        System.out.println(checkCouple(str));

        scanner.close();
    }

    public static boolean checkCouple(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            Character character = str.charAt(i);

            if (character == '(') {
                stack.push(character);
            } else if (character == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}

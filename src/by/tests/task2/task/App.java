package by.tests.task2.task;

import java.util.Scanner;
import java.util.Stack;

public class App {

	/**
	 * @param args
	 */
	public static String OPEN_BRACKETS = "([";
	public static String CLOSE_BRACKETS = ")]";
	
	public static void main(String[] args) {
		
		System.out.println("Результат:" + ParseExpression("([]([()]))"));
		System.out.println("Результат:" + ParseExpression("()"));
		System.out.println("Результат:" + ParseExpression("[(])"));
		System.out.println("Результат:" + ParseExpression("[()]([])"));
		
		Scanner in = new Scanner(System.in);
	}

	static boolean ParseExpression(String expression) {
		char array[] = expression.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int index;
		
		for(Character symbol : array) {
			if (OPEN_BRACKETS.indexOf(symbol)!= -1) {
				stack.push(symbol);
			} else if ((index = CLOSE_BRACKETS.indexOf(symbol)) != -1) {
				if (stack.size() != 0 && stack.peek() == OPEN_BRACKETS.charAt(index)) {
					stack.pop();
				}
			} else {
				return false;
			}
		}
		
		return stack.size() == 0;
	}
}

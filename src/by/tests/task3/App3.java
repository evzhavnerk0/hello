package by.tests.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 System.out.print("Введите число :");
	     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	     String str = bufferedReader.readLine();
	     int a = Integer.parseInt(str);
	     String b = Integer.toBinaryString(a);
	     System.out.print("В двоичной системе счисления :");
	     System.out.println(b);
	     System.out.print("Результат :");
	     System.out.print(Integer.toBinaryString(a+1));
	}

}

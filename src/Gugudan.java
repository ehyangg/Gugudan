import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단");
	
	//2단
	System.out.println(2 * 1);
	System.out.println(2 * 2);
	System.out.println(2 * 3);
	System.out.println(2 * 4);
	System.out.println(2 * 5);
	System.out.println(2 * 6);
	System.out.println(2 * 7);
	System.out.println(2 * 8);
	System.out.println(2 * 9);
	
	//3단
	int result = 3 * 1;
			System.out.println(result);
	result = 3 * 2;
			System.out.println(result);
	result = 3 * 3;
			System.out.println(result);
	result = 3 * 4;
			System.out.println(result);
	result = 3 * 5;
			System.out.println(result);
	result = 3 * 6;
			System.out.println(result);
	result = 3 * 7;
			System.out.println(result);
	result = 3 * 8;
			System.out.println(result);
	result = 3 * 9;
			System.out.println(result);
			
	//4단
	System.out.println("구구단 중 몇 단을 원하세요? : ");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println(number * 1);
	System.out.println(number * 2);
	System.out.println(number * 3);
	System.out.println(number * 4);
	System.out.println(number * 5);
	System.out.println(number * 6);
	System.out.println(number * 7);
	System.out.println(number * 8);
	System.out.println(number * 9);
	
			
	}
}
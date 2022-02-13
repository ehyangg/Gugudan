import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		//2단
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		
//		//3단 변수사용
//		int result = 3 * 1;
//		System.out.println(result);
//		result = 3 * 2;
//		System.out.println(result);
//		result = 3 * 3;
//		System.out.println(result);
//		result = 3 * 4;
//		System.out.println(result);
//		result = 3 * 5;
//		System.out.println(result);
//		result = 3 * 6;
//		System.out.println(result);
//		result = 3 * 7;
//		System.out.println(result);
//		result = 3 * 8;
//		System.out.println(result);
//		result = 3 * 9;
//		System.out.println(result);
		
//		//4단 사용자 입력
//		System.out.println("구구단 중 원하는 수의 구구단은 ? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);

//		//5단 반복문 while
//		int i = 1;
//		while(i < 10) {
//			System.out.println(5 * i);
//			i = i + 1;
//			
//		}
		
	
//		//6단 반복문 for
//		for(int i = 1; i<10; i++) {
//			System.out.println(6 * i);
//		}
		
		//7단 조건문 + 반복문 2~9값의 구구단만 출력
		System.out.println("원하는 구구단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		
		if(number < 2) {
			System.out.println("값을 잘못 입력했습니다.");
		} else if(number > 9) {
			System.out.println("값을 잘못 입력했습니다.");			
		} else
		
		for(int i = 1; i < 10; i++) {
			System.out.println(number * i);
		}
	}
}

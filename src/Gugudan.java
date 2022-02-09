//import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		int[] result = new int[9];
		for(int j=2; j<10; j++) {
		
		for(int i = 0; i < result.length; i++) {
			result[i] = j * (i + 1);
		}
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			}
		}
	}
}
//		//2단
//	System.out.println(2 * 1);
//	System.out.println(2 * 2);
//	System.out.println(2 * 3);
//	System.out.println(2 * 4);
//	System.out.println(2 * 5);
//	System.out.println(2 * 6);
//	System.out.println(2 * 7);
//	System.out.println(2 * 8);
//	System.out.println(2 * 9);
//	
//	//3단
//	int result = 3 * 1;
//			System.out.println(result);
//	result = 3 * 2;
//			System.out.println(result);
//	result = 3 * 3;
//			System.out.println(result);
//	result = 3 * 4;
//			System.out.println(result);
//	result = 3 * 5;
//			System.out.println(result);
//	result = 3 * 6;
//			System.out.println(result);
//	result = 3 * 7;
//			System.out.println(result);
//	result = 3 * 8;
//			System.out.println(result);
//	result = 3 * 9;
//			System.out.println(result);
//			
//	//4단
//	System.out.println("구구단 중 몇 단을 원하세요? : ");
//	Scanner scanner = new Scanner(System.in);
//	int number = scanner.nextInt();
//	System.out.println(number * 1);
//	System.out.println(number * 2);
//	System.out.println(number * 3);
//	System.out.println(number * 4);
//	System.out.println(number * 5);
//	System.out.println(number * 6);
//	System.out.println(number * 7);
//	System.out.println(number * 8);
//	System.out.println(number * 9);
		
//		//5단
//		int i = 1;
//		while (i<10) {
//			System.out.println(5 * i);
//			i = i + 1;
//		}
//			//6단
//			for (int j=1; j<10; j++) {
//				System.out.println(6 * j);
//					
//		}
//		
//		//7,8,9단
//		System.out.println("원하시는 구구단 숫자를 입력해주세요 : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 : " + number);
//		
//		if (number < 2) {
//			System.out.println("값을 잘못 입력했습니다.");
//		} else if (number > 9) {
//			System.out.println("값을 잘못 입력했습니다.");
//		} else {
//			for(int i=1; i<10; i++) {
//				System.out.println(number * i);
//			}
//		}
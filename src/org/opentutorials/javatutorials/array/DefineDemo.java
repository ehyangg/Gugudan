package org.opentutorials.javatutorials.array;

public class DefineDemo {
	public static void main(String[] args) {
		//한 번에 정의
//								//원소, element
//		String[] classGroups = { "최진혁", "최유빈", "한이람", "이고잉" };
//									//색인, index
//		System.out.println(classGroups[0]);
//		System.out.println(classGroups[1]);
//		System.out.println(classGroups[2]);
//		System.out.println(classGroups[3]);
		
		//분할해서 정의
//		String[] classGroups = new String[4];
//		classGroups[0] = "최진혁";
//									//몇 개의 값을 수용할 수 있는지 알려줌.
//		System.out.println(classGroups.length);
//		classGroups[1] = "최유빈";
//		System.out.println(classGroups.length);
//		classGroups[2] = "한이람";
//		System.out.println(classGroups.length);
//		classGroups[3] = "이고잉";
//		System.out.println(classGroups.length);
		
//		//배열과 반복문의 활용
//		String[] members = { "최진혁", "최유빈", "한이람" } ;
//			//초기화	//반복조건			//반복실행
//		for(int i=0; i<members.length; i++) {
//			String member = members[i];
//			System.out.println(member + "이 상담을 받았습니다.");
//		}
		
		//for-each
		//생각을 복잡하게 하지 않고도 똑같은 결과를 낼 수 있고 간결해짐
		String[] members = { "최진혁", "최유빈", "한이람" };
		for(String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}

	}			
}

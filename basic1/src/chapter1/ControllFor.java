package chapter1;

public class ControllFor {

	public static void main(String[] args) {
		
		// 반복문 : 특정 조건에 만족하면 지정한 코드 블럭을 반복 실행하도록 하는 것
		
		// for 문 : 일반적으로 반복 횟수가 정해져 있을때 사용하는 반복문
		// for(조건에사용할변수초기화; 조건; 조건에사용할변수변경) {반복할 코드블럭}
		
		for(int i = 0; i < 9; i++) {
			System.out.println("안녕하세요");
		}
		
//		System.out.println("4 * 1 = 4");
//		System.out.println("4 * 2 = 8");
//		System.out.println("4 * 3 = 12");
//		System.out.println("4 * 4 = 16");
//		System.out.println("4 * 5 = 20");
//		System.out.println("4 * 6 = 24");
//		System.out.println("4 * 7 = 28");
//		System.out.println("4 * 8 = 32");
//		System.out.println("4 * 9 = 36");
		
		for (int count = 1; count <= 9; count += 2) {
			System.out.println("4 * " + count + " = " + (count * 4));
		}
		
		String[] fruits = new String[] {"apple", "banana", "cacao"};
		
//		for (int index = 0; index <= (fruits.length - 1); index++) {
//			System.out.println(fruits[index]);
//		} 배열의 길이가 3이기때문에 작거나 같으려면 길이 - 1을 해줘야 조건이 성립한다. 아래조건문은 = 이 생략되었기 때문에 예시로 길이가 3보다 작기때문에 -1이 적용된것
		
		for (int index = 0; index < fruits.length; index++) {
			System.out.println(fruits[index]);
		}
		
		for (int index = 0; index < fruits.length; index++) {
			fruits[index] += " add ";
		}
		
		// forEach : 컬렉션(배열)의 각 요소를 하나씩 변수에 복사하여 사용하는 반복문
		// 컬렉션 실제 요소에 대해서 읽기전용, 복사한 요소를 변경하더라도 실제 요소에는 영향이 없음
		for (String fruit : fruits) {
			System.out.println(fruit);
		} // for Each 문으로 변수 선언해서 : 뒤에 요소의 값들을 하나씩 복사해서 뽑아낸다.
		
		for (String fruit : fruits) {
			fruit += " add ";
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}

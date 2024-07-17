package first_project;// 최상단에 패키지경로가 있어야 클래스 읽을 수 있다.

public class Hello {

	public static void main(String[] args) {

		System.out.println("두번째 코드!");
		System.out.println("세번째 코드!");
		System.out.println("네번째 코드!\n"); //네번째 출력
		
		System.out.println("다섯번째 코드!");
		System.out.println("여섯번째 코드!");
		System.out.println("일곱번째 코드!" + "여덟번째 코드!");
		
		int num = 10;
		System.out.println(num);
		
		int num2;
		num2 = 5;
		System.out.println(num2);
		num2 = 15;
		System.out.println(num2);
	}

}

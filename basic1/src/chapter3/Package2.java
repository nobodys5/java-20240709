package chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Package2 {

	public static void main(String[] args) {

		// Collection Framework : Java에서 데이터 구조에 대한 표준화된 기법을 제공
		
		// List : 데이터를 저장할 때 중복을 허용하고 순서가 존재하는 데이터 구조
		// Collection Framework에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정, 참조형 데이터 타입만 지정 가능
		List<Integer> list;		
		
		// ArrayList 구현 클래스 : 인덱스를 이용한 검색이 빠름
		list = new ArrayList<Integer>();
		
		// LinkedList 구현 클래스 : 추가, 삭제가 빠름
		list = new LinkedList<Integer>();
		
		// add() : List에 요소 추가 
		// 추가할 요소는 제너릭으로 지정한 데이터 타입의 요소이어야 함
		list.add(99);
//		list.add("99"); integer로 타입지정을해놔서 문자열로 추가불가능
		System.out.println(list);

		list.add(99);
		System.out.println(list);
		
		// get() : List의 특정 인덱스 값을 가져옴
		// List의 인덱스 범위를 초과하지 않도록 주의
		// 기본형 데이터 타입의 변수로 반환값을 받을 땐 null이 올 수 있음을 주의
		int number = list.get(0); // 기본형 타입은 null 값이 들어올수없다 참조형 Integer
		System.out.println(number);
		
		// set() : List의 특정 인덱스 요소를 변경
		// List 인덱스 범위를 벗어나는 인덱스를 지정할 수 없음
		list.set(1, -100); // 1번 요소의 값을 변경시켜준다
		System.out.println(list);
		
		// remove() : List의 특정 인덱스 요소를 제거
		list.remove(1); // 선태한 인덱스의 요소를 제거하고 요소만큼 길이도 제거시킨다
		System.out.println(list);
		
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("banana");
		System.out.println(stringList);
		
		stringList.remove("apple");
		System.out.println(stringList);

		// size() : List의 크기를 반환
		System.out.println(list.size());

		// set : 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않는 데이터 구조 (집합)
		Set<String> set;
		
		// HashSet 구현 클래스 : 검색이 빠름
		set = new HashSet<String>();
		// TreeSet 구현 클래스 : 요소를 정렬해서 추가
		set = new TreeSet<String>();
		
		// add() : Set에 요소를 추가함 만약 동일한 요소가 존재한다면 추가하지 않음
		set.add("apple");
		set.add("apple");
		System.out.println(set);
		
		// contains() : Set에 특정 요소가 존재하는지 확인
		System.out.println(set.contains("apple"));
		
		// remove() : Set에 특정 요소를 제거
		set.remove("apple");
		System.out.println(set);
		
		// Map : 키와 값이 한 쌍으로 이루어진 요소들의 집합
		// 키는 중복이 불가능, 값은 중복이 가능
		Map<String, String> map;
		
		// HashMap 구현 클래스 : 검색 속도가 빠름
		map = new HashMap<String, String>();
		// TreeMap 구현 클래스 : 키를 정렬하여 저장
		map = new TreeMap<String, String>();
		
		// put() : Map 에 키와 값의 쌍을 추가
		// 만약 동일한 키가 존재하면 원래 값을 덮어씌움
		map.put("apple", "사과");
		System.out.println(map);
		map.put("banana", "바나나");
		System.out.println(map);
		map.put("banana", "버네이너");
		System.out.println(map);
		
		// get() : Map에서 특정 키를 가지는 요소를 반환
		// 존재하지 않는 키를 검색하면 null을 반환
		System.out.println(map.get("apple"));
		
		// containsKey() : Map에 특정 키가 존재하는지 확인
		System.out.println(map.containsKey("apple"));
		
		// remove() : Map에서 특정 키를 가지는 키와 값의 쌍을 제거
		// 삭제 작업에 성공하면 해당 키의 값을 반환
		System.out.println(map.remove("apple"));
		System.out.println(map);
		
		class Human {
			String name;
			String address;
			int age;
		}
		
		Human human1 = new Human();
		human1.name = "홍길동";
		human1.address = "부산광역시";
		
		
		
		Map<String, Object> human2 = new HashMap<String, Object>();
		human2.put("name", "홍길동");
		human2.put("address", "부산광역시");
		human2.put("age", 20);
		System.out.println(human2);
		
		// object 를 데이터 타입으로 지정했을때 발생하는 문제점
		// 1. 문제점 : 사용 혹은 추가 작업에 실수 가능성 오타를 입력하여 필요한 값을 못 읽어올수도있다.
//		human2.get(naem); : 이렇게되면 모든타입을 데이터로 받을 수 있기 때문에 오류를 감지하지못해서 개발자 본인이 오류가있는지 확인하기 어렵다
		
		// 2. 문제점 : 타입의 안정성의 문제
		int age = (int)human2.get("age"); // int 정수에 human 문자열값을 담으려면 데이터타입이 맞지않아 human을 int로 형변환 시켜줘야함 그렇지않으면 오류가 발생
		// 3. 문제점 : 데이터 무결성의 문제
		System.out.println(age);
		
		
	}

}

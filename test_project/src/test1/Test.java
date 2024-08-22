package test1;

import java.awt.Menu;
import java.util.Scanner;
class Vehicle {
	public void speedup() {
		System.out.println("가속합니다");
	}
	public void stop() {
		System.out.println("정차합니다");
	}
	public void speedup2() {
		System.out.println("가속합니다");
	}
	public void stop2() {
		System.out.println("정차합니다");
	}
	public void powerstart(boolean power) {
		System.out.println(!power);
	}

	
	
}

class Car extends Vehicle{

	
	 String vin;
	 String color;
	 boolean isStart;
	
	 @Override
	public void speedup() {
		 System.out.println("수동 변속기 자동차가 가속합니다");
	}
	 @Override
	public void stop() {
		System.out.println("수동 변속기 자동차가 정차합니다");
	}
	@Override
	public void speedup2() {
		System.out.println("자동 변속기 자동차가 가속합니다");
	} 
	 
	@Override
	public void stop2() {
		System.out.println("자동 변속기 자동차가 정차합니다");
	}
	public void information() {
		System.out.println(vin);
		System.out.println(color);
		System.out.println(isStart);
	}
	 
	public void gearchange() {
		System.out.println("단으로 변경합니다.");
	}
	
	public void ManualCar() {
		int gear = 0;
		System.out.println("기어 상태 = " + gear );
		
		speedup();
		stop();
	}

	public void AutomaticCar() {
		speedup2();
		stop2();
	}
}

class Train extends Vehicle {
	 String trainNumber;
	 String departureStation;
	 String arrivalStation;
	 boolean isStart;
	
	 @Override
	public void speedup() {
		 System.out.println("여객 열차가 천천히 가속합니다");
	 }
	 @Override
	public void stop() {
		 System.out.println("여객 열차가 천천히 정차합니다");
	}
	@Override
	public void speedup2() {
		System.out.println("화물 열차가 느리게 가속합니다");
	} 
	 
	@Override
	public void stop2() {
		System.out.println("화물 열차가 느리게 정차합니다");
	}
	public void PassengerTrain () {
		int passengerCount = 200;
		System.out.println("탑승객 수 = " + passengerCount);
		speedup();
		stop();
	}
	
	public void FreightTrain () {
		double cargoWeight = 100.0;
		System.out.println("화물 무게 = " + cargoWeight);
		speedup2();
		stop2();
	}
}

public class test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		Car manualcar = new Car();
		manualcar.vin = "10가 1234";
		manualcar.color ="blue";
		manualcar.isStart = false;
		
		System.out.println(manualcar.vin);
		System.out.println(manualcar.color);
		System.out.println(manualcar.isStart);
		manualcar.ManualCar();
		System.out.println();
		Car automaticcar = new Car();
		automaticcar.vin = "10가 1234";
		automaticcar.color ="blue";
		automaticcar.isStart = false;
		
		System.out.println(automaticcar.vin);
		System.out.println(automaticcar.color);
		System.out.println(automaticcar.isStart);
		automaticcar.AutomaticCar();
		
		System.out.println();
		Train passengerTrain = new Train();
		passengerTrain.trainNumber = "KTX001";
		passengerTrain.departureStation ="서울";
		passengerTrain.arrivalStation = "부산";
		passengerTrain.isStart = false;
		System.out.println();
		System.out.println(passengerTrain.trainNumber);
		System.out.println(passengerTrain.departureStation);
		System.out.println(passengerTrain.arrivalStation);
		passengerTrain.PassengerTrain();
		System.out.println();
		Train freightTrain = new Train();
		freightTrain.trainNumber = "Cargo001";
		freightTrain.departureStation ="부산";
		freightTrain.arrivalStation = "구미";
		freightTrain.isStart = false;
		System.out.println();
		System.out.println(freightTrain.trainNumber);
		System.out.println(freightTrain.departureStation);
		System.out.println(freightTrain.arrivalStation);
		freightTrain.FreightTrain();


		while(true) {
			System.out.println("변속할 기어단을 입력하시오");
				scanner.nextInt();
				manualcar.gearchange();
		}
	
	}

}

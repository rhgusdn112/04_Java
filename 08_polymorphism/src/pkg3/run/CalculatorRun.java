package pkg3.run;

import pkg3.dto.Calculator;
import pkg3.dto.GHWCalculator;

public class CalculatorRun {
	public static void main(String[] args) {

		// 인터페이스도 추상클래스 처럼
		// - 객체 생성 x
		// - 대신 부모타입 참조 변수로 사용 o
		//  -> 다형성 업캐스팅 + 동적 바인딩
		
		Calculator c = new GHWCalculator();
		
		System.out.println(c.plus(900000000, 30000000));
		System.out.println(c.minus(1, 30));
		System.out.println(c.multi(7000,123));
		System.out.println(c.div(55555,444));
		System.out.println(c.mod(1234,56));
		System.out.println(c.pow(2,16));
		System.out.println(c.areaOfCircle(5.7));
		System.out.println(c.toBinary(100));
		System.out.println(c.toHexadecimal(100));
		
		
	}

}

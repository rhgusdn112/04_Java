package pkg4.dto;

import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent {

	// 부모랑 예외처리 구문이 같으면 문제 없음 !
//	@Override
//	public void method1() throws IOException {}
	
	
	// 부모 예외 -> 자식 예외로 변경
	// => 컴파일 오류 없음 == 오버라이딩 성립 !
	@Override
	public void method1() throws EOFException {}

	// 부모 예외를 -> 더 위의 부모 예외로 변경
	// => 컴파일 에러 발생!! == 오버라이딩 성립이 안됨
	// @Override
	// public void method2() throws Exception {}
	
	// 예외처리 구문 제거
	// => 오버라이딩 성립!! 
	@Override
	public void method3() {
		// 왜 되는거지???
		// -> 오버라이딩 한 코드에서 예외가 발생 안 할수도 있어서!!
	}
	
}

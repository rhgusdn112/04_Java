package run;

import service.MemberService;

public class objectArrayRun {

	public static void main(String[] args) {
		
		
		// MemberService 객체 생성
		// -> MemberService의 생성자를 작성 한 적 없다!!
		// --> 그러면 컴파일러가 기본 생성자를 만들어 준다
		MemberService service = new MemberService();
		
		service.method1();
		
	}

}

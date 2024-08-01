package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.MemberService;
import service.MemberServiceImpl;

public class MemberView {

	private MemberService service = null;
	private BufferedReader br = null;
	
	public MemberView() {
		
		try {
			
			service = new MemberServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			
			System.out.println("\n ***** 프로그램 실행 중 오류 발생 ***** \n");
			e.printStackTrace();
			System.exit(0); // 프로그램 강제 종료 (종료단계 최상위)
		}
	}
	
	
	
	// ------------------------------------------------------------------------------
	// 메인 메뉴
	
	private int selectMenu() throws NumberFormatException, IOException {
		System.out.println("\n ***** 회원 관리 프로그램 ***** \n");
		System.out.println("1. 회원 가입(추가)");
		System.out.println("2. 회원 전체 조회");
		System.out.println("3. 이름으로 검색");
		System.out.println("4. 특정 회원 사용 금액 누적하기");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 종료");
	
		System.out.println("메뉴 선택 : ");
		
		// 입력 받은 문자열을 int 형태로 변환 하는 구문
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
}
	
	
	public void mainMenu() {
		
		int input = 0;
		
		do {
			try {
				input = selectMenu();
				
			switch(input) {
			
			case 1 :  break;
			case 2 :  break;
			case 3 :  break;
			case 4 :  break;
			case 5 :  break;
			case 6 :  break;
			case 0 :  break;
			
			default : ;
			}
			
			System.out.println("====================================================");
			
			} catch (NumberFormatException e) {
				System.out.println("\n ### 숫자만 입력 해주세요 ### \n");
				input = -1; // 첫 반복 때 종료되지 않도록 값을 변경하는 구문
			} catch(IOException e) {
				System.out.println("\n ### 입출력 관련 예외 발생 ### \n");
				e.printStackTrace();
			} catch(Exception e) { // 그 외 나머지 예외 처리
				e.printStackTrace();
			}
		} while(input != 0);
		
	}
	
}
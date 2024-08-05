package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListView {
	private TodoListService service = null;
	private BufferedReader br = null;
	
	// 기본 생성자
	public TodoListView() {
		
		try { 
			service = new TodoListServiceImpl();
			br = new BufferedReader(new InputStreamReader(System.in));
			
		}catch(Exception e){
			System.out.println(" *** 프로그램 실행 중 오류 발생 *** ");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료
		}
	}
	// --------------------------------------------------------------------------------------------
	// [메인 메뉴]
	
	public void mainMenu() {
		
		int input = 0;
		do {
			
			try {
				// 메뉴 출력 후 입력 된 번호 반환하기
				input = selectMenu();
				
				switch(input) {
				case 1 :  break;
				case 2 :  break;
				case 3 :  break;
				case 4 :  break;
				case 5 :  break;
				case 6 :  break;
				case 0 : System.out.println(" *** 프로그램이 종료되었습니다. 감사합니다. ***"); break;
				default:  System.out.println("### 메뉴에 작성된 번호만 입력해야 합니다. ###");
					
				
				}
					System.out.println("==================================================");
		}catch(NumberFormatException e) {
			System.out.println("\n ### 숫자만 입력 해주세요. ###\n");
		}catch(IOException e) {
			System.out.println("\n ### 입출력 관련 예외 발생!!! ### \n");
			e.printStackTrace();
		}catch(Exception e) { // 그 외 나머지 예외처리
			e.printStackTrace();
		}
	}while(input != 0);
	}
	// -----------------------------------------------------------------------------------------
	// [리스트 출력/선택하는 메서드]
	
	private int selectMenu() throws NumberFormatException, IOException{
		
		System.out.println("\n ===== Todo List ===== \n");

		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. EXIT");

		System.out.print(" Select Menu Number >>> ");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println(); // 줄바꿈
		
		return input;
	}
	
	
}

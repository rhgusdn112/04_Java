package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dao.TodoListDao;
import dao.TodoListDaoImpl;
import dto.Todo;

public class TodoListServiceImpl implements TodoListService{
	
	private TodoListDao dao;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	// String formattedDateTime = currentDateTime.format(formatter);
	
	public TodoListServiceImpl() throws FileNotFoundException, ClassNotFoundException, IOException{
		dao = new TodoListDaoImpl();
	}
	@Override
	public int detailIndex(Todo index) {
		return 0;
	}
	
	// [3] 목록 추가
	@Override
	public boolean addTodoList(String title, String detail) throws IOException {
	    List<Todo> todoList = dao.getTodoList();
	    for (Todo todo : todoList) {
	        if (detail.equals(todo.getDetail())) {
	            return false;
	        }
	    }
	    Todo todo = new Todo(title, detail, false, LocalDateTime.now());
	    return dao.addTodo(todo);
	}

		// 2) 중복이 아닌 경우
		// 	  입력받은 정보를 이용 todo 객체 생성
		//    DAO로 전달해서 파일에 저장
		//	  DAO 메서드 호출 후 결과 반환

	@Override
	public List<Todo> getTodoList(){
		return dao.getTodoList();
	}

	@Override
	public List<Todo> selectTitle(String searchTitle) {
		
		// DAO를 이용해서 전체 목록 조회
		List<Todo> TodoList = dao.getTodoList();
		
		List<Todo> searchList = new ArrayList<Todo>();
		
		for(Todo todo : TodoList) {
			if(todo.getTitle().equals(searchTitle)) {
				searchList.add(todo);
			}
		}
		
		return searchList;
	}

	@Override
	public String completeTodo(Todo target) throws IOException {
		target.setComplete(!target.isComplete());
	    dao.saveFile();
	    return "할 일이 수정되었습니다.";
	}


	@Override
	public String updateDetail(Todo target, String detail) throws IOException {
		
		target.setDetail(detail);
		
		StringBuilder sb = new StringBuilder();
		sb.append("할 일의 내용이 수정되었습니다.");
		
		dao.saveFile();
		
		
		return sb.toString();
	}

	@Override
	public String removeTodo(Todo target) throws IOException {
	    List<Todo> todoList = dao.getTodoList();
	    if (todoList.remove(target)) {
	        dao.saveFile();
	        return "할 일이 삭제처리 되었습니다.";
	    }
	    return "할 일 삭제에 실패했습니다.";
	}



	public List<Todo> addTodoList(int index) {
		return null;
	}
	
	@Override
	public Todo detailIndex(int index) {
	    List<Todo> todoList = dao.getTodoList();
	    if (index >= 0 && index < todoList.size()) {
	        return todoList.get(index);
	    }
	    return null; // or throw an exception if the index is out of bounds
	}

}

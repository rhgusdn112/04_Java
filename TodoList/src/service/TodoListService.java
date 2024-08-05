package service;

import java.io.IOException;
import java.util.List;

import dto.Todo;

public interface TodoListService {
    boolean addTodoList(String title, String detail) throws IOException;

    List<Todo> getTodoList();

    List<Todo> selectTitle(String searchTitle);

    String completeTodo(Todo target) throws IOException;

    String updateDetail(Todo target, String detail) throws IOException;

    String removeTodo(Todo target) throws IOException;

    Todo detailIndex(int index);

	int detailIndex(Todo index);
}

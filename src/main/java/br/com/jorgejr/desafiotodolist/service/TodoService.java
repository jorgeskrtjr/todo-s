package br.com.jorgejr.desafiotodolist.service;

import br.com.jorgejr.desafiotodolist.entity.Todo;
import br.com.jorgejr.desafiotodolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);

        return list();
    }

    public List<Todo> update(Todo todo){

        System.out.println(todo.getId());
        todoRepository.save(todo);

        return list();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());

        return todoRepository.findAll(sort);
    }

}

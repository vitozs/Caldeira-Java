package com.github.crud.controller;


import com.github.crud.model.TaskModel;
import com.github.crud.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path="/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;
    @GetMapping
    public ArrayList<TaskModel> tasks(){
        return taskService.getTasks();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addTask(@RequestBody @Valid TaskModel task){
        taskService.addTask(task);
        return ResponseEntity.ok("Tarefa adicionada");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable(value = "id") int id){
        taskService.deleteTask(id);
        return ResponseEntity.ok("Tarefa removida");
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editTask(@PathVariable(name = "id") int id, @RequestBody TaskModel task){
        taskService.edit(id, task);
        return ResponseEntity.ok("Tarefa " + id + " editada");
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) //Pega apenas erros que retornem BAD REQUEST
    @ExceptionHandler(MethodArgumentNotValidException.class) //Classe que retorna o erro
    //Metodo retorna um Map de erros
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<>(); //cria um hashmap
        ex.getBindingResult().getAllErrors().forEach((e) -> {
            String fieldName = ((FieldError) e).getField(); //pega o campo do erro
            String errorMessage = e.getDefaultMessage(); //pega a mensagem do erro
            errors.put(fieldName, errorMessage); //coloca no hashmap a chave e o valor
        });
        return errors;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity<String> handleUnexistedTaskException(IndexOutOfBoundsException ex){
        return  ResponseEntity.internalServerError().body("Tarefa Inexistente");
    }
}

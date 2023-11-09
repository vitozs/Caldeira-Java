package com.github.crud.service;

import com.github.crud.controller.TaskController;
import com.github.crud.model.TaskModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.config.Task;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@SpringBootTest
public class TaskServiceTest {

    @Autowired
    TaskService taskService;

    TaskModel task;
    @BeforeEach
    void setup(){
        task = new TaskModel();
        task.setConcluida(true);
        task.setDescricao("Comer");
        task.setDataVencimento(LocalDate.parse("2023-11-10"));
    }

    @Test
    //Verifica se o ArrayList aumenta ao adicionar tarefa
    void addTarefa(){
        taskService.addTask(task);
        Assertions.assertTrue(!taskService.getTasks().isEmpty());
    }

    @Test
    void removeTarefa(){
        taskService.deleteTask(0);
        Assertions.assertTrue(taskService.getTasks().isEmpty());
    }

    @Test
    void getTarefas(){
        Assertions.assertInstanceOf(ArrayList.class, taskService.getTasks());
    }

    @Test
    void setTarefa(){
        TaskModel task2 = new TaskModel();
        task2.setConcluida(true);
        task2.setDescricao("caminhar");
        task2.setDataVencimento(LocalDate.parse("2023-11-10"));
        taskService.edit(1, task2);

        ArrayList<TaskModel> arr = taskService.getTasks();
        Assertions.assertEquals("caminhar", arr.get(0).getDescricao());
    }
}

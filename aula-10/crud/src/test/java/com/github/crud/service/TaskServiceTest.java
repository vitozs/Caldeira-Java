package com.github.crud.service;

import com.github.crud.controller.TaskController;
import com.github.crud.model.TaskModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.config.Task;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

@SpringBootTest
public class TaskServiceTest {

    @Autowired
    TaskController taskController;
    @Autowired
    TaskService taskService;
    @Autowired
    private MockMvc mockMvc;
}

package com.github.crud.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.github.crud.model.TaskModel;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    ArrayList<TaskModel> taskModelList = new ArrayList<>();
    int idCounter = 0;
    public ArrayList<TaskModel> getTasks(){
        return taskModelList;
    }

    public void addTask(TaskModel task){
        idCounter++;
        task.setId(idCounter);
        taskModelList.add(task);
    }

    public void deleteTask(int id){
        if(id > 0){
            taskModelList.remove(id-1);
        }

    }

    public void edit(int id, TaskModel task) {
        task.setId(id);
        if(id > 0){
            taskModelList.set(id-1, task);
        }
    }
}

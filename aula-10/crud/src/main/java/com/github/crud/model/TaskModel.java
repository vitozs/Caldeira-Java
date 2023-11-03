package com.github.crud.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskModel {

    int id;

    @NotBlank(message = "Descricao necessaria")
    String descricao;

    @NotNull(message = "status necessario")
    boolean concluida;

    @NotNull(message = "data necessaria")
    LocalDate dataVencimento;

}

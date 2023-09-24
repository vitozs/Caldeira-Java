package compra;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compra {
    private String nome;
    private LocalDate dataDeValidade;

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeValidade(String dataDeValidade) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateTime = LocalDate.parse(dataDeValidade, formatter);
        this.dataDeValidade = dateTime;
    }
}

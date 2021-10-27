package ex1_entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Jornal extends Produto {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate data;

    public Jornal(String nome, double preco, LocalDate data) {
        super(nome, preco);
        this.data = data;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("\nData produto: " + data.format(formatter));
    }
}

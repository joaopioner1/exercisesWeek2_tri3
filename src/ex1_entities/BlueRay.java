package ex1_entities;

import java.time.Duration;

public class BlueRay extends Produto {

    private Duration duracao;

    public BlueRay(String nome, double preco, Duration duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    public Duration getDuracao() {
        return this.duracao;
    }

    public void setDuration(Duration duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("\nDuracao produto: "
                + getDuracao());
    }
}

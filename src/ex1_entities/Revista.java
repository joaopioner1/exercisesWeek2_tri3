package ex1_entities;

public class Revista extends Produto {

    private String genero;

    public Revista(String nome, double preco, String genero) {
        super(nome, preco);
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("\nGenero produto: %s", getGenero());
    }
}

package ex1_entities;

public class Livro {

    private String autorPrincipal;
    private String editora;

    public Livro(String nome, double preco, String editora
    String autor) {
        super(nome, preco);
        this.autorPrincipal = autor;
        this.editora = editora;
    }

    public String getAutorPrincipal() {
        return this.autorPrincipal;
    }

    public void setAutorPrincipal(String autor) {
        this.autorPrincipal = autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("\nAutor principal produto: %s"
                + "\nEditora produto: %s", this.autorPrincipal, this.editora);
    }
}

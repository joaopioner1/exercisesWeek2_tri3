package application;

import ex1_entities.Produto;
import ex1_entities.Revista;

public class Program {

    public static void main(String[] args) {

        Produto p = new Produto("TV", 900.00);
        System.out.println(p);

        Revista r = new Revista("WIRE", 20.00, "Technology");
        System.out.println(r);
    }
}

package application;

import ex1_entities.BlueRay;
import ex1_entities.Jornal;
import ex1_entities.Produto;
import ex1_entities.Revista;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Program {

    public static void main(String[] args) {

        Produto p = new Produto("TV", 900.00);
        System.out.println(p);

        Revista r = new Revista("WIRE", 20.00, "Technology");
        System.out.println(r);

        Jornal j = new Jornal("The new York Times", 50.00,LocalDate.now());
        System.out.println(j);

        Duration d = Duration.ofSeconds(125);
        BlueRay b = new BlueRay("Pirata", 90.00, d);
        System.out.println(b);

        
    }
}

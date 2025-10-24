import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5);
        System.out.println(circulo1.calcularArea());
        System.out.println(circulo1.calcularPerimetro());

        Rectangulo rectangulo1 = new Rectangulo(2,1);
        System.out.println(rectangulo1.calcularArea());
        System.out.println(rectangulo1.calcularPerimetro());

        Cuadrado cuadrado1 = new Cuadrado(2);
        System.out.println(cuadrado1.calcularArea());
        System.out.println(cuadrado1.calcularPerimetro());

        Gestor gestor = new Gestor();
        gestor.agregarFigura(circulo1);
        gestor.agregarFigura(rectangulo1);
        gestor.agregarFigura(cuadrado1);

        List<Figura> figuras = gestor.getFiguras();
        System.out.println(figuras);
        Collections.sort(figuras);
        System.out.println(figuras);

    }
}

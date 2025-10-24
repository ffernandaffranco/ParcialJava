import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5);

        Rectangulo rectangulo1 = new Rectangulo(2,1);

        Cuadrado cuadrado1 = new Cuadrado(2);

        Gestor gestor = new Gestor();
        gestor.agregarFigura(circulo1);
        gestor.agregarFigura(rectangulo1);
        gestor.agregarFigura(cuadrado1);

        List<Figura> figuras = gestor.getFiguras();
        System.out.println(figuras);
        Collections.sort(figuras);
        System.out.println(figuras);

        Figura mayorPerimetro = gestor.getFiguraMayorPerimetro();
        System.out.println(mayorPerimetro);
    }
}

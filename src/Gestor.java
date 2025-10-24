import java.util.List;
import java.util.ArrayList;

public class Gestor {
    private List<Figura> figuras;

    public Gestor() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        this.figuras.add(figura);
    }

    public List<Figura> getFiguras() {
        return figuras;
    }
}

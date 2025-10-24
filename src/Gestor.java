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

    public Figura getFiguraMayorPerimetro() {
        if (this.figuras.isEmpty()) {
            return null;
        }

        Figura figuraConMayorPerimetro = this.figuras.get(0);
        for (Figura figura : this.figuras) {
            if (figura.getPerimetro() > figuraConMayorPerimetro.getPerimetro()) {
                figuraConMayorPerimetro = figura;
            }
        }
        return figuraConMayorPerimetro;

    }

    public List<Figura> getFiguras() {
        return figuras;
    }
}

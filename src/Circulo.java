import static java.lang.Math.PI;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // pi por r2
        this.area = (this.radio * this.radio) * PI;

        return this.area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.radio;
        return this.perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

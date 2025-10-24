import static java.lang.Math.PI;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        this.area = (this.radio * this.radio) * PI;
        this.perimetro = 2 * Math.PI * this.radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.nombre = cuadrado;
        this.lado = lado;
        this.perimetro = this.lado * 4;
        this.area = this.lado * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

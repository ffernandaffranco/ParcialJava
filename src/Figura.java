public abstract class Figura implements Comparable<Figura> {

    protected double area;
    protected double perimetro;

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    @Override
    public int compareTo(Figura otraFigura) {
        if (this.area > otraFigura.area) {
            return -1;
        }

        if (this.area < otraFigura.area) {
            return 1;
        }

        return 0;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

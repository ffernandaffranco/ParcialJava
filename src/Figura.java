public abstract class Figura implements Comparable<Figura> {

    protected double area;
    protected double perimetro;

    @Override
    public int compareTo(Figura otraFigura) {
        return Double.compare(this.area, otraFigura.area);
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

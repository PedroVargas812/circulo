package figuras_geometricas;

public abstract class figura {

    protected double valor1;

    public figura(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1() {
        this.valor1 = valor1;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

}
package figuras_geometricas;

public class Cuadrado extends figura {

    public Cuadrado(double lado) {
        super(lado);
    }

    @Override
    public double getArea() {
        return valor1 * valor1;
    }

    @Override
    public double getPerimetro() {
        return 4 * valor1;
    }
}

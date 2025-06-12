package figuras_geometricas;

import java.awt.*;

public class CuadradoDibujable extends Cuadrado implements figuraDibujable {
    private int x, y;

    public CuadradoDibujable(double lado, int x, int y) {
        super(lado);
        this.x = x;
        this.y = y;
    }

    @Override
    public void setCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void dibujar2D(Graphics g) {
        g.drawRect(x, y, (int) valor1, (int) valor1);
    }
}

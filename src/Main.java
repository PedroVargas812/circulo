import figuras_geometricas.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        CirculoDibujable circulo = new CirculoDibujable(100, 200, 100);
        CuadradoDibujable cuadrado = new CuadradoDibujable(100, 50, 150);

        System.out.println("Círculo");
        System.out.println("Perímetro: " + circulo.getPerimetro());
        System.out.println("Área: " + circulo.getArea());

        System.out.println("\nCuadrado");
        System.out.println("Perímetro: " + cuadrado.getPerimetro());
        System.out.println("Área: " + cuadrado.getArea());

        JFrame frame = new JFrame("Dibujar figuras");
        JPanel panel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
            }
        };

        panel1.setPreferredSize(new Dimension(400, 400));
        frame.add(panel1);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

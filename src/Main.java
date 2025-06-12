import figuras_geometricas.CirculoDibujable;

import javax.swing.*;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        figuras_geometricas.CirculoDibujable circulo = new CirculoDibujable(100, 0, 0);

        System.out.println("El perimetro del circulo es: " + circulo.getPerimetro());
        System.out.println("El area del circulo es: " + circulo.getArea());

        JFrame frame = new JFrame("Dibujar circulo");
        JPanel panel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
            }
        };


        panel1.setPreferredSize(new Dimension(400, 400));
        frame.add(panel1);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}

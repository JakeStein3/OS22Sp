package Oswego;
import painter.SPainter;
import shapes.SCircle;
import java.awt.*;
import static javax.swing.SwingUtilities.invokeLater;
/*
Jacob Stein
A simple program that shows how to use the Simple Painter in java to show the Target Logo
1/29/22
SUNY OSWEGO
 */

public class Target {
    // THE SOLUTION TO TARGET PROBLEM.

    public static void main(String[] args) {
        invokeLater(Target::new);
    }
    private void paintTheImage() {
        SPainter klee = new SPainter("Red Dot", 600, 600);   // Object of type Spainter
        SCircle dot = new SCircle(200);
        klee.setColor(Color.RED);
        klee.paint(dot);
        SCircle dot1 = new SCircle( 133.33);
        klee.setColor(Color.WHITE);
        klee.paint(dot1);
        SCircle dot2 = new SCircle(66.66);
        klee.setColor(Color.RED);
        klee.paint(dot2);

    }

    // REQUIRED INFRASTRUCTURE

    public Target() {
        paintTheImage();
    }



}








/*
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Target {
    // THE SOLUTION TO TARGET PROBLEM.
    private void paintTheImage() {


        JFrame frame = new JFrame("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                int centerX = getWidth() / 2;
                int centerY = getHeight() / 2;

                // draw the red circle
                g2.setColor(Color.RED);
                Ellipse2D.Double dot = new Ellipse2D.Double(centerX - 200, centerY - 200, 400, 400);
                g2.fill(dot);

                // draw the white circle
                g2.setColor(Color.WHITE);
                Ellipse2D.Double dot1 = new Ellipse2D.Double(centerX - 133.33, centerY - 133.33, 266.66, 266.66);
                g2.fill(dot1);

                // draw the red circle
                g2.setColor(Color.RED);
                Ellipse2D.Double dot2 = new Ellipse2D.Double(centerX - 66.66, centerY - 66.66, 133.33, 133.33);
                g2.fill(dot2);
            }
        };
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    // REQUIRED INFRASTRUCTURE

    public Target() {
        paintTheImage();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Target::new);
    }
}
 */
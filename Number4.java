/*
Jacob Stein
5/2/2022
Final Project CS1
 */
package Oswego;
import painter.SPainter;
import shapes.SCircle;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Number4 {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static Color getColor() {
        String nss = JOptionPane.showInputDialog(null,"Enter a color");
        Scanner scanner = new Scanner(nss);
        String colorName = scanner.next();
        if (colorName.equalsIgnoreCase("blue")) {
            return Color.BLUE;
        } else if (colorName.equalsIgnoreCase("red")) {
            return Color.RED;
        } else if (colorName.equalsIgnoreCase("green")) {
            return Color.GREEN;
        }
        return Color.BLACK;
    }
    private static class ThreadForGUI implements Runnable {
        @Override
        public void run() {
            new Number4();
        }
    }
    public Number4() {
        createTheImage();
    }
    private static void createTheImage() {

        int nrOfRows = getNumber("rows");
        int nrOfColumns = getNumber("columns");
        int sizeOfCircle = getNumber("circle size");
        Color color = getColor();


        SPainter miro = new SPainter ("Number 4" , 600, 600);
        miro.setBrushWidth(4);
        SCircle circle = new SCircle(sizeOfCircle);


        paintRectangle(miro, circle, nrOfRows, nrOfColumns, color);
    }
    private static int getNumber(String prompt) {
        String nss = JOptionPane.showInputDialog(null,prompt+"?");
        Scanner scanner = new Scanner(nss);
        return scanner.nextInt();
    }
    private static void paintRectangle(SPainter miro, SCircle circle,
                                       int nrOfRows, int nrOfColumns, Color color) {

        miro.mlt(((nrOfColumns - 1)/2.0) * circle.radius());
        miro.mbk(((nrOfRows - 1)/2.0) * circle.radius());


        int i = 1;
        while (i <= nrOfRows) {
            paintOneRow(miro, nrOfColumns, circle, color);
            miro.mfd(circle.radius());
            i = i + 1;
        }

        miro.mrt(((nrOfColumns-1)/2.0) * circle.radius());
        miro.mfd(((nrOfRows-1)/2.0) * circle.radius());
    }
    private static void paintOneRow(SPainter miro,
                                    int nrOfColumns, SCircle circle, Color color) {
        int i = 1;
        while(i <= nrOfColumns) {
            miro.setColor(color);
            circle.s2();
            miro.paint(circle);
            miro.setColor(Color.WHITE);
            miro.draw(circle);
            circle.x2();
            miro.mrt(circle.radius());
            i = i + 1;
        }
        miro.mlt(nrOfColumns*circle.radius());
    }


}


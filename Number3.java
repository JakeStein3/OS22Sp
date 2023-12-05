package Oswego;
import painter.SPainter;
import shapes.SCircle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Number3 {
    //The solution to the graphical problem
    private void paintTheImage() {
        //Get the input information from the user.
        int nrOfRows = getNumber("rows");
        int nrOfColumns = getNumber("columns");
        int sizeOfCircle = getNumber("Circle radius length");
        //Establish the painter
        int height = nrOfRows * sizeOfCircle;
        int width = nrOfColumns * sizeOfCircle;
        SPainter miro = new SPainter("Number 3", (height * 2)+50, (width * 2)+50);
        miro.setBrushWidth(4);
        SCircle dot = new SCircle(sizeOfCircle);
        //Paint the rectangles
        paintRectangle(miro, dot, nrOfRows, nrOfColumns);
    }

    private static int getNumber(String prompt) {
        String nss = JOptionPane.showInputDialog(null, prompt + "?");
        Scanner scanner = new Scanner(nss);
        return scanner.nextInt();
    }

    private static void paintRectangle(SPainter miro, SCircle dot, int nrOfRows, int nrOfColumns) {
        //Position the painter to paint the rectangle of squares.
        miro.mlt(((nrOfColumns - 1) / 2.0) * dot.diameter());
        miro.mbk(((nrOfRows - 1) / 2.0) * dot.diameter());
        //Paint the rectangle of squares.
        int i = 1;
        while (i <= nrOfRows) {
            paintOneRow(miro, nrOfColumns, dot);
            miro.mfd(dot.diameter());
            i = i + 1;

        }
        //Make the method invariant with respect to the painter position
        miro.mrt(((nrOfColumns - 1) / 2.0) * dot.diameter());
        miro.mfd(((nrOfRows - 1) / 2.0) * dot.diameter());
    }

    private static void paintOneRow(SPainter miro, int nrOfColumns, SCircle dot) {
        int i = 1;
        while (i <= nrOfColumns) {
            paintOneCircle(miro, dot);
            miro.mrt(dot.diameter());
            i = i + 1;
        }
        miro.mlt(nrOfColumns * dot.diameter());
    }

    private static void paintOneCircle(SPainter miro, SCircle dot) {
        dot.s2();
        miro.setColor(randomColor());
        miro.paint(dot);
        dot.x2();
    }

    private static Color randomColor() {
        Random rgen = new Random();
        int r = rgen.nextInt(256);
        int g = rgen.nextInt(256);
        int b = rgen.nextInt(256);
        return new Color(r, b, g);
    }

    public Number3() {
        paintTheImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Number3();
            }
        });
    }
}
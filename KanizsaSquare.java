package Oswego;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;

public class KanizsaSquare {

    private void paintTheImage() {

        SPainter painter = new SPainter("Kanizsa Square",400,400);
        SCircle dot = new SCircle(75);
        paintBlueCircle(painter, dot);
        paintRedCircle(painter, dot);
        paintGreenCircles(painter, dot);
        SSquare square = new SSquare(200);
        paintWhiteSquare(painter, square);
    }

    private void paintBlueCircle(SPainter painter, SCircle dot) {
        painter.setScreenLocation(-5, 5);
        painter.setColor(Color.blue);
        painter.paint(dot);
        painter.setScreenLocation(0, 0);



    }

    private void paintRedCircle(SPainter painter, SCircle dot) {
        painter.setScreenLocation(5, -5);
        painter.setColor(Color.RED);

        painter.setScreenLocation(0, 0);


    }

    private void paintWhiteSquare(SPainter painter, SSquare square) {
        painter.setScreenLocation(0, 0);
        painter.setColor(Color.WHITE);

        painter.setScreenLocation(0, 0);

    }

    private void paintGreenCircles(SPainter painter, SCircle dot) {
        painter.setScreenLocation(0, 0);
        painter.setColor(Color.GREEN);

        painter.setScreenLocation(0, 0);

    }


    // REQUIRED INFRASTRUCTURE
    public KanizsaSquare() {
        paintTheImage();
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
                                       public void run() {

                                       }

                                   }
        )
        ; }
}

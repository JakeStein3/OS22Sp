package Oswego;

import painter.SPainter;
import shapes.SRectangle;
import javax.swing.*;
import java.awt.*;


public class RedCross {

    private void paintTheImage() {
        SPainter klee = new SPainter("Red Cross", 600, 600);
        SRectangle tan = new SRectangle(500 ,100 );
        klee.setColor(Color.RED);
        klee.paint(tan);

        // move rectangle to left
        klee.tl();
        klee.setColor(Color.RED);
        klee.paint(tan);


    }



    // REQUIRED INFRASTRUCTURE
    public RedCross() {
        paintTheImage();
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(RedCross::new)
        ; }
}

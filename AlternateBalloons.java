package Oswego;

import painter.SPainter;
import shapes.SCircle;
import shapes.SSquare;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AlternateBalloons {

    // REQUIRED INFRASTRUCTURE

    public AlternateBalloons(){

        paintTheImage();
    }

    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AlternateBalloons();
            }
        });

    }
    // THE PAINTER DOING ITS THING

    private void paintTheImage() {
        SPainter painter = new SPainter("AlternateBalloons",600,600);
        paintSky(painter); // ask IntelliJ to generate the stub
        int nrOfBalloons = 300;
        paintBalloons(painter,nrOfBalloons); // ask IntelliJ to generate the stub
    }

    private void paintSky(SPainter painter) {
        painter.setColor(Color.BLUE);
        SSquare sky = new SSquare(2000);
        painter.paint(sky);
    }
    private void paintBalloons(SPainter painter, int nrOfBalloons){
        int i = 1;
        while (i <= nrOfBalloons) {
            paintOneBalloon(painter); // ask IntelliJ to generate the stub
            i = i + 1;

        }
    }

    private void paintOneBalloon(SPainter painter) {
        Random rgen = new Random();
        int rn = rgen.nextInt(6);
        if ( rn == 0) {
            painter.setColor(Color1());
        } else if ( rn == 1 ){
            painter.setColor(Color2());
        } else if ( rn == 2 ){
            painter.setColor(Color3());
        } else if ( rn == 3 ){
            painter.setColor(Color4());
        } else if ( rn == 4 ){
            painter.setColor(Color5());
        } else {
            painter.setColor(Color6());
        }
        painter.move();
        int balloonRadious = 30 ;
        SCircle balloon = new SCircle (balloonRadious);
        painter.paint(balloon);
        painter.setColor(Color.BLACK);
        painter.draw(balloon);
    }

    private Color Color6() {
        return new Color(0,70,100);
    }

    private Color Color5() {
        return new Color (100, 10,0);
    }

    private Color Color4() {
        return new Color (0,130,00);
    }

    private Color Color3() {
        return new Color (190,0,0);
    }

    private Color Color2() {
        return new Color (100,120,0,200);
    }

    private Color Color1() {
        return new Color (500);
    }

}
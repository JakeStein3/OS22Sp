package Oswego;

import shapes.SCircle;
import shapes.SSquare;

public class YellowSpace {
    public static void main(String[] args) {
        double bigGraySide = 400;
        double bigdiamond = 60;
        double smallsquare = 30;
        double smalldiamond = 15;
        double radious1 = (bigGraySide/2)- bigdiamond;
        SCircle circle1 = new SCircle(radious1);
        SSquare bigyellowdiamond = circle1.inscribingSquare();
        System.out.println("area of big yellow diamond = " + bigyellowdiamond.area());
        double radious2 = (bigyellowdiamond.side()/2)-smallsquare;
        SCircle circle2 = new SCircle (radious2);
        SSquare smallgraysquare = circle2.inscribingSquare();
        System.out.println("area of small gray square = " + smallgraysquare.area());
        double radious3 = (smallgraysquare.side()/2)- smalldiamond;
        SCircle circle3 = new SCircle (radious3);
        SSquare smallyellowdiamond = circle3.inscribingSquare();
        System.out.println("area of small yellow diamond = " + smallyellowdiamond.area());
        double yellowspace = (bigyellowdiamond.area()-smallgraysquare.area())+smallyellowdiamond.area();
        System.out.println("area of Yellow Space = " + yellowspace);

    }
}
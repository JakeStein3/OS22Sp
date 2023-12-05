package Oswego;

import shapes.SCircle;
import shapes.SRectangle;
import shapes.SSquare;

public class MessyDesk {
    public static void main(String[] args) {
        messDesk();
    }
    public static void messDesk(){
        int deskHeight = 66; int deskWidth = 153;
        double notebooks = 29.7; int bookWidth = 21;
        double sizeLB = 25.4 ; double sizeLBWidth = 30.48;
        double cupRadius = 2.52;
        double plateRadius = 20.6;
        SRectangle desk = new SRectangle(deskHeight,deskWidth);
        SRectangle books = new SRectangle(notebooks*2,bookWidth*2);
        SRectangle LB = new SRectangle(sizeLB, sizeLBWidth);
        SCircle cups = new SCircle(cupRadius*3);
        SCircle plates = new SCircle(plateRadius*3);
        SSquare coasters = cups.circumscribingSquare();

        double collectiveArea = ((((desk.area()+books.area()+ LB.area()+cups.area()+plates.area()+coasters.area()))));
        double deskTop = getDeskTop(desk);

        System.out.println("Area of Messy Desk: " + collectiveArea);
        System.out.println("Area of Clean Desk: " + deskTop);

    }

    private static double getDeskTop(SRectangle desk) {
        double deskTop = desk.area();
        return deskTop;
    }
}

package Oswego;

import shapes.SCircle;
import shapes.SSquare;

public class WhiteSpace {
    public static void main(String[] args) {
        double edgeLength = 19;
        double dotDiameter = (edgeLength / 8);
        SSquare dieFace = new SSquare(edgeLength);
        SCircle dieDot = new SCircle(.5 * dotDiameter);

        double faceArea = dieFace.area();
        double dotArea = dieDot.area();

        int i = 1;
        double facesArea = 0;
        double dotsArea = 0;
        while(i <= 6) {
            facesArea += faceArea;
            dotsArea += (i * dotArea);
            i++;
        }

        double whiteArea = (facesArea - dotsArea);
        System.out.println("Area of white space: " + whiteArea);
    }
}
package Oswego;

import shapes.SSquare;
import java.util.Scanner;

public class SurfaceAreaOfCube {

    public static void main(String[] args) {
        double edgeLength = edgeLength();
        double surfaceArea = surfaceArea(edgeLength);
        System.out.println("surface area = " + surfaceArea);
    }
    private static double edgeLength() {
        System.out.print("Please enter the edge length of the cube: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    private static double surfaceArea(double edgeLength) {
        SSquare face = new SSquare(edgeLength);
        int nrOfFaces = 6;
        return face.area() * nrOfFaces;
    }
}
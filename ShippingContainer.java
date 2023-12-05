package Oswego;

import shapes.SRectangle;

import java.util.Scanner;

public class ShippingContainer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type width, length, and height separately");
        double width = sc.nextDouble(); double length = sc.nextDouble(); double height = sc.nextDouble();
        SRectangle face = new SRectangle(width, length);
        SRectangle key = new SRectangle(face.diagonal(), height);
        System.out.println("Length of object: " + key.diagonal());
    }
    public static Double rec(SRectangle key) {
        for (int i = 0; i < 5; i++) {
           double d = key.height();
            if (key.diagonal() < key.height()) {
               return key.diagonal();

            }
            else{
                System.out.println("Just fine");
            }
        }
        return -1.0;
    }
}
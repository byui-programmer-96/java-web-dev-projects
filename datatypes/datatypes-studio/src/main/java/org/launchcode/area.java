package org.launchcode;

import java.util.Scanner;

public class area {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please Enter a Radius:");
        double radius = input.nextDouble();
        double area = circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is :" + area);

        input.close();
    }
}

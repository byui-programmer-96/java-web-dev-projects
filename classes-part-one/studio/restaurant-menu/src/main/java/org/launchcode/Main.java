package org.launchcode;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem(name: "Meat Lovers Pizza", description: "A hot slice of pizza with bacon, ham, and sausage.", price:3.50, category:"main course");


        System.out.println(item1.isNew());
    }
}

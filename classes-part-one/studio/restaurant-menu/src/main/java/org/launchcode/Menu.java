package org.launchcode;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDateTime lastUpdated;


    // Allow for default constructor


    public ArrayList<MenuItem> getMenuItems() {

        return menuItems;
    }
}

@Override
public String toString () {
    StringBuilder appetizers = new StringBuilder();
    for (MenuItem item: menuItems){
        appetizers.append("\n").append(item.toString()).append("\n");
    }
}
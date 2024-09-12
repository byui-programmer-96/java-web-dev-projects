package org.launchcode;

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

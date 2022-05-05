package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Grid2 {
    private final HashMap<Coordinate, Module> modules;

    public Grid2(HashMap<Coordinate, Module> modules) {
        this.modules = modules;
    }

    public HashMap<Coordinate, Module> getModules() {
        return modules;
    }

    public ArrayList<Coordinate> findProduct(Product product) {
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        modules.forEach((Coordinate c, Module mod) -> {
            int n = mod.findHighestProduct(product);
            if (n >= 0) {
                coordinates.add(c);
            }
        });
        return coordinates;
    }


}


package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Grid {
    private final Module[][] modules;

    public Grid(Module[][] modules) {
        this.modules = modules;
    }

    public Module[][] getModules() {
        return modules;
    }
    
    public ArrayList<Coordinate> findProduct(Product product){
        ArrayList<Coordinate> coordinates = new ArrayList<>();

        for (int x=0; x< modules.length; x++){
            for (int y=0; y< modules[x].length; y++){
                int n = modules[x][y].findHighestProduct(product);
                if(n>=0){
                    coordinates.add(new Coordinate(x,y,n));
                }
            }
        }

        return coordinates;
    }
    
    
}

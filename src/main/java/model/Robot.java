package model;

import java.util.HashMap;

public class Robot {
    private Grid grid;
    private int positionX;
    private int positionY;

    public HashMap<Coordinate, Float> findNeighboursTravelTime(){
        HashMap<Coordinate, Float> neighboursTravelTime = new HashMap<>();
        Module currentModule = grid.getModules()[positionX][positionY];

        addCoordinatesToList(currentModule, positionX, positionY+1, neighboursTravelTime);
        addCoordinatesToList(currentModule, positionX+1, positionY, neighboursTravelTime);
        addCoordinatesToList(currentModule, positionX-1, positionY, neighboursTravelTime);
        addCoordinatesToList(currentModule, positionX, positionY-1, neighboursTravelTime);

        return neighboursTravelTime;
    }

    public boolean isValidIndex(Module[] arr, int index) {
        return index >= 0 && index < arr.length;
    }

    public boolean isValidIndex(Module[][] arr, int index) {
        return index >= 0 && index < arr.length;
    }

    private void addCoordinatesToList(Module currentModule, int X, int Y, HashMap<Coordinate, Float> neighboursTravelTime ){
        if (isValidIndex(grid.getModules(),X)
                && isValidIndex(grid.getModules()[X],Y)) {
            Float neighboursTime = currentModule.countTravelTimeToModule(grid.getModules()[X][Y]);
            if(neighboursTime>=0){
                neighboursTravelTime.put(new Coordinate(X, Y), neighboursTime);
            }
        }
    }
}

package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Robot2 {
    public Grid2 grid;
    public int positionX;
    public int positionY;

    public HashMap<Coordinate, Float> findNeighboursTravelTime() {
        HashMap<Coordinate, Float> neighboursTravelTime = new HashMap<>();
        Module currentModule = grid.getModules().get(new Coordinate(positionX, positionY));

        addCoordinatesToList(currentModule, positionX, positionY + 1, neighboursTravelTime);
        addCoordinatesToList(currentModule, positionX + 1, positionY, neighboursTravelTime);
        addCoordinatesToList(currentModule, positionX - 1, positionY, neighboursTravelTime);
        addCoordinatesToList(currentModule, positionX, positionY - 1, neighboursTravelTime);

        return neighboursTravelTime;
    }

    public ArrayList<Coordinate> findNeighbours() {
        ArrayList<Coordinate> a = new ArrayList<>();
        Module currentModule = grid.getModules().get(new Coordinate(positionX, positionY));

        addCoordinatesToList2(currentModule, positionX, positionY + 1, a);
        addCoordinatesToList2(currentModule, positionX + 1, positionY, a);
        addCoordinatesToList2(currentModule, positionX - 1, positionY, a);
        addCoordinatesToList2(currentModule, positionX, positionY - 1, a);

        return a;
    }

    private void addCoordinatesToList(Module currentModule, int X, int Y, HashMap<Coordinate, Float> neighboursTravelTime) {
        Module module = grid.getModules().get(new Coordinate(X, Y));
        if (module == null) {
            return;
        }
        Float neighboursTime = currentModule.countTravelTimeToModule(module);
        if (neighboursTime < 0) {
            return;
        }
        neighboursTravelTime.put(new Coordinate(X, Y), neighboursTime);

    }

    private void addCoordinatesToList2(Module currentModule, int X, int Y, ArrayList<Coordinate> arrayList) {
        Module module = grid.getModules().get(new Coordinate(X, Y));
        if (module == null) {
            return;
        }
        Float neighboursTime = currentModule.countTravelTimeToModule(module);
        if (neighboursTime < 0) {
            return;
        }
        arrayList.add(new Coordinate(X, Y));

    }
}

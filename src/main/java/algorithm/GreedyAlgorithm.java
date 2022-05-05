package algorithm;

import model.Coordinate;
import model.Grid2;
import model.Module;
import model.Robot2;

import java.util.ArrayList;
import java.util.HashMap;

public class GreedyAlgorithm {

    public ArrayList<Coordinate> currentShortestPath = new ArrayList<>();
    public float currentShortestTime = Float.MAX_VALUE;

//    public ArrayList<Coordinate> findShortestPath(Grid2 grid, Coordinate start, Coordinate finish) {
//        ArrayList<Coordinate> shortestPath = new ArrayList<>();
//        HashMap<Coordinate, Boolean> visited = new HashMap<>();
//        grid.getModules().forEach((Coordinate c, Module m) -> {
//            visited.put(c, false);
//        });
//        visited.put(start, true);
//
//
//    }

    public ArrayList<Coordinate> start(Grid2 grid, Coordinate start, Coordinate finish) {
        Robot2 robot2 = new Robot2();
        robot2.grid = grid;
        robot2.positionX = start.getX();
        robot2.positionY = start.getY();
        ArrayList<Coordinate> cp = new ArrayList<>();
        cp.add(start);
        path(robot2, cp, finish, 0F);
        return currentShortestPath;
    }

    public void path(Robot2 robot, ArrayList<Coordinate> currentPath, Coordinate finish, float currentTime) {
        for (Coordinate coord :
                robot.findNeighbours()) {
            if (currentPath.contains(coord)) {
                return;
            }
            if (coord.equals(finish)) {
                if (currentShortestTime > currentTime)
                {
                    currentShortestTime = currentTime;
                    currentShortestPath = currentPath;
                }
                    return;
            }
            currentPath.add(coord);
            currentTime += robot.grid.getModules().get(new Coordinate(robot.positionX, robot.positionY)).countTravelTimeToModule(robot.grid.getModules().get(coord));
            path(robot, currentPath, finish, currentTime);
        }
    }
}

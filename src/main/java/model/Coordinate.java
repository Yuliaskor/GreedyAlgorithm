package model;

import java.util.Objects;

public class Coordinate {
    private final int X;
    private final int Y;
    private final Integer N;

    public Coordinate(int x, int y, int n) {
        X = x;
        Y = y;
        N = n;
    }
    public Coordinate(int x, int y) {
        X = x;
        Y = y;
        N = null;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Integer getN() {
        return N;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return X == that.X && Y == that.Y && Objects.equals(N, that.N);
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y, N);
    }
}

package ru.pavelnix;

public class Point {
    private final float coordinateX;
    private final float coordinateY;

    public Point(float coordinateX, float coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public float getCoordinateX() {
        return coordinateX;
    }

    public float getCoordinateY() {
        return coordinateY;
    }
}

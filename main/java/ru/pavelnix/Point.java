package ru.pavelnix;

public class Point {
    private float coordinateX;
    private float coordinateY;

    public Point(float coordinateX, float coordinateY) {
        setCoordinateX(coordinateX);
        setCoordinateY(coordinateX);
    }

    public float getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(float coordinateX) {
        this.coordinateX = coordinateX;
    }

    public float getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(float coordinateY) {
        this.coordinateY = coordinateY;
    }
}

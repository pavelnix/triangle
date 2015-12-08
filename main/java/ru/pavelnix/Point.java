package ru.pavelnix;

/**
 * Класс Point - служит для хранения координат точки на плоскости
 * Class Point - used to store the coordinates of the plane
 *
 */
public class Point {
    private final float x;
    private final float y;

    /**
     * Конструктор класса
     * The class constructor
     *
     * @param x - координата по оси Х
     *          axis coordinate X
     * @param y - координата по оси Y
     *          axis coordinate Y
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter
     *
     * @return - возвращает коодинату по оси X
     * axis coordinate X
     */
    public float getX() {
        return x;
    }

    /**
     * Getter
     *
     * @return - возвращает коодинату по оси Y
     *  axis coordinate Y
     */
    public float getY() {
        return y;
    }
}

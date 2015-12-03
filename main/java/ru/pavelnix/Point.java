package ru.pavelnix;

/**
 * Класс Point - служит для хранения координат точки на плоскости
 */
public class Point {
    private final float x;
    private final float y;

    /**
     * Конструктор класса
     *
     * @param x - координата по оси Х
     * @param y - координата по оси Y
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Геттер
     *
     * @return - возвращает коодинату по оси X
     */
    public float getX() {
        return x;
    }

    /**
     * Геттер
     *
     * @return - возвращает коодинату по оси Y
     */
    public float getY() {
        return y;
    }
}

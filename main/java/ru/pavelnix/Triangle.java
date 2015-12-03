package ru.pavelnix;

/**
 * Класс треугольника
 */
public class Triangle {
    /**
     * vertexA - первая вершина трегольника
     * vertexB - вторая вершина трегольника
     * vertexC - третья вершина трегольника
     */
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    /**
     * Конструктор треугольника
     *
     * @param vertexA - первая вершина трегольника
     * @param vertexB - вторая вершина трегольника
     * @param vertexC - третья вершина трегольника
     */
    public Triangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    /**
     * Метод, который считает площадь треугольника
     *
     * @return - площадь треугольника
     */
    public float square() {

        return 1f / 2 * Math.abs((vertexB.getX() - vertexA.getX()) * (vertexC.getY() - vertexA.getY()) -
                (vertexC.getX() - vertexA.getX()) * (vertexB.getY() - vertexA.getY()));
    }

}

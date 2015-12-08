package ru.pavelnix;

/**
 * Класс, с помощью которого проверяется существование треугольника
 * The class with which verified the existence of a triangle
 */
public class ValidateTriangle {
    /**
     * vertexA - первая вершина треугольника
     *          the first vertex of the triangle
     * vertexB - вторая вершина треугольника
     *          the second vertex of the triangle
     * vertexC - третья вершина треугольника
     *          the third vertex of the triangle
     */
    private Point vertexA;
    private Point vertexB;
    private Point vertexC;

    /**
     * Конструктор треугольника
     * The class constructor
     *
     * @param vertexA - первая вершина треугольника
     *          the first vertex of the triangle
     * @param vertexB - вторая вершина треугольника
     *          the second vertex of the triangle
     * @param vertexC - третья вершина треугольника
     *          the third vertex of the triangle
     */
    public ValidateTriangle(Point vertexA, Point vertexB, Point vertexC) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
        this.vertexC = vertexC;
    }

    /**
     * Метод для подсчета длины стороны
     * The method for calculating the length of the side
     *
     * @param vertexA - первая вершина треугольника
     *          the first vertex of the triangle
     * @param vertexB - вторая вершина треугольника
     *          the second vertex of the triangle
     * @return длину стороны
     *          length of side
     */
    private float lengthSide(Point vertexA, Point vertexB) {
        return (float) Math.hypot(vertexA.getX() - vertexB.getX(),
                vertexA.getY() - vertexB.getY());
    }

    /**
     * метод, который проверяет существование треугольника
     * a method that checks for the existence of a triangle
     *
     * @return истину, если треугольник существует и ложь, если нет
     * returns true if the triangle exists and false if it does not exist
     */
    public boolean validate() {
        float sideAB = lengthSide(vertexA, vertexB);
        float sideAC = lengthSide(vertexA, vertexC);
        float sideBC = lengthSide(vertexB, vertexC);

        return ((sideAB < sideAC + sideBC) &&
                (sideAC < sideAB + sideBC) &&
                (sideBC < sideAB + sideAC));
    }
}
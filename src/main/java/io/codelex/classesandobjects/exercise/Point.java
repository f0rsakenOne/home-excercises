package io.codelex.classesandobjects.exercise;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args){
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
    public static void swapPoints(Point firstPoint, Point secondPoint) {
        int tempX= firstPoint.x;
        int tempY= firstPoint.y;
        firstPoint.x= secondPoint.x;
        firstPoint.y= secondPoint.y;
        secondPoint.x=tempX;
        secondPoint.y=tempY;
    }
}

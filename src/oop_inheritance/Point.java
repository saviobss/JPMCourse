package oop_inheritance;

public class Point {
    private int x;
    private int y;

    public Point(){
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    public void setX (int x) {
        this.x = x;
    }
    public void setY (int y) {
        this.y = y;
    }

    public double distance () {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public double distance (int x, int y ) {
        return Math.sqrt( (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance (Point p) {
        return Math.sqrt(( this.x - p.x)*(this.x - p.x) + (this.y - p.y)* (this.y - p.y));
    }
}

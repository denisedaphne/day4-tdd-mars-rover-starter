package com.afs.tdd;

public class Location {
<<<<<<< HEAD
    private int x;
    private int y;
    private Direction direction;

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

=======
>>>>>>> 92538cb88936d9dc581d65daad243ee2bf512a54
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

<<<<<<< HEAD
    public void setDirection(Direction direction) {
        if (direction != null) {
            this.direction = direction;
        }
=======
    private int x;
    private int y;
    private Direction direction;

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
>>>>>>> 92538cb88936d9dc581d65daad243ee2bf512a54
    }

    public void setDirection(Direction direction) {
        if (direction != null) {
            this.direction = direction;
        }
    }
}

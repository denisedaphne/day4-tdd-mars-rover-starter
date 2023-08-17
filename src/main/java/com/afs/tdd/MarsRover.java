package com.afs.tdd;

public class MarsRover {
<<<<<<< HEAD
    private final Location location;
=======

    private Location location;
>>>>>>> 92538cb88936d9dc581d65daad243ee2bf512a54

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
<<<<<<< HEAD
        if (givenCommand == Command.MOVE) {
            move();
        } else if (givenCommand == Command.TURN_LEFT) {
            turnLeft();
        } else if (givenCommand == Command.TURN_RIGHT) {
            turnRight();
        }
    }

    public void executeBatchCommands(Command[] commands) {
        for (Command command : commands) {
            executeCommand(command);
        }
    }

    private void move() {
        switch (location.getDirection()) {
            case NORTH:
                location.setY(location.getY() + 1);
                break;
            case EAST:
                location.setX(location.getX() + 1);
                break;
            case SOUTH:
                location.setY(location.getY() - 1);
                break;
            case WEST:
                location.setX(location.getX() - 1);
                break;
        }
    }

    private void turnLeft() {
        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(Direction.WEST);
                break;
            case WEST:
                location.setDirection(Direction.SOUTH);
                break;
            case SOUTH:
                location.setDirection(Direction.EAST);
                break;
            case EAST:
                location.setDirection(Direction.NORTH);
                break;
        }
    }

    private void turnRight() {
        switch (location.getDirection()) {
            case NORTH:
                location.setDirection(Direction.EAST);
                break;
            case EAST:
                location.setDirection(Direction.SOUTH);
                break;
            case SOUTH:
                location.setDirection(Direction.WEST);
                break;
            case WEST:
                location.setDirection(Direction.NORTH);
                break;
=======
        if(givenCommand == Command.MOVE) {
            if(location.getDirection() == Direction.NORTH){
                location.setY(location.getY() + 1);
            }
>>>>>>> 92538cb88936d9dc581d65daad243ee2bf512a54
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}

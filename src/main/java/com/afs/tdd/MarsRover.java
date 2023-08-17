package com.afs.tdd;

import static java.nio.file.Files.move;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            if(location.getDirection() == Direction.NORTH){
                location.setY(location.getY() + 1);
            }
        } else if (givenCommand == Command.TURN_LEFT) {
            turnLeft();
        } else if (givenCommand == Command.TURN_RIGHT) {
            turnRight();
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

    public Location getCurrentLocation() {
        return location;
    }
}

package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            move();
        } else if (givenCommand == Command.TURN_LEFT) {
            turnLeft();
        } else if (givenCommand == Command.TURN_RIGHT) {
            turnRight();
        }
    }

    public void executeBatchCommands(List<Command> commandList) {
        commandList.forEach(this::executeCommand);
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

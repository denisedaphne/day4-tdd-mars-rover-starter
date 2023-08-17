package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_North_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_North_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_0_0_East_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_West_and_command_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_South_and_command_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, Direction.values()[(currentLocation.getDirection().ordinal() + 1) % Direction.values().length]);
    }

    @Test
    void should_change_to_location_1_0_E_when_executeCommand_given_0_0_East_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_South_and_commands_TurnRight_TurnLeft() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command[] givenCommands = { Command.TURN_RIGHT, Command.TURN_LEFT };
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        for (Command command : givenCommands) {
            marsRover.executeCommand(command);
        }
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, Direction.values()[(currentLocation.getDirection().ordinal() + 1) % Direction.values().length]);
    }

    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_0_0_West_and_commands_TurnRight_TurnRight_TurnRight() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command[] givenCommands = { Command.TURN_RIGHT, Command.TURN_RIGHT, Command.TURN_RIGHT };
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        for (Command command : givenCommands) {
            marsRover.executeCommand(command);
        }
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_1_S_when_executeCommand_given_0_0_South_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY()+1);
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_minus1_0_W_when_executeCommand_given_0_0_West_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(-1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_1_0_N_when_executeBatchCommands_given_0_0_North_and_commands_Move_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command[] givenCommands = { Command.MOVE, Command.MOVE };
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(givenCommands);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(2, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

}

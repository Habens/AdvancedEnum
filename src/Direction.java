package com.twu.refactoring;

public enum Direction {
    NORTH {
        @Override
        Direction turnRight() {
            return EAST;
        }

        @Override
        Direction turnLeft() {
            return WEST;
        }
    },
    SOUTH {
        @Override
        Direction turnRight() {
            return WEST;
        }

        @Override
        Direction turnLeft() {
            return EAST;
        }
    },
    EAST {
        @Override
        Direction turnRight() {
            return SOUTH;
        }

        @Override
        Direction turnLeft() {
            return NORTH;
        }
    },
    WEST {
        @Override
        Direction turnRight() {
            return NORTH;
        }

        @Override
        Direction turnLeft() {
            return SOUTH;
        }
    };

    abstract Direction turnRight();
    abstract Direction turnLeft();
}

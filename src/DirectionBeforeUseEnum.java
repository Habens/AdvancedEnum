package com.twu.refactoring;

public class DirectionBackup {
    private final char direction;

    public DirectionBackup(char direction) {
        this.direction = direction;
    }

    public DirectionBackup turnRight() {
        switch (direction) {
            case 'N':
                return new DirectionBackup('E');
            case 'S':
                return new DirectionBackup('W');
            case 'E':
                return new DirectionBackup('N');
            case 'W':
                return new DirectionBackup('S');
            default:
                throw new IllegalArgumentException();
        }
    }

    public DirectionBackup turnLeft() {
        switch (direction) {
            case 'N':
                return new DirectionBackup('W');
            case 'S':
                return new DirectionBackup('E');
            case 'E':
                return new DirectionBackup('N');
            case 'W':
                return new DirectionBackup('S');
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DirectionBackup directionBackup1 = (DirectionBackup) o;

        if (direction != directionBackup1.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    @Override
    public String toString() {
        return "DirectionBackup{direction=" + direction + '}';
    }
}

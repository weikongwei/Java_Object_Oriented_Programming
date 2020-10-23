package com.OOP_WK;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)    // if the address are equal, meaning the same variable, return true
            return true;

        if (!(obj instanceof Point))    // if it is different referencing type, return false
            return false;

        var other = (Point) obj;
        return (other.x == x) && (other.y == y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

package com.algorithms;

import java.util.ArrayList;
import java.util.Objects;

public class PathFinder {

    public static ArrayList<Point> getPath(boolean[][] array) {
        ArrayList<Point> paths = new ArrayList<>();
        ArrayList<Point> failed = new ArrayList<>();
        getPath(array, array.length - 1, array[array.length - 1].length - 1, paths, failed);
        return paths;
    }


    private static boolean getPath(boolean[][] array, int i, int j, ArrayList<Point> path, ArrayList<Point> failed) {

        if (i < 0 || j < 0 || !array[i][j] || failed.contains(new Point(i, j))) {
            return false;
        }

        if ((i == 0 && j == 0) || getPath(array, i - 1, j, path, failed) || getPath(array, i, j - 1, path, failed)) {
            path.add(new Point(i, j));
            return true;
        }

        failed.add(new Point(i, j));
        return false;


    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x: " + x + ", y: " + y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}

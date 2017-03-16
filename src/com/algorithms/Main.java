package com.algorithms;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        boolean[][] array = {{true, true, true, true}, {true, true, true, true}, {true, true, true, true}, {true, true, true, true}};
        ArrayList<PathFinder.Point> path = PathFinder.getPath(array);
        path.forEach(System.out::println);
    }

}

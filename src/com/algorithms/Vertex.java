package com.algorithms;

class Vertex {
    int num;
    int color = 0;
    int dist = -1;
    int finish = -1;
    Vertex pre = null;


    Vertex(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        Vertex other;
        if (o instanceof Vertex) {
            other = (Vertex) o;
        } else {
            return false;
        }
        return this.num == other.num;
    }

    @Override
    public int hashCode() {
        return num;
    }
}
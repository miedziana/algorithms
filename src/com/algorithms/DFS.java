package com.algorithms;

import java.util.LinkedList;

public class DFS {

    static int time = 0;

    public static void DFSTraversal(LinkedList<Vertex>[] graph, Vertex start) {
        time = 0;
        for (Vertex u : graph[start.num]) {
            if (u.color == 0) {
                DFSVisit(graph, u);
            }
        }
    }

    private static void DFSVisit(LinkedList<Vertex>[] graph, Vertex u) {
        time += 1;
        u.dist = time;
        u.color = 1;
        for (Vertex v : graph[u.num]) {
            if (v.color == 0) {
                v.pre = u;
                DFSVisit(graph, v);
            }
        }
        System.out.println(u.num);
        u.color = 2;
        time += 1;
        u.finish = time;

    }
}

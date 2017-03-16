package com.algorithms;

import java.util.*;

public class Dijkstra {

    public static int findShortestPath(LinkedList<Vertex>[] graph, int dest) {
        Set<Vertex> Q = new HashSet<Vertex>();

        LinkedList<Integer> dist = new LinkedList<>();
        Integer[] inQ = new Integer[graph.length];

        dist.add(0);
        Q.add(new Vertex(1));
        inQ[0] = 0;

        for (int i = 1; i < graph.length; i++) {
            dist.add(Integer.MAX_VALUE);
            inQ[i] = Integer.MAX_VALUE;
        }

        while (!Q.isEmpty() && Integer.MAX_VALUE == dist.get(dest - 1)) {
            List<Integer> inQList = Arrays.asList(inQ);
            Vertex u = new Vertex(inQList.indexOf(Collections.min(inQList)) + 1);
            Q.remove(u);

            int index = 0;
            for (Vertex v : graph[u.num - 1]) {
                if((v.num - u.num) < 1) {
                    if (dist.get(v.num - 1) == Integer.MAX_VALUE) {
                        dist.remove(v.num - 1);
                        dist.add(v.num - 1, dist.get(u.num - 1));
                        inQ[v.num - 1] = dist.get(u.num - 1);
                        if (!Q.contains(v)) {
                            Q.add(v);
                        }
                    }
                    break;
                }
                Integer alt = dist.get(u.num - 1) + ((index == 0 && (v.num - u.num) > 1) ? 0 : 1);
                if (alt < dist.get(v.num - 1)) {
                    dist.remove(v.num - 1);
                    dist.add(v.num - 1, alt);
                    inQ[v.num - 1] = alt;
                    if (!Q.contains(v)) {
                        Q.add(v);
                    }
                }
                index++;
            }
            inQ[u.num - 1] = Integer.MAX_VALUE;
        }
        Integer last = dist.get(dest - 1);
        return last == Integer.MAX_VALUE ? -1 : last;
    }
}

package com.leo.structure.graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class GraphTest {

    @Test
    public void test() {

        Vertex[] vertices = new Vertex[9];
        for (int i = 0; i < 9; i++) {
            vertices[i] = new Vertex(i);
        }
        Graph graph = new Graph(vertices);
        graph.addEdge(vertices[0], vertices[1]);
        graph.addEdge(vertices[0], vertices[3]);
        graph.addEdge(vertices[0], vertices[4]);
        graph.addEdge(vertices[1], vertices[2]);
        graph.addEdge(vertices[1], vertices[4]);
        graph.addEdge(vertices[3], vertices[6]);
        graph.addEdge(vertices[4], vertices[6]);
        graph.addEdge(vertices[4], vertices[8]);
        graph.addEdge(vertices[6], vertices[7]);
        graph.addEdge(vertices[2], vertices[5]);
        System.out.println(graph);

        System.out.println("DFS");
        System.out.println(graph.dfs());

        Assert.assertEquals(
                Arrays.asList(vertices[0], vertices[1], vertices[2], vertices[5], vertices[4], vertices[6],
                        vertices[3], vertices[7], vertices[8]),
                graph.dfs()
        );

        System.out.println("BFS");
        System.out.println(graph.bfs());

        Assert.assertEquals(
                Arrays.asList(vertices[0], vertices[1], vertices[3], vertices[4], vertices[2], vertices[6],
                        vertices[8], vertices[5], vertices[7]),
                graph.bfs()
        );

        System.out.println("Vertex 4 ShortestPath");
        System.out.println(graph.shortestPath(vertices[4]));

        Assert.assertEquals(
                Arrays.asList(vertices[0], vertices[4]),
                graph.shortestPath(vertices[4])
        );

        System.out.println("Vertex 6 ShortestPath");
        System.out.println(graph.shortestPath(vertices[6]));

        Assert.assertEquals(
                Arrays.asList(vertices[0], vertices[3], vertices[6]),
                graph.shortestPath(vertices[6])
        );
    }

    @Test
    public void testTopologySort() {
        Vertex[] vertices = new Vertex[5];
        for (int i = 1; i <= 5; i++) {
            vertices[i - 1] = new Vertex(i);
        }
        Graph graph = new Graph(vertices);
        graph.addDirectedEdge(vertices[0], vertices[3]);
        graph.addDirectedEdge(vertices[0], vertices[1]);
        graph.addDirectedEdge(vertices[1], vertices[3]);
        graph.addDirectedEdge(vertices[1], vertices[2]);
        graph.addDirectedEdge(vertices[2], vertices[4]);
        graph.addDirectedEdge(vertices[3], vertices[2]);
        graph.addDirectedEdge(vertices[3], vertices[4]);
        System.out.println("Topology Sort");
        System.out.println(graph.topologySort());

        Assert.assertEquals(Arrays.asList(
                vertices[0], vertices[1], vertices[3], vertices[2], vertices[4]
        ), graph.topologySort());
    }
}
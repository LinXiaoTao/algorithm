package com.leo.structure.graph;

import java.util.*;

/**
 * 图-邻接矩阵
 */
public class Graph {

    // 所有顶点
    private final Vertex[] vertices;

    // vertex to index
    private final Map<Vertex, Integer> vertexToIndex;

    // 所有的边，-1 表示没有边，0 表示无权边，> 0 表示带权边
    private final int[][] edges;

    // 用于遍历时，存储是否访问过
    private final boolean[] visited;

    // vertex to adjacent vertices
    private final Map<Vertex, Set<Vertex>> adjacentVertices;

    // 顶点的入度
    private final Map<Vertex, Integer> vertexToDegree;

    /**
     * 构建图
     *
     * @param vertices 顶点
     */
    public Graph(Vertex[] vertices) {
        this.vertices = vertices;
        edges = new int[vertices.length][vertices.length];
        adjacentVertices = new HashMap<>(vertices.length);
        vertexToDegree = new HashMap<>(vertices.length);
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices.length; j++) {
                edges[i][j] = -1;
            }
        }
        visited = new boolean[vertices.length];
        vertexToIndex = new HashMap<>(vertices.length);
        for (int i = 0; i < vertices.length; i++) {
            vertexToIndex.put(
                    vertices[i],
                    i
            );
        }
    }

    /**
     * 添加一条边
     *
     * @param v 顶点 v
     * @param w 顶点 w
     * @return this
     */
    public Graph addEdge(Vertex v, Vertex w) {
        edges[vertexToIndex.get(v)][vertexToIndex.get(w)] = 0;
        edges[vertexToIndex.get(w)][vertexToIndex.get(v)] = 0;

        Set<Vertex> adjVertices = adjacentVertices.getOrDefault(v, new HashSet<>());
        adjVertices.add(w);
        adjacentVertices.put(v, adjVertices);

        adjVertices = adjacentVertices.getOrDefault(w, new HashSet<>());
        adjVertices.add(v);
        adjacentVertices.put(w, adjVertices);
        return this;
    }

    /**
     * 添加一条有向边
     *
     * @param v 顶点 v
     * @param w 顶点 w
     * @return this
     */
    public Graph addDirectedEdge(Vertex v, Vertex w) {
        edges[vertexToIndex.get(v)][vertexToIndex.get(w)] = 0;

        Set<Vertex> adjVertices = adjacentVertices.getOrDefault(v, new HashSet<>());
        adjVertices.add(w);
        adjacentVertices.put(v, adjVertices);

        vertexToDegree.put(w, vertexToDegree.getOrDefault(w, 0) + 1);
        return this;
    }

    /**
     * 删除一条边
     *
     * @param v 顶点 v
     * @param w 顶点 w
     * @return this
     */
    public Graph removeEdge(Vertex v, Vertex w) {
        edges[vertexToIndex.get(v)][vertexToIndex.get(w)] = -1;
        edges[vertexToIndex.get(w)][vertexToIndex.get(v)] = -1;

        Set<Vertex> adjVertices = adjacentVertices.getOrDefault(v, new HashSet<>());
        adjVertices.remove(w);
        adjacentVertices.put(v, adjVertices);

        adjVertices = adjacentVertices.getOrDefault(w, new HashSet<>());
        adjVertices.remove(v);
        adjacentVertices.put(w, adjVertices);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < vertices.length; i++) {
            builder.append(vertices[i].getValue()).append("->");
            for (int j = 0; j < edges[i].length; j++) {
                if (edges[i][j] >= 0) {
                    // 存在边
                    builder.append(vertices[j].getValue()).append(",");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * 深度优先搜索
     *
     * @return dfs
     */
    public List<Vertex> dfs() {
        List<Vertex> dfs = new ArrayList<>(vertices.length);
        Arrays.fill(visited, false);
        internalDfs(dfs, vertices[0]);
        return dfs;
    }

    private void internalDfs(List<Vertex> dfs, Vertex vertex) {
        int vertexIndex = vertexToIndex.get(vertex);
        visited[vertexIndex] = true;
        dfs.add(vertex);
        int[] edge = edges[vertexIndex];
        for (int i = 0; i < edge.length; i++) {
            // 遍历边
            if (edge[i] == -1) continue;
            if (!visited[i])
                internalDfs(dfs, vertices[i]);
        }
    }

    /**
     * 广度优先遍历
     *
     * @return dfs
     */
    public List<Vertex> bfs() {
        List<Vertex> bfs = new ArrayList<>(vertices.length);
        internalBfs(bfs, null);
        return bfs;
    }

    /**
     * 广度优先遍历实现
     *
     * @param edgeTo 表示 edgeTo[i] 到 i 的边
     */
    private void internalBfs(List<Vertex> bfs, int[] edgeTo) {
        Arrays.fill(visited, false);

        Queue<Vertex> queue = new LinkedList<>();
        queue.offer(vertices[0]);
        visited[0] = true;
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            int vertexIndex = vertexToIndex.get(vertex);
            if (bfs != null) {
                bfs.add(vertex);
            }
            int[] edge = edges[vertexIndex];
            for (int i = 0; i < edge.length; i++) {
                if (edge[i] == -1) continue;
                if (!visited[i]) {
                    queue.offer(vertices[i]);
                    visited[i] = true;
                    if (edgeTo != null) {
                        edgeTo[i] = vertexIndex;
                    }
                }

            }
        }
    }

    /**
     * 最短路径
     */
    public List<Vertex> shortestPath(Vertex vertex) {
        List<Vertex> shortestPath = new ArrayList<>();
        int[] edgeTo = new int[vertices.length];
        Arrays.fill(edgeTo, -1);
        internalBfs(null, edgeTo);
        shortestPath.add(vertex);
        int index = vertexToIndex.get(vertex);
        while (edgeTo[index] != -1) {
            shortestPath.add(vertices[index = edgeTo[index]]);

        }
        Collections.reverse(shortestPath);
        return shortestPath;
    }

    /**
     * 有向图的拓扑排序
     *
     * @return 拓扑排序
     */
    public List<Vertex> topologySort() {
        // 度为 0 的顶点
        Queue<Vertex> zeroInDegreeQueue = new LinkedList<>();
        List<Vertex> topology = new ArrayList<>(vertices.length);

        Map<Vertex, Integer> handleVertexToDegree = new HashMap<>(vertexToDegree);

        // 先将所有入度为 0 的顶点加入队列
        for (Vertex vertex : vertices) {
            if (handleVertexToDegree.getOrDefault(vertex, 0) == 0) {
                zeroInDegreeQueue.offer(vertex);
            }
        }

        while (!zeroInDegreeQueue.isEmpty()) {
            Vertex vertex = zeroInDegreeQueue.poll();

            // 删除相邻边
            Set<Vertex> adjVertices = adjacentVertices.getOrDefault(vertex, Collections.emptySet());
            for (Vertex adjVertex : adjVertices) {
                int inDegree = handleVertexToDegree.getOrDefault(adjVertex, 0);
                inDegree = Math.max(0, inDegree - 1);
                handleVertexToDegree.put(adjVertex, inDegree);
                if (inDegree == 0) {
                    // 入队
                    zeroInDegreeQueue.offer(adjVertex);
                }
            }
            topology.add(vertex);
        }

        if (topology.size() != vertices.length) {
            // 存在环
            throw new IllegalStateException("有向图存在环");
        }

        return topology;
    }

}

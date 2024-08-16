package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleGraph {
    private int V; // Брой върхове
    private LinkedList<Integer>[] adj; // Списък на съседство

    // Конструктор
    public SimpleGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Добавяне на ребро в графа
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); // Тъй като графът е неориентиран
    }

    // BFS обхождане на графа, стартирайки от връх s
    void BFS(int s) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int n : adj[v]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        SimpleGraph g = new SimpleGraph(6);

        // Добавяне на ребра в графа
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(3, 5);

        System.out.println("BFS обхождане, стартирайки от връх 0:");
        g.BFS(0);
    }
}


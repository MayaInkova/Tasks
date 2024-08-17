import java.util.ArrayList;
import java.util.List;

// ориентиран граф, представен с adjacency list. Намраме  възможни пътища от възел start до възел end с помощта на DFS.

public class DFSSearch {

    static class Graph {
        private final int V;
        private final List<List<Integer>> adj;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int v, int w) {
            adj.get(v).add(w);
        }

        void dfs(int start, int end, boolean[] visited, List<Integer> path) {
            visited[start] = true;
            path.add(start);

            if (start == end) {
                System.out.println(path);
            } else {
                for (Integer neighbor : adj.get(start)) {
                    if (!visited[neighbor]) {
                        dfs(neighbor, end, visited, path);
                    }
                }
            }

            path.remove(path.size() - 1);
            visited[start] = false;
        }

        void findAllPaths(int start, int end) {
            boolean[] visited = new boolean[V];
            List<Integer> path = new ArrayList<>();
            dfs(start, end, visited, path);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int start = 2, end = 3;
        System.out.println("Всички пътища от " + start + " до " + end + ":");
        g.findAllPaths(start, end);
    }

}

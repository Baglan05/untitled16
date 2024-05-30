import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyGraph<Integer> graph = new MyGraph<>();

        Vertex<Integer> v1 = new Vertex<>(1);
        Vertex<Integer> v2 = new Vertex<>(2);
        Vertex<Integer> v3 = new Vertex<>(3);
        Vertex<Integer> v4 = new Vertex<>(4);
        Vertex<Integer> v5 = new Vertex<>(5);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        graph.addBidirectionalEdge(v1, v2, 2.0);
        graph.addBidirectionalEdge(v1, v3, 4.0);
        graph.addBidirectionalEdge(v2, v3, 1.0);
        graph.addBidirectionalEdge(v2, v4, 7.0);
        graph.addBidirectionalEdge(v3, v5, 3.0);
        graph.addBidirectionalEdge(v4, v5, 2.0);

        System.out.println("BFS starting from Vertex 1:");
        BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>();
        bfs.bfs(graph, v1);
        System.out.println();

        System.out.println("DFS starting from Vertex 1:");
        DepthFirstSearch<Integer> dfs = new DepthFirstSearch<>(graph, v1);
        for (Vertex<Integer> v : dfs.pathTo(v5)) {
            System.out.print(v.getData() + " ");
        }
        System.out.println();

        DijkstraSearch<Integer> dijkstra = new DijkstraSearch<>();
        dijkstra.dijkstra(graph, v1);
        System.out.println("Dijkstra's shortest path from Vertex 1 to Vertex 5:");
        List<Vertex<Integer>> path = dijkstra.getShortestPath(v5);
        path.forEach(vertex -> System.out.print(vertex.getData() + " "));
    }
}

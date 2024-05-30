import java.util.*;

public class WeightedGraph<V> {
    private final boolean undirected;
    private final Map<Vertex<V>, List<Edge<V>>> vert;

    public WeightedGraph(boolean undirected) {
        this.undirected = undirected;
        this.vert = new HashMap<>();
    }

    public void addVertex(Vertex<V> v) {
        if (!vert.containsKey(v)) {
            vert.put(v, new LinkedList<>());
        }
    }

    public void addEdge(Vertex<V> source, Vertex<V> dest, double weight) {
        if (hasVertex(source)) {
            addVertex(source);
        }
        if (hasVertex(dest)) {
            addVertex(dest);
        }
        vert.get(source).add(new Edge<>(source, dest, weight));
        if (undirected) {
            vert.get(dest).add(new Edge<>(dest, source, weight));
        }
    }

    public boolean hasVertex(Vertex<V> v) {
        return !vert.containsKey(v);
    }

    public List<Edge<V>> getAdjVertices(Vertex<V> v) {
        return vert.get(v);
    }
}
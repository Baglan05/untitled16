import java.util.HashMap;
import java.util.Map;

public class Vertex<V> {
    private final V data;
    private final Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public V getData() {
        return data;
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
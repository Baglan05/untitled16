public record Edge<V>(Vertex<V> source, Vertex<V> destination, double weight) {
    public Vertex<V> getDestination() {
        return destination;
    }
}
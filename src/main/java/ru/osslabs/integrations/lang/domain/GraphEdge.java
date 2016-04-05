package ru.osslabs.integrations.lang.domain;


import ru.osslabs.graph.Edge;

import java.util.Objects;

/**
 * Created by ikuchmin on 28.02.16.
 */
public class GraphEdge<V extends GraphVertex> implements Edge<V> {

    private final V source;
    private final V target;

    public GraphEdge(V source, V target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public V getSource() {
        return source;
    }

    @Override
    public V getTarget() {
        return target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GraphEdge)) return false;
        GraphEdge<?> graphEdge = (GraphEdge<?>) o;
        return Objects.equals(source, graphEdge.source) &&
                Objects.equals(target, graphEdge.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target);
    }
}

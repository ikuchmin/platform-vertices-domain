package ru.osslabs.integrations.lang.domain;


import lombok.Data;
import ru.osslabs.graph.Edge;

import java.util.Objects;

/**
 * Created by ikuchmin on 28.02.16.
 */
@Data
public class GraphEdge<V> implements Edge<V> {

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
}

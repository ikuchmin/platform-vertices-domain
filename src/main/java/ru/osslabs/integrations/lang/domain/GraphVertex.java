package ru.osslabs.integrations.lang.domain;

import java.util.Objects;

/**
 * Created by ikuchmin on 02.03.16.
 */
public class GraphVertex {
    private String name;

    public GraphVertex(String name) {
        Objects.requireNonNull(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GraphVertex)) return false;
        GraphVertex that = (GraphVertex) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "GraphVertex{" +
                "name='" + name + '\'' +
                '}';
    }
}

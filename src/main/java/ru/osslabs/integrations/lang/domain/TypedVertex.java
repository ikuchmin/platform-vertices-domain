package ru.osslabs.integrations.lang.domain;

import java.lang.reflect.Type;
import java.util.Objects;

/**
 * Created by ikuchmin on 16.03.16.
 */
public class TypedVertex extends GraphVertex {

    private final Type type;

    public TypedVertex(String name, Type type) {
        super(name);

        Objects.requireNonNull(type);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypedVertex)) return false;
        if (!super.equals(o)) return false;
        TypedVertex that = (TypedVertex) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "TypedVertex{" +
                "type=" + type +
                "} " + super.toString();
    }
}

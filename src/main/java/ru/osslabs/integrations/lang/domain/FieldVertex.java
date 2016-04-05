package ru.osslabs.integrations.lang.domain;

import java.lang.reflect.Type;
import java.util.Objects;

/**
 * Created by ikuchmin on 28.02.16.
 */
public class FieldVertex extends TypedVertex {

    private final GraphVertex objClass;

    public FieldVertex(String name, Type type, GraphVertex objClass) {
        super(name, type);

        Objects.requireNonNull(objClass);
        this.objClass = objClass;
    }

    public GraphVertex getObjClass() {
        return objClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FieldVertex)) return false;
        if (!super.equals(o)) return false;
        FieldVertex that = (FieldVertex) o;
        return Objects.equals(objClass, that.objClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), objClass);
    }

    @Override
    public String toString() {
        return "FieldVertex{" +
                "objClass=" + objClass +
                "} " + super.toString();
    }
}
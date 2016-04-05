package ru.osslabs.integrations.lang.domain;

/**
 * Created by ikuchmin on 10.03.16.
 */
public class ClassVertex extends GraphVertex {
    public ClassVertex(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "ClassVertex{} " + super.toString();
    }
}

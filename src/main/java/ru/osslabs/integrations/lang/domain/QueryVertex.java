package ru.osslabs.integrations.lang.domain;

import java.lang.reflect.Type;

/**
 * Created by ikuchmin on 02.03.16.
 */
public class QueryVertex extends TypedVertex {

    public QueryVertex(String name, Type type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "QueryVertex{} " + super.toString();
    }
}

package ru.osslabs.integrations.lang.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Comparator;

/**
 * Created by ikuchmin on 04.05.16.
 */
@Data
@EqualsAndHashCode
@ToString(callSuper = true)
public class IdCondition<T> implements Condition<T> {
    protected final T id;

    public IdCondition(T id) {
        if (id == null) throw new IllegalArgumentException("id shouldn't be null");

        this.id = id;
    }

    @Override
    public boolean test(T t) {
        return id.equals(t);
    }
}

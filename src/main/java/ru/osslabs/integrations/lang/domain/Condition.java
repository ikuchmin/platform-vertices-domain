package ru.osslabs.integrations.lang.domain;

import java.io.Serializable;
import java.util.function.Predicate;

/**
 * Created by ikuchmin on 04.05.16.
 */
public interface Condition<T> extends Predicate<T>, Serializable {
}

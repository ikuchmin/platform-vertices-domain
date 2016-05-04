package ru.osslabs.integrations.lang.domain;

/**
 * Created by ikuchmin on 04.05.16.
 */
public class MatchCondition<T> implements Condition<T> {

    @Override
    public boolean test(T t) {
        return false;
    }
}

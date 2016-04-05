package ru.osslabs.integrations.lang.domain;

import java.util.Objects;

/**
 * Created by ikuchmin on 28.02.16.
 */
public abstract class ComplexPlatformType implements PlatformType {
    private final String supplyTypeName;

    public ComplexPlatformType(String supplyTypeName) {
        Objects.requireNonNull(supplyTypeName);
        this.supplyTypeName = supplyTypeName;
    }

    public String getSupplyTypeName() {
        return supplyTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexPlatformType)) return false;
        ComplexPlatformType that = (ComplexPlatformType) o;
        return Objects.equals(supplyTypeName, that.supplyTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplyTypeName);
    }

    @Override
    public String toString() {
        return "ComplexPlatformType{" +
                "supplyTypeName='" + supplyTypeName + '\'' +
                '}';
    }
}

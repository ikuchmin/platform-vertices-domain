package ru.osslabs.integrations.lang.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * Created by ikuchmin on 04.05.16.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BuilderVertex extends UUIDGraphVertex {
    protected final List<Condition<?>> conditions;

    public BuilderVertex(String name) {
        super(name);
        this.conditions = Collections.emptyList();
    }

    public BuilderVertex(String name, UUID uuid) {
        super(name, uuid);
        this.conditions = Collections.emptyList();
    }

    public BuilderVertex(String name, List<Condition<?>> conditions) {
        super(name);
        this.conditions = conditions;
    }

    public BuilderVertex(String name, UUID uuid, List<Condition<?>> conditions) {
        super(name, uuid);
        this.conditions = conditions;
    }
}

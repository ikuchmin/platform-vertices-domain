package ru.osslabs.integrations.lang.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.UUID;

/**
 * Created by ikuchmin on 05.04.16.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UUIDGraphVertex extends GraphVertex {
    protected final UUID uuid;

    public UUIDGraphVertex(String name) {
        super(name);
        this.uuid = UUID.randomUUID();
    }

    public UUIDGraphVertex(String name, UUID uuid) {
        super(name);
        this.uuid = uuid;
    }
}

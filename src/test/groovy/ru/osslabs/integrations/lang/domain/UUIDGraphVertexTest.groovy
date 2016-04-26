package ru.osslabs.integrations.lang.domain

import spock.lang.Specification

/**
 * Created by ikuchmin on 06.04.16.
 */
class UUIDGraphVertexTest extends Specification {

    def "identity objects"() {
        given:
        def uuid = UUID.randomUUID()

        expect:
        new UUIDGraphVertex('v1') != new UUIDGraphVertex('v1')
        new UUIDGraphVertex('v1', uuid) == new UUIDGraphVertex('v1', uuid)
    }
}

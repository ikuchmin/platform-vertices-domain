package ru.osslabs.integrations.lang.domain

import spock.lang.Specification

/**
 * Created by ikuchmin on 04.05.16.
 */
class IdConditionTest extends Specification {

    def "if constructor args equals null that it should throw IllegalArgumentException"() {
        when:
        new IdCondition(null)

        then:
        thrown IllegalArgumentException
    }

    def "if test method args equals null that it should throw NPE"() {
        expect:
        cond.test(null) == r

        where:
        cond                            | r
        new IdCondition<String>("str")  | false
        new IdCondition<Integer>(42)    | false
    }

    def "if this and that object in method test equals that it should return true otherwise else"() {
        expect:
        cond.test(arg) == r

        where:
        cond                            | arg   | r
        new IdCondition<String>("str")  | "str" | true
        new IdCondition<Integer>(42)    | 42    | true
        new IdCondition<Integer>(42)    | 18    | false
        new IdCondition<Integer>(42)    | "str" | false
    }
}

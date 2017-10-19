package com.model.entity

import spock.lang.Specification

import javax.persistence.Persistence

class GroovyUserSpecification extends Specification {
    def 'Try To Persist User'() {
        expect:
        def factory = Persistence.createEntityManagerFactory('my-app')
        def em = factory.createEntityManager()
        def user = new GroovyUser(
            name: 'Peter',
            age: 18,
            sex: GroovyUser.Sex.M
        )
        printf "before persist - user: $user\n"
        em.transaction.begin()
        em.persist(user)
        em.transaction.commit()
        printf "after persist - user: $user\n"
    }
}

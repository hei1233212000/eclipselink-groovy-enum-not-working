package com.model.entity

import spock.lang.Specification

import javax.persistence.Persistence

class JavaUserSpecification extends Specification {
    def 'Try To Persist User'() {
        expect:
        def factory = Persistence.createEntityManagerFactory('my-app')
        def em = factory.createEntityManager()
        def user = new JavaUser(
            name: 'Peter',
            age: 18,
            sex: JavaUser.Sex.M
        )
        printf "before persist - user: $user\n"
        em.transaction.begin()
        em.persist(user)
        em.transaction.commit()
        printf "after persist - user: $user\n"
    }
}

package com.model.entity

import groovy.transform.ToString

import javax.persistence.*

@Entity
@Table(name = 'GROOVY_USER')
@ToString(includeNames = true)
class GroovyUser implements Serializable {
    private static final Long serialVersionUID = 1L

    enum Sex {
        M, F
    }

    @Id
    @GeneratedValue
    @Column(name = 'ID')
    Long id

    @Column(name = 'NAME')
    String name

    @Column(name = 'AGE')
    Integer age

    @Column(name = 'SEX')
    @Convert(converter = SexToStringConverter)
    Sex sex

    @Converter
    static class SexToStringConverter implements AttributeConverter<Sex, String> {
        private static final String STRING_VALUE_MALE = 'Male'
        private static final String STRING_VALUE_FEMALE = 'Female'

        @Override
        String convertToDatabaseColumn(Sex sex) {
            switch (sex) {
                case Sex.M:
                    return STRING_VALUE_MALE
                case Sex.F:
                    return STRING_VALUE_FEMALE
            }
        }

        @Override
        Sex convertToEntityAttribute(String s) {
            switch (s) {
                case STRING_VALUE_MALE:
                    return Sex.M
                case STRING_VALUE_FEMALE:
                    return Sex.F
            }
        }
    }
}

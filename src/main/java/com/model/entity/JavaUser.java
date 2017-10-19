package com.model.entity;

import com.google.common.base.MoreObjects;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "JAVA_USER")
public class JavaUser implements Serializable {
    private static final Long serialVersionUID = 1L;

    public enum Sex {
        M, F
    }

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "SEX")
    @Convert(converter = SexToStringConverter.class)
    private Sex sex;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("age", age)
                .add("sex", sex)
                .toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Converter
    public static class SexToStringConverter implements AttributeConverter<Sex, String> {
        private static final String STRING_VALUE_MALE = "Male";
        private static final String STRING_VALUE_FEMALE = "Female";

        @Override
        public String convertToDatabaseColumn(Sex sex) {
            switch(sex) {
                case M:
                    return STRING_VALUE_MALE;
                case F:
                    return STRING_VALUE_FEMALE;
                default:
                    throw new IllegalArgumentException("unknown sex: " + sex);
            }
        }

        @Override
        public Sex convertToEntityAttribute(String s) {
            switch(s) {
                case STRING_VALUE_MALE:
                    return Sex.M;
                case STRING_VALUE_FEMALE:
                    return Sex.F;
                default:
                    throw new IllegalArgumentException("unknown sex: " + s);
            }
        }
    }
}

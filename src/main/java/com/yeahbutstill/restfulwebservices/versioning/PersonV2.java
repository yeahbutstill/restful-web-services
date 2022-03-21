package com.yeahbutstill.restfulwebservices.versioning;

import java.util.Objects;

public class PersonV2 {

    private Name name;

    public PersonV2() {
    }

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonV2 personV2 = (PersonV2) o;
        return Objects.equals(name, personV2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + name +
                '}';
    }
}

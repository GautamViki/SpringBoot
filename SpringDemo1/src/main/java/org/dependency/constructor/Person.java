package org.dependency.constructor;

public class Person {
    private String name;
    private Integer id;
    private Certificate certificate;

    public Person(String name, Integer id, Certificate certificate) {
        this.name = name;
        this.id = id;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", certificate=" + certificate +
                '}';
    }
}

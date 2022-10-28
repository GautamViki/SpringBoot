package org.dependency.constructor;

public class Certificate {
    private String name;
    private Integer duration;

    public Certificate(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}

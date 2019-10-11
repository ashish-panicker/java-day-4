package com.sort;

public class Person implements Comparable<Person>{

    private int id;
    private String name;
    private String email;


    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Person o) {
        return id - o.getId();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + email;
    }
}

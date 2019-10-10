package com.students.data;

public class Student implements Comparable<Student>{

    private int id;
    private String name;
    private String email;

    public Student(){

    }

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Email: " + email;
    }

    @Override
    public int compareTo(Student o) {
        if(id > o.getId())
            return 1;
        else
            return -1;
    }
}

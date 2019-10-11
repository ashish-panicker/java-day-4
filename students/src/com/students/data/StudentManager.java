package com.students.data;

import java.util.*;

public class StudentManager {

    private List<Student> students;
    Scanner s;
    private int id = 0;

    public StudentManager() {
        this.students = new LinkedList<>();
    }

    public Student newStudent(){
        s = new Scanner(System.in);
        System.out.print("\nName: ");
        String name= "";
        if(s.hasNext())
            name = s.next();
        String email = "";
        System.out.print("\nEmail: ");
        if(s.hasNext())
            email = s.next();
        ++id;

        return new Student(id, name, email);
    }

    public void add(Student s){
        if(students.add(s))
            System.out.printf("Success! %s with id %d added into the list.",s.getName(), s.getId());
        else
            System.out.printf("Error! %s with id %d was not added into the list.", s.getName(), s.getId());
    }

    public void printAll(){
        for (Student s :
                students) {
            System.out.println(s);
        }
    }

    public void sortbyName(){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void sortbyEmail(){
        Collections.sort(students, new EmComparator());
    }

    public void sortbyId(){
        Collections.sort(students);
    }

    class EmComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getEmail().compareTo(o2.getEmail());
        }
    }

}

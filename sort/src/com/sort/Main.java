package com.sort;

import java.util.*;

public class Main {

    class NameSort implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public void peopleList(){
        List<Person> people = new LinkedList<>();

        people.add(new Person(3, "Ashish", "ashish@gmail.com"));
        people.add(new Person(2, "Sajal", "sajal@gmail.com"));
        people.add(new Person(1, "Gopal", "gopal@gmail.com"));


        System.out.printf("There are %d elements in the list.\n",people.size());

        for (Person p  : people){
            System.out.println(p);
        }

        Collections.sort(people);

        System.out.println("After default sorting...");

        for (Person p  : people){
            System.out.println(p);
        }

        Collections.sort(people, new NameSort());
        System.out.println("After sorting by name...");
        for (Person p  : people){
            System.out.println(p);
        }


        Collections.sort(people, new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
    }

    public void nameSet(){
        Set<String> names = new LinkedHashSet<>();
        names.add("Sajal");
        names.add("Sajal");
        names.add("Ashish");
        names.add("Gopal");

        System.out.println(names);
    }

    public void personMap(){
        Map<String, Person> map = new LinkedHashMap<>();
        map.put("110",new Person(3, "Ashish", "ashish@gmail.com") );
        map.put("110",new Person(3, "Ashish", "ashish@gmail.com") );

        System.out.println("Keys : " + map.keySet());
        System.out.println("Values : "+map.values());
        System.out.println(map);
    }

    public static void main(String [] a){
        Main m = new Main();
        m.personMap();


    }
}

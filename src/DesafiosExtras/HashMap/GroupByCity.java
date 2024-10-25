package DesafiosExtras.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByCity {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", "New York"),
                new Person("Bob", "Lost Angeles"),
                new Person("Charlie", "New York")
        );

        Map<String, List<String>> cityMap = new HashMap<>();
        for(Person person : people) {
            cityMap.putIfAbsent(person.city, new ArrayList<>());
            cityMap.get(person.city).add(person.name);
        }

        System.out.println(cityMap);
    }

    static class Person {
        String name;
        String city;

        Person(String name, String city) {
            this.name = name;
            this.city = city;
        }
    }
}

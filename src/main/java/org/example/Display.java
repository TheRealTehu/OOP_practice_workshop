package org.example;

import java.util.List;

public class Display {
    public static void printMessage(String message){
        System.out.println(message);
    }

    public static void printPersonList(List<Person> personList){
        for (Person person: personList) {
            System.out.println(person.toString());
        }
    }
}

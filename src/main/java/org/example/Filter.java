package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter extends PhoneApp{
    private List<Person> phoneBook;
    private int count;

    public Filter(List<Person> phoneBook) {
        super("Filter", "FilterDev", "0.34.1.");
        this.phoneBook = phoneBook;
    }

    public List<Person> getPersonsFromGivenWorkplace(String workplace){
        List<Person> peopleFromGivenWorkplace = new ArrayList<>();
        for (Person person: phoneBook) {
            if(person.getWorkPlace().equals(workplace)){
                peopleFromGivenWorkplace.add(person);
            }
        }
        return peopleFromGivenWorkplace;
    }

    public List<Person> getPersonsOlderThanGivenAge(int age){
        List<Person> peopleOlderThanGivenAge = new ArrayList<>();
        for (Person person: phoneBook) {
            if(person.getAge() > age){
                peopleOlderThanGivenAge.add(person);
            }
        }
        return peopleOlderThanGivenAge;
    }

    public List<Person> getPersonsYoungerThanGivenAge(int age){
        List<Person> peopleYoungerThanGivenAge = new ArrayList<>();
        for (Person person: phoneBook) {
            if(person.getAge() < age){
                peopleYoungerThanGivenAge.add(person);
            }
        }
        return peopleYoungerThanGivenAge;
    }

    public List<Person> getPersonsInAgeRange(int minAge, int maxAge){
        List<Person> peopleInAgeRange = new ArrayList<>();
        for (Person person: phoneBook) {
            if(person.getAge() < maxAge && person.getAge() > minAge){
                peopleInAgeRange.add(person);
            }
        }
        return peopleInAgeRange;
    }
}

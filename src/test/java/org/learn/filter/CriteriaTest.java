package org.learn.filter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CriteriaTest {
    @Test
    @DisplayName("criteria test")
    public void meetCriteriaTest() {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOfFemale = new OrCriteria(female, single);

        System.out.println("*****Male: ");
        printPersons(male.meetCriteria(persons));
        System.out.println("*****Female: ");
        printPersons(female.meetCriteria(persons));
        System.out.println("*****Single: ");
        printPersons(single.meetCriteria(persons));
        System.out.println("*****SingleMale: ");
        printPersons(singleMale.meetCriteria(persons));
        System.out.println("*****singleOfFemale: ");
        printPersons(singleOfFemale.meetCriteria(persons));
    }

    private void printPersons(List<Person> list) {
        for (Person person : list) {
            System.out.println(person.toString());
        }
    }
}

package org.learn.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femaleList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femaleList.add(person);
            }
        }
        return femaleList;
    }
}

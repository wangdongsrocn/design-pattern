package org.learn.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singleList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singleList.add(person);
            }
        }
        return singleList;
    }
}

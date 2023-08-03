package org.learn.filter;

import java.util.List;

public class OrCriteria extends Relation implements Criteria {
    protected OrCriteria(Criteria criteria, Criteria otherCriteria) {
        super(criteria, otherCriteria);
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaList = criteria.meetCriteria(personList);
        List<Person> otherCriteriaList = otherCriteria.meetCriteria(personList);
        for (Person person : otherCriteriaList) {
            if (!firstCriteriaList.contains(person)) {
                firstCriteriaList.add(person);
            }
        }
        return firstCriteriaList;
    }
}

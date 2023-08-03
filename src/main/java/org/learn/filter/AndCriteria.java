package org.learn.filter;

import java.util.List;

public class AndCriteria extends Relation implements Criteria {
    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        super(criteria, otherCriteria);
    }
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaList = this.criteria.meetCriteria(personList);
        return this.otherCriteria.meetCriteria(firstCriteriaList);
    }
}

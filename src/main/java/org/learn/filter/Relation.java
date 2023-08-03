package org.learn.filter;

public abstract class Relation {
    protected Criteria criteria;
    protected Criteria otherCriteria;

    protected Relation(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
}

package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.List;

public class accreditedtowninfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public accreditedtowninfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAccreditedtownidIsNull() {
            addCriterion("AccreditedTownID is null");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidIsNotNull() {
            addCriterion("AccreditedTownID is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidEqualTo(Integer value) {
            addCriterion("AccreditedTownID =", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidNotEqualTo(Integer value) {
            addCriterion("AccreditedTownID <>", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidGreaterThan(Integer value) {
            addCriterion("AccreditedTownID >", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccreditedTownID >=", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidLessThan(Integer value) {
            addCriterion("AccreditedTownID <", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidLessThanOrEqualTo(Integer value) {
            addCriterion("AccreditedTownID <=", value, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidIn(List<Integer> values) {
            addCriterion("AccreditedTownID in", values, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidNotIn(List<Integer> values) {
            addCriterion("AccreditedTownID not in", values, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedTownID between", value1, value2, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedTownID not between", value1, value2, "accreditedtownid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidIsNull() {
            addCriterion("AccreditedCountryID is null");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidIsNotNull() {
            addCriterion("AccreditedCountryID is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidEqualTo(Integer value) {
            addCriterion("AccreditedCountryID =", value, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidNotEqualTo(Integer value) {
            addCriterion("AccreditedCountryID <>", value, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidGreaterThan(Integer value) {
            addCriterion("AccreditedCountryID >", value, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccreditedCountryID >=", value, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidLessThan(Integer value) {
            addCriterion("AccreditedCountryID <", value, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidLessThanOrEqualTo(Integer value) {
            addCriterion("AccreditedCountryID <=", value, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidIn(List<Integer> values) {
            addCriterion("AccreditedCountryID in", values, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidNotIn(List<Integer> values) {
            addCriterion("AccreditedCountryID not in", values, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedCountryID between", value1, value2, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountryidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccreditedCountryID not between", value1, value2, "accreditedcountryid");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameIsNull() {
            addCriterion("AccreditedTownName is null");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameIsNotNull() {
            addCriterion("AccreditedTownName is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameEqualTo(String value) {
            addCriterion("AccreditedTownName =", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameNotEqualTo(String value) {
            addCriterion("AccreditedTownName <>", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameGreaterThan(String value) {
            addCriterion("AccreditedTownName >", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameGreaterThanOrEqualTo(String value) {
            addCriterion("AccreditedTownName >=", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameLessThan(String value) {
            addCriterion("AccreditedTownName <", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameLessThanOrEqualTo(String value) {
            addCriterion("AccreditedTownName <=", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameLike(String value) {
            addCriterion("AccreditedTownName like", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameNotLike(String value) {
            addCriterion("AccreditedTownName not like", value, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameIn(List<String> values) {
            addCriterion("AccreditedTownName in", values, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameNotIn(List<String> values) {
            addCriterion("AccreditedTownName not in", values, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameBetween(String value1, String value2) {
            addCriterion("AccreditedTownName between", value1, value2, "accreditedtownname");
            return (Criteria) this;
        }

        public Criteria andAccreditedtownnameNotBetween(String value1, String value2) {
            addCriterion("AccreditedTownName not between", value1, value2, "accreditedtownname");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
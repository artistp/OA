package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.List;

public class accreditedcountryinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public accreditedcountryinfoExample() {
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

        public Criteria andAccreditedcountrynameIsNull() {
            addCriterion("AccreditedCountryName is null");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameIsNotNull() {
            addCriterion("AccreditedCountryName is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameEqualTo(String value) {
            addCriterion("AccreditedCountryName =", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameNotEqualTo(String value) {
            addCriterion("AccreditedCountryName <>", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameGreaterThan(String value) {
            addCriterion("AccreditedCountryName >", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameGreaterThanOrEqualTo(String value) {
            addCriterion("AccreditedCountryName >=", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameLessThan(String value) {
            addCriterion("AccreditedCountryName <", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameLessThanOrEqualTo(String value) {
            addCriterion("AccreditedCountryName <=", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameLike(String value) {
            addCriterion("AccreditedCountryName like", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameNotLike(String value) {
            addCriterion("AccreditedCountryName not like", value, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameIn(List<String> values) {
            addCriterion("AccreditedCountryName in", values, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameNotIn(List<String> values) {
            addCriterion("AccreditedCountryName not in", values, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameBetween(String value1, String value2) {
            addCriterion("AccreditedCountryName between", value1, value2, "accreditedcountryname");
            return (Criteria) this;
        }

        public Criteria andAccreditedcountrynameNotBetween(String value1, String value2) {
            addCriterion("AccreditedCountryName not between", value1, value2, "accreditedcountryname");
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
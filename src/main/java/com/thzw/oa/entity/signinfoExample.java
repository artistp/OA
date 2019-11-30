package com.thzw.oa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class signinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public signinfoExample() {
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

        public Criteria andSignidIsNull() {
            addCriterion("SignID is null");
            return (Criteria) this;
        }

        public Criteria andSignidIsNotNull() {
            addCriterion("SignID is not null");
            return (Criteria) this;
        }

        public Criteria andSignidEqualTo(Integer value) {
            addCriterion("SignID =", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotEqualTo(Integer value) {
            addCriterion("SignID <>", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThan(Integer value) {
            addCriterion("SignID >", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SignID >=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThan(Integer value) {
            addCriterion("SignID <", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidLessThanOrEqualTo(Integer value) {
            addCriterion("SignID <=", value, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidIn(List<Integer> values) {
            addCriterion("SignID in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotIn(List<Integer> values) {
            addCriterion("SignID not in", values, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidBetween(Integer value1, Integer value2) {
            addCriterion("SignID between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andSignidNotBetween(Integer value1, Integer value2) {
            addCriterion("SignID not between", value1, value2, "signid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeIsNull() {
            addCriterion("SignDateTime is null");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeIsNotNull() {
            addCriterion("SignDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeEqualTo(Date value) {
            addCriterion("SignDateTime =", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeNotEqualTo(Date value) {
            addCriterion("SignDateTime <>", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeGreaterThan(Date value) {
            addCriterion("SignDateTime >", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SignDateTime >=", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeLessThan(Date value) {
            addCriterion("SignDateTime <", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeLessThanOrEqualTo(Date value) {
            addCriterion("SignDateTime <=", value, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeIn(List<Date> values) {
            addCriterion("SignDateTime in", values, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeNotIn(List<Date> values) {
            addCriterion("SignDateTime not in", values, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeBetween(Date value1, Date value2) {
            addCriterion("SignDateTime between", value1, value2, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andSigndatetimeNotBetween(Date value1, Date value2) {
            addCriterion("SignDateTime not between", value1, value2, "signdatetime");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("Latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("Latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("Latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("Latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("Latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("Latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("Latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("Latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("Latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("Latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("Latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("Latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("Latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("Longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("Longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("Longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("Longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("Longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("Longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("Longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("Longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("Longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("Longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("Longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("Longitude not between", value1, value2, "longitude");
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